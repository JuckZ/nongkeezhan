package com.nongkeezhan.nkez.pojo.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

/**
 * Created by hugay on 2019/2/27
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechnologyDTO {

    private String techologyId;

    private String professorId;

    private String techologyTitle;

    private String techologyPicture;

    /** 分页参数 */
    private QueryPage queryPage;
}
