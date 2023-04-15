package edu.nf.advice;

import edu.nf.exception.AccessException;
import edu.nf.vo.ResultVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author YXD
 * @date 2023/4/15
 */
@RestControllerAdvice({"edu.nf.controller"})
public class ControllerAspect {
    @ExceptionHandler(AccessException.class)
    public ResultVO handleDataAccessException(AccessException e) {
        ResultVO vo = new ResultVO();
        vo.setMessage(e.getMessage());
        vo.setCode(500);
        return vo;
    }
}
