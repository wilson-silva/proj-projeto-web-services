package com.educandoewb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoewb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
 

}
