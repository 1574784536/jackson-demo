package edu.nf.controller;

import edu.nf.entity.TestVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YXD
 * @date 2023/4/13
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        TestVo vo = new TestVo();
        vo.setAddress("123");
        vo.setName("345");
        return "index";
    }
}
