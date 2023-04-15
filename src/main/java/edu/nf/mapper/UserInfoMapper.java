package edu.nf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.nf.entity.UserInfo;

import java.util.List;

/**
 * @author YXD
 * @date 2023/4/13
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    List<UserInfo> listUserInfoAndOrder();
}
