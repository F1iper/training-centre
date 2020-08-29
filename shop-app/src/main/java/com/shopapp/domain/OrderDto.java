package com.shopapp.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OrderDto {
    private Long id;
    private String name;
}
