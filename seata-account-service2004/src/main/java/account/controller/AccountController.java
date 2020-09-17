package account.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@Slf4j
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/decrese")
    void decrese(@RequestParam("money") Integer money, @RequestParam("userId") BigDecimal userId){

    }
}
