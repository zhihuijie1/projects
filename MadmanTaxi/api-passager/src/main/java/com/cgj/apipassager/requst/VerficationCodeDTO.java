package com.cgj.apipassager.requst;

import lombok.Data;

//存放手机号码

public class VerficationCodeDTO {
    private String PassagerPhone;

    public String getPassagerPhone() {
        return PassagerPhone;
    }

    public void setPassagerPhone(String PassagerPhone) {
        this.PassagerPhone = PassagerPhone;
    }
}
