package com.Aadhar.Aadharservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Aadhar.Aadharservice.Entity.Aadhar;
import com.Aadhar.Aadharservice.Services.AadharService;

@RestController
public class AadharController {

	@Autowired
	AadharService aadharService;
	
	
	@GetMapping("/Aadhar/Fetch/{accountNo}")
	public Aadhar getAadhar(@PathVariable int accountNo ) {

	return aadharService.getAadhar(accountNo);  				
	}
	
	@PostMapping("/Aadhar/Save")
	public Aadhar setAadhar(@RequestBody Aadhar aadhar)
	{
		return aadharService.saveAadhar(aadhar);
	}
	
	@GetMapping("/Aadhar")
	public String getString() {

	return "vaibhav workign well chill";  				
	}

}
