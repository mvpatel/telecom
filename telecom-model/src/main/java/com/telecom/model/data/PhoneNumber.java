package com.telecom.model.data;

import lombok.Data;

@Data
public class PhoneNumber {

    private Long customerId;
    private String phoneNumber;
    private boolean activate;
}
