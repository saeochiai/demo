package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveForm;

@Controller
@RequestMapping("/receive")

public class ReceiveContoroller {

   

    @RequestMapping("")
        public String index(){
            return "info-form";

    }
    @RequestMapping("/receive-info")
    public String receiveInfo(ReceiveForm receiveform){
        System.out.println(receiveform.getName());
        System.out.println(receiveform.getAge());
        return "finished";

    }
}

