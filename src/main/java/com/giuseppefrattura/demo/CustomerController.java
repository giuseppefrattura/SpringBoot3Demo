package com.giuseppefrattura.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/all")
    public List<Customer> all() {
        return customerRepository.findAll();
    }

    record NewCustomerRequest(
            String name,
            Integer age
    ) {
    }

    @PostMapping("/newCustomer")
    public void addCustomer(@RequestBody NewCustomerRequest request) {
        Customer customer = new Customer(request.name());
        customerRepository.save(customer);
    }


    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id) {
        customerRepository.deleteById(id);
    }

    @GetMapping("/")
    public String ciao() {
        return "Ciao";
    }

}
