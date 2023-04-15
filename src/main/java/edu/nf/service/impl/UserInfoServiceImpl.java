package edu.nf.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import edu.nf.entity.UserInfo;
import edu.nf.exception.AccessException;
import edu.nf.mapper.UserInfoMapper;
import edu.nf.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author YXD
 * @date 2023/4/13
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> listUserInfoAndOrder() {
        return userInfoMapper.listUserInfoAndOrder();
    }

    @Override
    public List<UserInfo> listUserInfo() {
        return this.list();
    }

    @Override
    public UserInfo updateUserInfo(UserInfo userInfo) {
        UserInfo byId = this.getById(userInfo.getUserId());
        if (byId == null) {
            throw new AccessException("用户不存在");
        }
        this.updateById(userInfo);
        return userInfo;
    }

    @Override
    public UserInfo saveUserInfo(UserInfo userInfo) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(UserInfo::getUserName, userInfo.getUserName());
        UserInfo byUserName = this.getOne(queryWrapper);
        if (byUserName != null) {
            throw new AccessException("用户已存在");
        }
        this.save(userInfo);
        return userInfo;
    }

    @Override
    public boolean deleteUserInfo(String userId) {
        UserInfo byId = this.getById(userId);
        if (byId == null) {
            throw new AccessException("用户不存在");
        }
        return this.removeById(userId);
    }
}
