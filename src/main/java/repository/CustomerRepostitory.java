package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Customer;


public interface CustomerRepostitory extends JpaRepository<Customer, Long> {

}
