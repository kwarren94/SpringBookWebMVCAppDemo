package com.qa.repositories;



import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


import com.qa.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	


}
