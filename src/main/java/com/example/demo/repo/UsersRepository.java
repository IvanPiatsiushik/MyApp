package com.example.demo.repo;

import com.example.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users ,Long> {

}
