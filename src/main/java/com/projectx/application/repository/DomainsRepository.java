package com.projectx.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.application.model.Domains;

public interface DomainsRepository extends JpaRepository<Domains, Long> {

}