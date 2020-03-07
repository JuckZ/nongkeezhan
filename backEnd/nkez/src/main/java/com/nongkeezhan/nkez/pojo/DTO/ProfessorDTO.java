package com.nongkeezhan.nkez.pojo.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Created by hugay on 2019/2/27
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfessorDTO {

    private String professorId;

    private String professorName;

    private String professorPosition;

    private String professorYjfx;

    private String professorZl;

    private String professorPicture;

    private String professorCategory;

    /** 分页参数 */
    private QueryPage queryPage;

    @Override
    public String toString() {
        return "ProfessorDTO{" +
                "professorId='" + professorId + '\'' +
                ", professorName='" + professorName + '\'' +
                ", professorPosition='" + professorPosition + '\'' +
                ", professorYjfx='" + professorYjfx + '\'' +
                ", professorZl='" + professorZl + '\'' +
                ", professorPicture='" + professorPicture + '\'' +
                ", professorCategory='" + professorCategory + '\'' +
                ", queryPage=" + queryPage +
                '}';
    }
}
