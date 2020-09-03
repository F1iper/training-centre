package com.shopapp.controller;

import com.shopapp.domain.ProductDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    //get products list
    @GetMapping
    public List<ProductDto> getAllProducts (@RequestBody ProductDto productDto){
        return new ArrayList<>();
    }
    //get 1 product
    @GetMapping("{productId}")
    public ProductDto getProduct(@PathVariable Long productId) {
        return new ProductDto(1L, "get product");
    }
    //create product
    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        return new ProductDto(1L, "created product");
    }
    //update product
    @PutMapping("{productId}")
    public ProductDto updateProduct(@PathVariable Long productId) {
        return new ProductDto(1L, "updated product");
    }
    //delete product
    @DeleteMapping("{productId}")
    public ProductDto deleteProduct(@PathVariable Long productId) {
        return new ProductDto(1L, "delete product");
    }

}
