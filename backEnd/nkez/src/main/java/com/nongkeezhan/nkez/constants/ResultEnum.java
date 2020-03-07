package com.nongkeezhan.nkez.constants;

import lombok.Getter;

/**
 * Created by hugay on 2019/2/27
 */
@Getter
public enum ResultEnum {

    SYSTEM_ERROR(-1, "系统异常"),
    SUCCESS(0, "操作成功"),

    ADMIN_LOGIN_ERROR(11, "管理员登录失败"),
    ADMIN_CONFIRM_ERROR(12, "管理员信息验证失败"),
    UNAUTHORIZED(13, "没有操作权限"),
    ACCOUNT_LOCKED(14, "该账号已锁定"),

    USER_REGIST_ERROR(20,"注册失败，用户已经存在"),
    USER_DELETE_ERROR(21,"删除失败，用户不存在"),
    USER_FIND_ERROR(22,"查找失败，用户不存在"),
    USER_UPDATE_ERROR(23,"更新失败，用户不存在"),
    USER_UPW_ERROR(24,"更新密码错误，用户不存在"),
    USER_LOGIN_ERROR(25, "登录失败，用户账户或密码不存在"),
    USER_LOCKED_ERROR(26,"该账号已被锁定"),

    NEWS_ADD_ERROR(40,"添加失败，新闻已经存在"),
    NEWS_DELETE_ERROR(41,"删除失败，新闻不存在"),
    NEWS_FIND_ERROR(42,"查找失败，新闻不存在"),
    NEWS_UPDATE_ERROR(43,"更新失败，新闻不存在"),

    PROFESSOR_ADD_ERROR(50,"添加失败，专家已经存在"),
    PROFESSOR_DELETE_ERROR(51,"删除失败，专家不存在"),
    PROFESSOR_FIND_ERROR(52,"查找失败，专家不存在"),
    PROFESSOR_UPDATE_ERROR(53,"更新失败，专家不存在"),

    TECHNOLOGY_ADD_ERROR(60,"添加失败，技术已经存在"),
    TECHNOLOGY_DELETE_ERROR(61,"删除失败，技术不存在"),
    TECHNOLOGY_FIND_ERROR(62,"查找失败，技术不存在"),
    TECHNOLOGY_UPDATE_ERROR(63,"更新失败，技术不存在"),

    DOCUMENT_SUCCESS_FAILED(30,"文件上传失败"),
    DELETE_DOCUMENT_NOT_EXIT(31, "要删除的文件不存在"),
    RECOVER_DOCUMENT_NOT_EXIT(32, "要恢复的文件不存在"),
    ADD_DOCUMENT_FALSE(33,"添加文件信息异常"),
    ADD_DOCUMENT_EMPTY(34,"文件为空")

    ;

    /** 状态代码 */
    Integer code;

    /** 状态信息 */
    String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
