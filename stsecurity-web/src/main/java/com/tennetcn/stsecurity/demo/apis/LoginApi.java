package com.tennetcn.stsecurity.demo.apis;

import com.tennetcn.free.web.webapi.FirstApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginApi extends FirstApi {

    @Autowired
    private AuthenticationManager myAuthenticationManager;

    @GetMapping(value = "login")
    public String login(String username,String password){
        username="chenghuan";
        password="chenghuan";
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(username, password);


        //使用SpringSecurity拦截登陆请求 进行认证和授权
        Authentication authenticate = myAuthenticationManager.authenticate(usernamePasswordAuthenticationToken);

        SecurityContextHolder.getContext().setAuthentication(authenticate);
        //使用redis session共享
        session.setAttribute("SPRING_SECURITY_CONTEXT", SecurityContextHolder.getContext()); // 这个非常重要，否则验证后将无法登陆

        return "success";
    }
}
