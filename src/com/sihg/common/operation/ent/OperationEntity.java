package com.sihg.common.operation.ent;

/**
 * OperationTrailHolder中使用到的基本
 */
public class OperationEntity {
  private String name;
  private Object value;
  private String valueStr;
  private String operation;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public String getValueStr() {
    return valueStr;
  }

  public void setValueStr(String valueStr) {
    this.valueStr = valueStr;
  }

  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }
}
