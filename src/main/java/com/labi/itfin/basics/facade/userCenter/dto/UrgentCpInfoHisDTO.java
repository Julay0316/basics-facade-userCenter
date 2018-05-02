package com.labi.itfin.basics.facade.userCenter.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 联系人修改轨迹实体
 */

@Data
public class UrgentCpInfoHisDTO implements Serializable {
    private static final long serialVersionUID = 8375057834730832821L;

    private String contactName;                    //联系人姓名
    private String contactPhone;                   //联系人电话
    private String relationship;                   //与本人关系
    private Date UpdateDate;                       //更新时间
}
