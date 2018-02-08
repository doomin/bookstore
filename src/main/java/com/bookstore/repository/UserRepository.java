package com.bookstore.repository;

import com.bookstore.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dominik on 2018-02-08.
 */
public interface UserRepository extends CrudRepository<User, Long>{
    User findByUserName(String username);
}
