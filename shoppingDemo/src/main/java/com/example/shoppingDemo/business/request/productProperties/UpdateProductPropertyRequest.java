package com.example.shoppingDemo.business.request.productProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductPropertyRequest {
    private int id;
    private int productId;
    private int propertyId;
}
