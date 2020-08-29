package com.shopapp.controller;

import com.shopapp.domain.CartDto;
import com.shopapp.domain.OrderDto;
import com.shopapp.domain.ProductDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/v1/cart")
@RestController
public class CartController {

    //create empty cart
    @PostMapping("/createEmpty")
    public CartDto createEmptyCart(@RequestBody CartDto cartDto) {
        return new CartDto();
    }

    //get empty cart
    @GetMapping
    public List<CartDto> getEmptyCart(@RequestBody CartDto cartDto) {
        return new ArrayList<>();
    }

    //add product to cart
    @PostMapping("/addProduct/{productId}")
    public CartDto addProductToCart(@RequestBody CartDto cartDto, @PathVariable Long productId) {
        return new CartDto();
    }

    //delete product from cart
    @DeleteMapping("/{productId}")
    public CartDto removeProduct (@PathVariable Long productId){
        return new CartDto();
    }

    // create order from cart
    @PostMapping("/createOrder")
    public OrderDto createOrderFromCart(@RequestBody CartDto cartDto) {
        return new OrderDto();
    }
}
