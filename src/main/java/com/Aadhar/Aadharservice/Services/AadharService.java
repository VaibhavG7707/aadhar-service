package com.Aadhar.Aadharservice.Services;

import com.Aadhar.Aadharservice.Entity.Aadhar;

public interface AadharService {

	public Aadhar saveAadhar(Aadhar aadhar);

	public Aadhar getAadhar(int accountNo);

}
