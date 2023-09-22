package com.cgj.apipassager.service;

import com.cgj.apipassager.romote.ServiceVerfecitionCodeClient;
import com.cgj.internalcommon.dto.ResponseResult;
import com.cgj.internalcommon.response.NumberCodeResponse;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerificationCodeService {

    @Autowired
    private ServiceVerfecitionCodeClient serviceVerfecitionCodeClient;
    public String generateCode(String PassagerPhone) {

        //调用验证码服务
        ResponseResult<NumberCodeResponse> nuberCode = serviceVerfecitionCodeClient.getNuberCode();
        System.out.println("调用验证码服务中的验证码：" + nuberCode.getData().getNumbercode());

        //存入redis
        System.out.println("存入redis");

        //返回值
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 1);
        jsonObject.put("message", "success");
        return jsonObject.toString();
    }
}
