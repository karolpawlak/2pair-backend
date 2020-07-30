package com.projectx.application.controller;

public class UserNotFoundException extends RuntimeException {

	UserNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}