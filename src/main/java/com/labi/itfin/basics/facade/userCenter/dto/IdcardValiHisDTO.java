package com.labi.itfin.basics.facade.userCenter.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 身份证校验轨迹实体
 */

@Data
public class IdcardValiHisDTO implements Serializable {
    private static final long serialVersionUID = 8321858260937863905L;


    private  String realName ;                                //真实姓名 private String realName;                                  //真实姓名
    private String idcardNo;                                  //身份证号码
    private Integer idcardValiStatus;                         //身份证验证状态 成功：1  失败：-1  待处理：0
    private String idcardValiMsg;                             //身份证验证信息
    private String idcardLocus;                               //身份证所在地区
    private String idcardLocusDetail;                         //身份证所在地详情
    private Date idcardTerm;                                  //证件有效期结束日期
}
