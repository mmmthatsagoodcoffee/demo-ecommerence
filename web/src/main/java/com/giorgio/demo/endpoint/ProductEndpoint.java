package com.giorgio.demo.endpoint;

import com.giorgio.demo.dto.ProductDto;
import com.giorgio.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductEndpoint {

    final
    ProductService productService;

    public ProductEndpoint(@Autowired ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<ProductDto> getAll() {
        return null;// productService.getAll();
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable Long id) {
        return null;//productService.getById(id);
    }

    @GetMapping("/search")
    public ProductDto getById(@RequestBody ProductDto productDto) {
        return null;//productService.getById(productDto);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDto save(@RequestBody ProductDto productDto) {
        return null;//productService.save(productDto);
    }
}
