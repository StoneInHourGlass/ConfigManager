package com.sihg.common.operation.trail;

import java.util.List;
import java.util.Map;

import com.sihg.common.operation.ent.OperationEntity;

/**
 * 用于保存和记录操作链 为“撤销操作提供服务”。由于实体
 */
public class OperationTrailHolder {
  private Map<String, List<OperationEntity>> trails = null;
}
