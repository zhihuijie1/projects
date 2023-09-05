package com.cgj.apipassager.controller;


import com.cgj.apipassager.requst.VerficationCodeDTO;
import com.cgj.apipassager.service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VerificationCodeController {

    @Autowired
    private VerificationCodeService verificationCodeService;
    @GetMapping ("/verification-code")
    public String verificationCode(@RequestParam VerficationCodeDTO verficationCodeDTO) {
        String phoneNumber = verficationCodeDTO.getPassagerPhone();
        System.out.println("接收到电话号码是：" + phoneNumber);
        return verificationCodeService.generateCode(phoneNumber);
    }
}
