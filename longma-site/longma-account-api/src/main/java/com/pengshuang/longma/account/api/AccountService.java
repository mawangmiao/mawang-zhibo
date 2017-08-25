package com.pengshuang.longma.account.api;

import com.pengshuang.longma.common.entity.StringResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface AccountService {

    @RequestMapping(value = "/account/token", method = RequestMethod.GET)
    StringResult getToken(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password
    );
}
