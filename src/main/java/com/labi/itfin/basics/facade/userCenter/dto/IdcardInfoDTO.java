package com.labi.itfin.basics.facade.userCenter.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 身份证信息结构体
 */

@Data
public class IdcardInfoDTO implements Serializable {
    private static final long serialVersionUID = -7102661443251969718L;

    private String realName;                                  //真实姓名
    private String idcardNo;                                  //身份证号码
    private Integer idcardValiStatus;                         //身份证验证状态 成功：1  失败：-1  待处理：0
    private String idcardValiMsg;                             //身份证验证信息
    private String idcardLocus;                               //身份证所在地区
    private String idcardLocusDetail;                         //身份证所在地详情
    private Date idcardTerm;                                  //证件有效期结束日期
    private List<IdcardValiHisDTO> idcardValiHis;             //证件校验历史
}
