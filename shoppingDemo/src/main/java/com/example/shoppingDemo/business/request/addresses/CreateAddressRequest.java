package com.example.shoppingDemo.business.request.addresses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CreateAddressRequest {

    private String detail;
    private int cityId;
    private int userId;

    
}
