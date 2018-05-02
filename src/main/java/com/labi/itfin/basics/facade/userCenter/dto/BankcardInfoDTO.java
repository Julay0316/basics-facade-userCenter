package com.labi.itfin.basics.facade.userCenter.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 银行卡实体
 */

@Data
public class BankcardInfoDTO implements Serializable {
    private static final long serialVersionUID = 1856410767997819051L;

    private String card_no;                                  //银行卡号
    private List<BankcardInfoArrDTO> bankcardInfoArr;        //银行卡集合信息结构体
}
