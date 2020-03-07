package com.nongkeezhan.nkez.pojo.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Created by hugay on 2019/2/27
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewsDTO {
    private String newsId;

    private String newsTitle;

    private String newsBody;

    private String newsPicture;

    private String newsSource;

    /** 分页参数 */
    private QueryPage queryPage;
}
