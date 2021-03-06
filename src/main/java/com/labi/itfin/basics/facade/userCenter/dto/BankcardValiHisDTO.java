package com.labi.itfin.basics.facade.userCenter.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 银行卡变更历史集合
 */
@Data
public class BankcardValiHisDTO implements Serializable {
    private static final long serialVersionUID = -7065419990466475635L;

    private String belongedVankcard;                     //银行卡的所属银行,如工行招行等
    private Integer bindStatus;                          //绑卡状态
    private String bindMsg;                              //绑卡信息
    private Integer openaccAddr;                         //开户行所在地  地址表外键
    private String cardNo;                               //银行卡号
    private String reservePhone;                         //预留手机号码
    private Date updateDate;                             //修改时间
}
