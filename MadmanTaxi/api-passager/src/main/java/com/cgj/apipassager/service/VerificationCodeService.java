package com.cgj.apipassager.service;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class VerificationCodeService {
    public String verificationCode(String PassagerPhone) {

        //调用验证码服务
        System.out.println("调用验证码服务,获取验证码");
        String verification_code = "1111";

        //存入redis
        System.out.println("存入redis");

        //返回值
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",1);
        jsonObject.put("message","success");
        return jsonObject.toString();
    }
}
