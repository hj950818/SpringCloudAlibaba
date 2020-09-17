package account.serveice.impl;


import account.entity.Account;
import account.mapper.AccountMapper;
import account.serveice.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class StorageServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
