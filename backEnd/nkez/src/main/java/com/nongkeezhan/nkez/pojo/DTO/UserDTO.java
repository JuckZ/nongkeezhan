package com.nongkeezhan.nkez.pojo.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

/**
 * Created by hugay on 2019/2/27
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    private String userId;

    private String userAccount;

    private String userPassword;

    private String userEmail;

    private String userPhone;

    private Date userBirthday;

    private String userLiuyan;

    /** 分页参数 */
    private QueryPage queryPage;
}
