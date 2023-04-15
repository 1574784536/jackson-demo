package edu.nf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.nf.entity.UserInfo;

import java.util.List;

/**
 * @author YXD
 * @date 2023/4/13
 */
public interface IUserInfoService extends IService<UserInfo> {
    List<UserInfo> listUserInfoAndOrder();

    List<UserInfo> listUserInfo();

    UserInfo updateUserInfo(UserInfo userInfo);

    UserInfo saveUserInfo(UserInfo userInfo);

    boolean deleteUserInfo(String userId);

}
