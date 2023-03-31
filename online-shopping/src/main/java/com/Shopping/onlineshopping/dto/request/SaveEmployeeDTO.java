package com.Shopping.onlineshopping.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaveEmployeeDTO {
    private String employeeName;
    private String  userName;
    private String employeePassword;
    private String  confirmPassword;
    private String employeeAddress;
    private String employeeEmail;
    private ArrayList employeeNumber;
    private String businessName;
    private String businessType;
    private String nic;
    private String gender;
}
