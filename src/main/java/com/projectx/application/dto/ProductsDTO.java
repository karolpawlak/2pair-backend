package com.projectx.application.dto;

import com.projectx.application.dto.DomainsDTO;
import com.projectx.application.dto.UsersDTO;

import lombok.Data;

@Data
public class ProductsDTO {

	private Long id;
	private String name;
	private UsersDTO lead;
	private DomainsDTO domain;
}
