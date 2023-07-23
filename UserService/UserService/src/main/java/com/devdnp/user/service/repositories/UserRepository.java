package com.devdnp.user.service.repositories;

import com.devdnp.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

    //Any custom method or query can be implemented here
}
