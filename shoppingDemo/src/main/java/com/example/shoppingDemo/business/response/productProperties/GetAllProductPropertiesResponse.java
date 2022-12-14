package com.example.shoppingDemo.business.response.productProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllProductPropertiesResponse {
    private int id;
    private int productId;
    private int propertyId;
}
