package com.nongkeezhan.nkez.pojo.DTO;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 * Created by hugay on 2019/2/27
 */
@Data
public class QueryPage {
    /** 页码 */
    @Min(value = 1, message = "最小页数为1")
    private Integer pageNum = 1;

    /** 每页数量 */
    @Min(value = 1, message = "每页最少数为1")
    private Integer pageSize = 10;

    /** 排序字段 */
    @Pattern(regexp = "^[A-Za-z0-9_]+$", message = "排序字段名只能是字母、数字、下划线的组合")
    private String orderBy;

    /** 排序方向 */
    @Pattern(regexp = "asc|desc", message = "排序方向只能是asc,desc两种方向")
    private String orderDirection;
}
