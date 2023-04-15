package edu.nf.controller;

import edu.nf.vo.ResultVO;
import org.springframework.http.HttpStatus;

/**
 * @author YXD
 * @date 2023/4/13
 */
public abstract class BaseController {

    protected <T> ResultVO<T> success(T data) {
        ResultVO<T> vo = new ResultVO<>();
        vo.setCode(200);
        vo.setMessage("ok");
        vo.setData(data);
        return vo;
    }

    protected ResultVO success(Integer code) {
        ResultVO vo = new ResultVO();
        vo.setCode(code);
        return vo;
    }

    protected ResultVO success() {
        ResultVO vo = new ResultVO();
        vo.setCode(200);
        return vo;
    }

    public ResultVO success(String message) {
        ResultVO vo = new ResultVO<>();
        vo.setCode(HttpStatus.OK.value());
        vo.setMessage(message);
        return vo;
    }

    public ResultVO fail(Integer code, String message) {
        ResultVO vo = new ResultVO();
        vo.setCode(code);
        vo.setMessage(message);
        return vo;
    }

    public ResultVO fail(String message) {
        ResultVO vo = new ResultVO();
        vo.setCode(500);
        vo.setMessage(message);
        return vo;
    }

    public ResultVO fail(Integer code) {
        ResultVO vo = new ResultVO();
        vo.setCode(code);
        return vo;
    }

}
