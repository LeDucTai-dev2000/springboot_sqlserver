package service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Customer;
import repository.CustomerRepostitory;

@Service
@Transactional
public class CustomerService {
	 @Autowired
	    private CustomerRepostitory cusrepo ;
	     
	    public List<Customer> listAll() {
	        return cusrepo.findAll();
	    }
	     
	    public void save(Customer customer) {
	        cusrepo.save(customer);
	    }
	     
	    public Customer get(long id) {
	        return cusrepo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        cusrepo.deleteById(id);
	    }
  
    
    
    
    
}
