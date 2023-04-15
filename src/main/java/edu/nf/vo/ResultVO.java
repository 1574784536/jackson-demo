package edu.nf.vo;

import lombok.Data;

/**
 * @author YXD
 * @date 2023/4/13
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private Object message;
    private T data;
}
