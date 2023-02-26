package com.Shopping.onlineshopping.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class EmployeeDto {
    private int employeeId;
    private String employeeName;
    private String employeePassword;
    private String employeeAddress;
    private String employeeEmail;
    private ArrayList employeeNumber;
    private String businessName;

    private String nic;
    private boolean activeState;
}
