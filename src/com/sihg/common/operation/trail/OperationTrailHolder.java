package com.sihg.common.operation.trail;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.sihg.common.operation.ent.OperationEntity;

/**
 * 用于保存和记录操作链 为“撤销操作提供服务”。由于实体依照不用的项目有所不同，所以只做分发
 */
public class OperationTrailHolder {
	/**
	 * 默认操作链的名字，<br>
	 * ※注意※获取操作链传入的名字是null或者空字符串的时候，将会获取此链
	 */
	public static final String DEFAULT_TRAIL_NAME = "default";
	/** 带有名字的多个操作链 */
	private static final Map<String, List<OperationEntity>> trails = new HashMap<String, List<OperationEntity>>();
	/** 多个操作链的游标 */
	private static final Map<String, MakerEntity> trailMarkers = new HashMap<String, MakerEntity>();

	/**
	 * 获取默认的操作链
	 * 
	 * @return
	 */
	public static List<OperationEntity> getTrail() {
		return getTrail(DEFAULT_TRAIL_NAME);
	}

	/**
	 * 按照名字获取某个操作链，找不到对应调用链的时候将会返回null
	 * 
	 * @param trailName
	 * @return
	 */
	public static List<OperationEntity> getTrail(String trailName) {
		return getTrail(trailName, false);
	}

	/**
	 * 按照名字获取某个操作链。如果获取不到，依照参数决定是否创建此对应操作链
	 * 
	 * @param trailName
	 * @param withCreation
	 *          如果找不到对应的操作链，是否创建以此为名字的操作链
	 * @return 能照到的对应的操作链。当找不到对应操作链且withCreation为false的时候将会返回null。
	 */
	public static List<OperationEntity> getTrail(String trailName, boolean withCreation) {
		List<OperationEntity> result = null;
		if (trailName == null || trailName == "") {
			trailName = DEFAULT_TRAIL_NAME;
		}
		result = trails.get(trailName);
		if (withCreation && result == null) {
			result = new LinkedList<OperationEntity>();
			trailMarkers.put(trailName, new MakerEntity(result));
		}
		return result;
	}

	public static int getMarkerIndex() {
		return getMarkerIndex(DEFAULT_TRAIL_NAME);
	}

	public static int getMarkerIndex(String trailName) {
		int result = -1;
		List<OperationEntity> trail = getTrail(trailName);
		MakerEntity me = trailMarkers.get(trailName);
		if (trail != null && me != null) {
			result = me.getCurrent();
		}
		return result;
	}

	/**
	 * 获取默认操作链当前位置的上一个操作，并将游标移动到此位置；
	 * 
	 * @return 下列情况将会返回null值：<br>
	 *         1 默认操作链未初始化<br>
	 *         2 默认操作链上已经没有上一步操作了。
	 */
	public static OperationEntity getLast() {
		OperationEntity result = null;
		List<OperationEntity> trail = getTrail();
		int index = getMarkerIndex();
		if (trail == null || index < 1) {
			return null;
		}

		// TODO

		return result;
	};

	public static void main(String[] args) {
		Integer i = new Integer(2);
		Integer j = new Integer(2);

		System.out.println("i == j:[" + (i == j) + "]");
		System.out.println("i.equals(j):[" + (i.equals(j)) + "]");
	}

	/**
	 * 游标实体类，外部应该是用不着
	 */
	private static class MakerEntity {
		private int last = 0;
		private int current = 0;
		private final List<OperationEntity> trail;

		public MakerEntity(List<OperationEntity> trail) {
			super();
			this.trail = trail;
		}

		public int getLast() {
			return last;
		}

		public int getCurrent() {
			return current;
		}

		public boolean canGetBack() {
			return current > 0;
		}

		public boolean canGetForward() {
			return current < trail.size() - 1;
		}

		/**
		 * 设置当前游标的位置。<br>
		 * 设置成功的时候将返回true。当游标的位置无法被设置（过大或者过小时）将会返回false。
		 * 
		 * @param current
		 *          希望设置的游标的位置。
		 * @return 游标的位置不合法的时候，返回false 并且不作任何操作。
		 */
		public boolean setCurrent(int current) {
			boolean result = true;
			if (current < 0) {
				result = false;
				current = 0;
			}
			if (current > trail.size() - 1) {
				result = false;
				current = trail.size() - 1;
			}
			if (result) {
				last = this.current;
				this.current = current;
			}
			return result;
		}

		public boolean back() {
			return back(1);
		}

		public boolean back(int steps) {
			return setCurrent(getCurrent() - steps);
		}

		public boolean forward() {
			return forward(1);
		}

		public boolean forward(int steps) {
			return setCurrent(getCurrent() + steps);
		}

		public boolean to(int index) {
			return setCurrent(index);
		}
	}
}
