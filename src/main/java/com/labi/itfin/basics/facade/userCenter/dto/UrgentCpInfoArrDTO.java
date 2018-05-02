package com.labi.itfin.basics.facade.userCenter.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 常用联系人实体
 */
@Data
public class UrgentCpInfoArrDTO implements Serializable {
    private static final long serialVersionUID = 8418688403720705403L;

    private String contactName;                    //联系人姓名
    private String contactPhone;                   //联系人电话
    private String relationship;                   //与本人关系

    private List<UrgentCpInfoHisDTO> urgentCpInfo; //联系人修改历史
}
