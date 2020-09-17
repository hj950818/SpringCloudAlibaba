package com.alibaba.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("table_order")
@ApiModel(value = "订单表")
public class Orderl extends Model<Orderl> {
    @ApiModelProperty(value = "id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户Id")
    private Integer userId;

    @ApiModelProperty(value = "产品id")
    private Integer prodoctId;

    @ApiModelProperty(value = "数量")
    private BigDecimal count;

    @ApiModelProperty(value = "金额")
    private BigDecimal money;

    /**
     * 订单状态  0：创建中 1：已完结
     */
    @ApiModelProperty(value = "订单状态")
    private Integer status;
}
