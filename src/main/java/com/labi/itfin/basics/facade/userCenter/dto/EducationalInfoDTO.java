package com.labi.itfin.basics.facade.userCenter.dto;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 学历信息结构体
 */

@Data
public class EducationalInfoDTO implements Serializable {
    private static final long serialVersionUID = -7060798151334407892L;

    private String uniName;                     //学校名称
    private String uniDepName;                  //院系名称
    private String uniProf;                     //专业
    private Integer uniRec;                     //学历   高中：1 专科：2  本科：3  硕士 ：4 博士：5
    private Date inUniDate;                     //入学时间
    private Integer uniValiStatus;              //教育经历验证状态  成功：1  失败：-1  待处理：0
    private String uniValiMsg;                  //验证信息
    private Date createDate;                    //创建时间
    private Date UpdateDate;                    //更新时间
    private List<UniValiHisDTO> uniValiHis;        //验证历史

}
