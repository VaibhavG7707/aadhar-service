package com.Aadhar.Aadharservice.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aadhar {

   @Id
	private int accountNo;
	private String aadharno;
    private String fname;
	private String lname;
	
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Aadhar(String aadharno, int accountNo, String fname, String lname) {
		super();
		this.aadharno = aadharno;
		this.accountNo = accountNo;
		this.fname = fname;
		this.lname = lname;
	}
	public Aadhar() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Aadhar [aadharno=" + aadharno + ", accountNo=" + accountNo + ", fname=" + fname + ", lname=" + lname
				+ "]";
	}
	
	
	
}
