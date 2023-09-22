package com.cgj.serviceverificationcode.controller;

import com.cgj.internalcommon.dto.ResponseResult;
import com.cgj.internalcommon.response.NumberCodeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberCodeController {
    @GetMapping("/numberCode{size}")
    public ResponseResult numberCode(@PathVariable("size") int size) {
        //@pathvariable:从网址中摘取指定信息到springboot程序中
        System.out.println("size -> " + size);
        //生成验证码
        //[0,1) - [0,10)
        double mathRandom = Math.random() * 9 + 1;
        int verificationCode = (int) (mathRandom * Math.pow(10, size - 1));
        System.out.println("生成过程中的验证码是" + verificationCode);
        //设置验证码
        NumberCodeResponse numberCodeResponse = new NumberCodeResponse();
        numberCodeResponse.setNumbercode(verificationCode);

        /*JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 1);
        jsonObject.put("message", "success");
        JSONObject data = new JSONObject();
        data.put("numbercode", verificationCode);
        jsonObject.put("data", data);

        return jsonObject.toString();*/

        return ResponseResult.success(numberCodeResponse);

    }
}
