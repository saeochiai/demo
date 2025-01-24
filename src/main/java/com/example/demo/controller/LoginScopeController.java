package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/request-login")
public class LoginScopeController {

    // ログインフォームページ
    @RequestMapping("")
    public String index() {
        return "login-scope-form"; // ログインフォームのビュー
    }

    // ログインチェック
    @Autowired
    private HttpSession session;
    @RequestMapping(value = "/login-page", method = RequestMethod.POST)
    public String inputId(String mailaddress, String password) {
        
        session.setAttribute("mailaddress", mailaddress);
        session.setAttribute("password", password); 


        if ("test@example.com".equals(mailaddress) && "123".equals(password)) {
            return "result-login-scope";
        }  else {
            return "login-scope-form";
        }

    // @RequestMapping("/to-login-page")
    // public String toLoginPage(){
    //     return "result-login-scope";
    // }

    // @RequestMapping()
    // public String toMyPage("/to-my-page"){
    //     return "result-login-scope2";
    // }
     }
}
