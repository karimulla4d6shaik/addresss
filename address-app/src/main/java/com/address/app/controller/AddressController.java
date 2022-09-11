package com.address.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/address")
@RestController
public class AddressController {

	@GetMapping("/{address-id}")
	public ResponseEntity<?> getAddressById(@PathVariable("address-id") Integer addressId){
		return null;
	}
	
	@PostMapping
	public ResponseEntity<?> addAddress(){
		return null;
	}
	
	@PutMapping("/{address-id}")
	public ResponseEntity<?> updateAddress(@PathVariable("address-id") Integer addressId){
		return null;
	}
	
	@DeleteMapping("/{address-id}")
	public ResponseEntity<?> deleteAddress(@PathVariable("address-id") Integer addressId){
		return null;
	}
	
	@GetMapping
	public ResponseEntity<?> getAllAddress(){
		return null;
	}
}
