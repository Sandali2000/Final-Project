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
    private String employeePassword;
    private String employeeAddress;
    private String employeeEmail;
    private ArrayList employeeNumber;
    private String businessName;
    private String nic;
}
