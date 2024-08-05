package com.arcticbear.onboard;

import com.arcticbear.onboard.objects.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class CustomerRestController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@Valid @RequestBody Customer customer){
        customerService.save(customer);
        return new ResponseEntity<>("Customer registered successfully", HttpStatus.CREATED);
    }
}
