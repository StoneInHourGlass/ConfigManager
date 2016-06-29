package com.sihg.common.config.entity;

/**
 * 掩码位说明实体<br>
 * 用来表示某一个掩码位的位号和说明等信息<br>
 * TODO 目前没有增加set方法 如果真有需要的话 再增加
 */
public class MaskDescEntity {
  /** 掩码所在位 */
  private int bit;
  /** 此掩码位的名字 */
  private String name;
  /** 此掩码位的描述 */
  private String description;

  /**
   * 按照参数列表构造一个掩码位说明实体
   * 
   * @param bit
   *          第几位
   * @param name
   *          名字
   * @param description
   *          描述
   */
  public MaskDescEntity(int bit, String name, String description) {
    super();
    this.bit = bit;
    this.name = name;
    this.description = description;
  }

  public int getBit() {
    return bit;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

}
