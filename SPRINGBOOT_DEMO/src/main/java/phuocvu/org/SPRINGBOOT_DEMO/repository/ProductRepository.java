package phuocvu.org.SPRINGBOOT_DEMO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import phuocvu.org.SPRINGBOOT_DEMO.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductName(String productName);
}
