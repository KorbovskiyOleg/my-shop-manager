package manager.repository;

import manager.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}

