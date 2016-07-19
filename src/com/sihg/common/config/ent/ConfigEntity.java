package com.sihg.common.config.ent;

import java.util.List;

/**
 * 配置文件管理器的主要实体
 */
public class ConfigEntity {

  /** 默认的字符串型的键 */
  private String key = null;

  /** 默认的字符串型的value */
  private String value = null;

  /** 值的数据类型是什么 */
  private String type = null;

  /** 配置项的名字，可以加国际化 */
  private String name = null;

  /** 配置项的说明文字 */
  private String description = null;
  /** 输入方式 比如配置项在修改的时候是使用文本框还是滑块还是下拉列表还是单选复选按钮 */

  private String inputType = null;
  /** 选项值的最小值 */

  private long minValue = Long.MIN_VALUE;
  /** 选项值的最大值 */

  private long maxValue = Long.MAX_VALUE;

  /** 可选值 */
  private List<?> options = null;

  /** 是否为掩码 */
  private boolean isMask = false;

  /** 掩码说明列表 */
  private List<MaskDescEntity> maskDescList = null;

  public ConfigEntity() {
    super();
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getInputType() {
    return inputType;
  }

  public void setInputType(String inputType) {
    this.inputType = inputType;
  }

  public long getMinValue() {
    return minValue;
  }

  public void setMinValue(long minValue) {
    this.minValue = minValue;
  }

  public long getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(long maxValue) {
    this.maxValue = maxValue;
  }

  public List<?> getOptions() {
    return options;
  }

  public void setOptions(List<?> options) {
    this.options = options;
  }

  public boolean isMask() {
    return isMask;
  }

  public void setMask(boolean isMask) {
    this.isMask = isMask;
  }

  public List<MaskDescEntity> getMaskDescList() {
    return maskDescList;
  }

  public void setMaskDescList(List<MaskDescEntity> maskDescList) {
    this.maskDescList = maskDescList;
  }
}
