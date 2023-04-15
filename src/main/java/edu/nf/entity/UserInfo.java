package edu.nf.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author YXD
 * @date 2023/4/13
 */
@Data
@TableName("user_info")
public class UserInfo implements Serializable {
    @TableId
    private String userId;
    @TableField("user_name")
    private String userName;
    @TableField("age")
    private Integer age;

    @TableField(exist = false)
    private List<OrderInfo> orderInfoList;
}
