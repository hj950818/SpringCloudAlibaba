package account.entity;

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
@TableName("table_account")
@ApiModel(value = "库存表")
public class Account extends Model<Account> {

    @ApiModelProperty(value = "主键ID")
    @TableId(type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "产品id")
    private Integer userId;

    @ApiModelProperty(value = "总额度")
    private BigDecimal total;

    @ApiModelProperty(value = "已用额度")
    private BigDecimal used;

    @ApiModelProperty(value = "剩余额度")
    private BigDecimal residue;
}
