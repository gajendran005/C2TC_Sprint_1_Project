package com.tnsif.Mall.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.Mall.entity.Mall;

public interface MallRepository extends JpaRepository<Mall, Long> {
    // You can add custom query methods if needed
}
