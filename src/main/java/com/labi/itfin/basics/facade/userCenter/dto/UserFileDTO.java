package com.labi.itfin.basics.facade.userCenter.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class UserFileDTO implements Serializable {
    private static final long serialVersionUID = 6308812993855906235L;

    private String fileUrl;                      //文件地址  如果文件不通过权限校验可以url直接访问则把访问路径存储在这里
    private String fileCode;                     //文件唯一编码
    private String condenseFileUrl;              //压缩文件地址
    private String condenseFileCode;             //压缩文件唯一编码
    private String fileInfo;                     //文件信息

}

