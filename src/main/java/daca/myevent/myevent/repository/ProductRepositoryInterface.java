package daca.myevent.myevent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import daca.myevent.myevent.models.product.Product;


@Repository
public interface ProductRepositoryInterface extends JpaRepository<Product, Long>{

}