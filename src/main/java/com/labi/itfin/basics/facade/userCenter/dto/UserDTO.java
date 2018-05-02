
package com.labi.itfin.basics.facade.userCenter.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用户实体
 */
@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = -5196598565973460873L;

    private Long pid;                        //用户passport唯一标识
    private String historyId;                //数据迁移，历史记录对应的id


    private Integer userType;                    //用户类型  其他：1   社会人士：2  学生：3
    private String userRealNamePinYin;           //真实姓名拼音
    private String userNation;                   //民族
    private String liveAddrInfo;                 //现居住地址
    private String liveAddrDetailInfo;           //现居住详细地址


    /**
     * 工作信息
     */
    private String incomeResource ;              //收入来源
    private String monthlyIncome;                //月收入  单位：分
    private String industry;                     //从事行业

    /**
     * 债务信息
     */
    private Integer hasLoan;                     //是否有贷款   1：是  0：否
    private String  hisLoanType;                 //贷款类型
    private Long loanMoney;                      //贷款金额
    private Integer hasCdtReport;                //是否有征信报告
    private String overdueRecorde;               //逾期记录
    private Integer overdueAccNum;               //逾期账户数
    private Long currentOverdueMoney;            //当前逾期金额

    /**
     * 风控审核信息
     */
    private Integer auditStatus;                 //用户信息审核状态
    private String auditInfo;                    //审核信息

    /**
     * 历史变更信息
     */
    private String historyInfo;                  //json格式的信息,结构与本结构体一致,但没有数据的省略


    private IdcardInfoDTO idcardInfo;                      //身份证信息结构体
    private List<EducationalInfoDTO> educationalInfo;      //学历信息结构体
    private List<UrgentCpInfoArrDTO> urgentCpInfoArr;      //紧急联系人信息结构体
    private BankcardInfoDTO bankcardInfo;                  //银行卡信息结构体


    /**
     * 文件相关信息
     */
    private UserFileDTO idcardFrontImgUf;                  //身份证正面照
    private UserFileDTO idcardBackImgUf;                   //身份证反面照
    private UserFileDTO handIdcardFrontImgUf;              //手持身份证正面照
    private UserFileDTO xxImgUf;                           //学信网截图
    private UserFileDTO oneselfImgUf;                      //本人手持毕业证照片
    private UserFileDTO pqcCardImgUf;                      //职业资格证书照片
    private UserFileDTO oneselfPqcCardImgUf;               //本人手持职业资格证书照片





}
