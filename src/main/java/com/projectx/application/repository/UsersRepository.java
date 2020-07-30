package com.projectx.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.application.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}