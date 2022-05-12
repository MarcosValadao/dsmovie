package com.marcosvaladao.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosvaladao.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}