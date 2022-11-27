package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.ProductPropertyService;
import com.example.shoppingDemo.business.request.productProperties.CreateProductPropertyRequest;
import com.example.shoppingDemo.business.request.productProperties.DeleteProductPropertyRequest;
import com.example.shoppingDemo.business.request.productProperties.UpdateProductPropertyRequest;
import com.example.shoppingDemo.business.response.productProperties.GetAllProductPropertiesResponse;
import com.example.shoppingDemo.business.response.productProperties.GetByProductPropertyResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.dataAccess.abstracts.ProductPropertyRepository;
import com.example.shoppingDemo.entities.concretes.ProductProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductPropertyManager implements ProductPropertyService {
    ProductPropertyRepository productPropertyRepository;
    @Autowired
    public ProductPropertyManager(ProductPropertyRepository productPropertyRepository) {
        this.productPropertyRepository = productPropertyRepository;
    }

    @Override
    public Result add(CreateProductPropertyRequest createProductPropertyRequest) {
        return null;
    }

    @Override
    public Result update(UpdateProductPropertyRequest updateProductPropertyRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteProductPropertyRequest deleteProductPropertyRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllProductPropertiesResponse>> getAll() {
        List<ProductProperty> result = this.productPropertyRepository.findAll();
        List<GetAllProductPropertiesResponse> response = result.stream().map(productProperty -> GetAllProductPropertiesResponse
                .builder()
                .id(productProperty.getId())
                .propertyId(productProperty.getProperty().getId())
                .productId(productProperty.getProduct().getId())
                .build()).collect(Collectors.toList());
        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByProductPropertyResponse> getById(int id) {
       ProductProperty result = this.productPropertyRepository.findById(id).get();
        GetByProductPropertyResponse response =  GetByProductPropertyResponse
                .builder()
                .id(result.getId())
                .propertyId(result.getProperty().getId())
                .productId(result.getProduct().getId())
                .build();
        return new SuccessDataResult<>(response);
    }
}
