package com.olegkorbovskij.manager.controller;


import com.olegkorbovskij.manager.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ProductsController {

    private final ProductService productService;
}
