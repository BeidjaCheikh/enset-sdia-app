package ma.enset.customerfrontthymeleafapp.repository;

import ma.enset.customerfrontthymeleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
