package org.launchcode.codingevents.models.dto;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class RegisterFormDTO extends LoginFormDTO {

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

}
