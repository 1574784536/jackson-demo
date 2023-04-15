package edu.nf.controller;

import edu.nf.entity.UserInfo;
import edu.nf.service.IUserInfoService;
import edu.nf.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author YXD
 * @date 2023/4/13
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController extends BaseController {

    @Autowired
    private IUserInfoService userInfoService;

    /**
     * 查询用户信息
     *
     * @return
     */
    @GetMapping("/listUserInfo")
    public ResultVO<List<UserInfo>> listUserInfo() {
        return success(userInfoService.listUserInfo());
    }

    /**
     * 查询用户和订单信息(一对多)
     *
     * @return
     */
    @RequestMapping(value = "/listUserInfoAndOrder", method = RequestMethod.GET)
    public ResultVO<List<UserInfo>> listUserInfoAndOrder() {
        return success(userInfoService.listUserInfoAndOrder());
    }

    /**
     * 修改
     * @param userinfo
     * @return
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody UserInfo userinfo) {
        return success(userInfoService.updateUserInfo(userinfo));
    }

    /**
     * 添加
     * @param userinfo
     * @return
     */
    @PostMapping("/add")
    public ResultVO add(@RequestBody UserInfo userinfo) {
        return success(userInfoService.saveUserInfo(userinfo));
    }

    /**
     * 删除
     * @param userId
     * @return
     */
    @DeleteMapping("/delete/{userId}")
    public ResultVO delete(@PathVariable String userId) {
        return success(userInfoService.deleteUserInfo(userId));
    }
}
