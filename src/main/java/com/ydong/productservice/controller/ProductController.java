package com.ydong.productservice.controller;

import com.ydong.productservice.dto.ProductRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/prooduct")
public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        
    }
}
