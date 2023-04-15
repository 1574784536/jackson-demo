package edu.nf.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author YXD
 * @date 2023/4/13
 */
@Data
public class OrderInfo {
    @TableId
    private String orderId;
    @TableField("user_uid")
    private String userUid;
    @TableField("order_number")
    private Integer orderNumber;
}
