package com.arcticbear.onboard;

import com.arcticbear.onboard.objects.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
