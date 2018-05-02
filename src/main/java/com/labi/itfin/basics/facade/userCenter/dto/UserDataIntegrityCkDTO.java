package com.labi.itfin.basics.facade.userCenter.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class UserDataIntegrityCkDTO implements Serializable {
    private static final long serialVersionUID = 5751976610341628746L;

    private Long pid;                        //用户passport唯一标识

    /**
     * 下标0：实名认证
     * 下标1：个人信息认证
     * 下标2：运营商授权
     * 下标3：银行卡认证
     * 下标4：学历或职业证书认证
     */
    private Integer valiItem;                //验证项 0为未完善，1为已完善  默认值为0
    private Date createDate;                 //创建时间
    private Date updateDate;                 //更新时间
    private Integer version;                 //版本号  用来做乐观锁控制

}

