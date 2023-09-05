package com.cgj.apipassager.controller;


import com.cgj.apipassager.requst.VerficationCodeDTO;
import com.cgj.apipassager.service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationCodeController {

    @Autowired
    private VerificationCodeService verificationCodeService;
    @GetMapping("/verification-code")
    public String verificationCode(@RequestBody VerficationCodeDTO verficationCodeDTO) {

        String PassagerPhone = verficationCodeDTO.getPassagerPhone();
        System.out.println("接收到的手机号是：" + PassagerPhone);
        return verificationCodeService.verificationCode(PassagerPhone);
    }
}
