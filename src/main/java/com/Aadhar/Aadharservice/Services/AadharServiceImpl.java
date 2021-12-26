package com.Aadhar.Aadharservice.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Aadhar.Aadharservice.Entity.Aadhar;

@Service
public class AadharServiceImpl implements AadharService{


	@Autowired
	private AadharRepo aadharRepo;

	@Override
	public Aadhar saveAadhar(Aadhar aadhar) {
	    aadharRepo.save(aadhar);
		return aadhar;
	}

	@Override
	public Aadhar getAadhar(int accountNo) {
		List <Aadhar> list1 = new ArrayList<>();
	    aadharRepo.findAll().forEach(e->list1.add(e));
	    return list1.stream().filter(e->e.getAccountNo()==accountNo).findAny().orElse(new Aadhar());
		
	}
	
	
	
}
