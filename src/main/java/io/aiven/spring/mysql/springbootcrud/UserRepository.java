package io.aiven.spring.mysql.springbootcrud;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
	
}
