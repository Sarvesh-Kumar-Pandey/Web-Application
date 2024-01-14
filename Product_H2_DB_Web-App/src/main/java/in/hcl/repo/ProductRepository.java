package in.hcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.hcl.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
