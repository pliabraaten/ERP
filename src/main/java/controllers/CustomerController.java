package controllers;

import models.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.CustomerService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return customerService.getCustomer(id);
    }

    @PostMapping
    public ResponseEntity createCustomer(@RequestBody Customer customer) throws URISyntaxException {  // TODO: check this exception
        Customer savedCustomer = customerService.saveCustomer(customer);

        /* ResponseEntity.created(uri) sets the HTTP status to 201 Created and sets the Location header to the URI you pass in.
                This tells the client "your resource was created, and you can find it here."
           .body(savedCustomer) attaches the actual response body — in this case the newly saved customer object, which Spring will serialize to JSON.
               Full response sent back to the client looks like:
                    Status:  201 Created
                    Header:  Location: /customers/42
                    Body:    { "id": 42, "name": "Alice", ... }
         */
        return ResponseEntity.created(new URI("/customers/" + savedCustomer.getId())).body(savedCustomer);

    }

    @PutMapping("/{id}")
    public ResponseEntity updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        Customer currentCustomer = customerService.getCustomer(id);  // Retrieve customer record

        // Update existing record with values from the request body
        currentCustomer.setName(customer.getName());
        currentCustomer.setEmail(customer.getEmail());
        currentCustomer.setPhoneNumber(customer.getPhoneNumber());
        currentCustomer.setNotes(customer.getNotes());
        currentCustomer.setHousehold(customer.getHousehold());

        return ResponseEntity.ok().body(currentCustomer);  // Returns 200 with customer object serialized as JSON in the body
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);

        return ResponseEntity.noContent().build();  // Returns 200 with no response body; .build() finalizes response without attaching anything
    }
}
