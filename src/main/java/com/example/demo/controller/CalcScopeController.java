package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calc-scope")
public class CalcScopeController {

    @RequestMapping("")
        public String index(){
            return "request-calc-scope-form";
        }

    @PostMapping("/input-number")
    public String inputNumber(@RequestParam("number1") String number1,
                               @RequestParam("number2") String number2,
                               Model model) {
        try {
            // 入力された値を整数に変換
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);

            // 計算結果を取得
            int result = num1 + num2;

            // モデルに値を追加
            model.addAttribute("number1", num1);
            model.addAttribute("number2", num2);
            model.addAttribute("result", result); // 計算結果を追加

        } catch (NumberFormatException e) {
            model.addAttribute("error", "数字の形式が正しくありません");
        }

        return "result-calc-scope"; 
    
    // @PostMapping("/input-number")
    // public String inputNumber(String number, Model model){
    //     model.addAttribute("number1", number);
    //     model.addAttribute("number2", number);

    //     return "result-calc-scope";
    // }
   
    // public int getIntNumber(int number1, int number2) {
    //     int result = number1 + number2;
    //     System.out.println(result); // 計算結果を表示
    //     return result;
    
    // }


    }
}
