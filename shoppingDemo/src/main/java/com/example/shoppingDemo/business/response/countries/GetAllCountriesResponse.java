package com.example.shoppingDemo.business.response.countries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCountriesResponse {
    private int id;
    private String name;
}