package org.ddestrei.productservice.controller;

import lombok.RequiredArgsConstructor;
import org.ddestrei.productservice.dto.ProductRequest;
import org.ddestrei.productservice.dto.ProductResponse;
import org.ddestrei.productservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
        return "product Created";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }

}
