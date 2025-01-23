package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calc-scope")
public class CalcScopeController {

    @RequestMapping("")
        public String index(){
            return "request-calc-scope-form";
        }
    
    @PostMapping("/input-number")
    public String inputNumber(String number, Model model){
        model.addAttribute("number1", number);
        model.addAttribute("number2", number);

        return "result-calc-scope";
    }
   
    public int getIntNumber(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(result); // 計算結果を表示
        return result;
    
    }


}
