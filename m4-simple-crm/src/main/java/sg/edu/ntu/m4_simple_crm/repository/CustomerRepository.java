package sg.edu.ntu.m4_simple_crm.repository;

import sg.edu.ntu.m4_simple_crm.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// @Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
