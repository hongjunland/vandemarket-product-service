package com.vandemarket.productservice.product.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
class ProductTest {
    @Test
    @DisplayName("Product withId 성공")
    public void withIdTest(){
        Long id = 12L;
        Long writer = 1L;
        String name = "IPhone 12";
        String description = "테스트용 아이폰입니다";
        int price = 30000;
        Product product = Product.withId(new Product.ProductId(id), writer, name, description, price);

        assertAll("product2",
                ()-> assertEquals(id, product.getId().getValue()),
                ()-> assertEquals(writer, product.getWriter()),
                ()-> assertEquals(name, product.getName()),
                ()-> assertEquals(description, product.getDescription()),
                ()-> assertEquals(price, product.getPrice())
        );
    }
    @Test
    @DisplayName("Product withoutId 성공")
    public void withoutIdTest(){
        String name = "IPhone 12";
        String description = "테스트용 아이폰입니다";
        Long writer = 1L;
        int price = 30000;
        Product product = Product.withoutId(writer, name, description, price);

        assertAll("product2",
                ()-> assertEquals(writer, product.getWriter()),
                ()-> assertEquals(name, product.getName()),
                ()-> assertEquals(description, product.getDescription()),
                ()-> assertEquals(price, product.getPrice())
        );
    }
}
