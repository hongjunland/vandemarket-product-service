package com.vandemarket.product.product.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataProductRepository extends JpaRepository<ProductJpaEntity, Long> {

}
