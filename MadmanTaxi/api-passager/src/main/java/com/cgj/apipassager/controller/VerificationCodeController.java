package com.cgj.apipassager.controller;


import com.cgj.apipassager.requst.VerficationCodeDTO;
import com.cgj.apipassager.service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class VerificationCodeController {

    @Autowired
    private VerificationCodeService verificationCodeService;
    @GetMapping ("/verification-code")
    public String verificationCode(@RequestParam("PassagerPhone") String passagerPhone) {
        String phoneNumber = passagerPhone;
        System.out.println("接收到电话号码是：" + phoneNumber);
        return verificationCodeService.generateCode(phoneNumber);
    }
}
