
package com.yunfei.mp.common.exception;

public enum ExceptionMsg {
	SUCCESS("000000", "操作成功"),
	FAILED("999999","操作失败"),
    ParamError("000001", "参数错误！"),
    AddRecordError("000011", "添加调研记录异常！"),
    AddUserError("000012", "添加用户异常！"),
    AddUserParamError("000013", "添加用户信息不能为空！"),
    AddUserNameParamError("000014", "用户姓名不能为空！"),
    AddUserPhoneParamError("000015", "用户电话不能为空！"),
    AddUserCompanyParamError("000016", "用户所属单位不能为空！"),
    AddUserBuildParamError("000017", "用户所属楼宇不能为空！"),
    FacilityParamError("000031", "配套设施和增值服务！"),
    ExteriorParamError("000032", "楼宇形象和外观！"),
    CustParamError("000033", "客户服务！"),
    HiecsParamError("000034", "环境管理！"),
    ParkinglotParamError("000035", "车场管理！"),
    RentalParamError("000036", "租赁服务！"),
    PFacilityParamError("000037", "公共设施运行！"),
    PropertyParamError("000038", "物业服务总体感受！"),
    RepairParamError("000039", "工程维修服务！"),
    SafetyParamError("000040", "安全管理！"),
    BuildingIdParamError("000041", "楼宇ID！"),
    UserIdParamError("000042", "用户ID！"),
    LoginParamError("000101", "后台登陆账号参数错误！"),
    LoginUserNameParamError("000102", "后台登陆账号或密码不能为空！"),
    LoginUserExsitError("000103", "后台登陆账号不存！"),
    LoginUserPassError("000104", "后台登陆账号密码错误！"),
    ;
   private ExceptionMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    private String code;
    private String msg;
    
	public String getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}

    
}

