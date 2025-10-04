package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AxisBank {
@PostMapping("axis/openAccount")
	String openAccount(@RequestBody AccountForm oa){
		return "Account is opened";
	}
@PostMapping("axis/closeAccount")
	String closeAccount(@RequestBody AccountForm ca) {
		return"Account closed";
		
 	}
@PostMapping("axis/deposite")
String deposit(@RequestBody DepositeMoney dm) {
	return"Money deposited: Rs " + dm.getAmount();
}

@PostMapping("axis/balance")
String checkbalance(@RequestBody BalanceForm bf) {
	return"Balance Amount: Rs " + bf.getAmount();
}

@PostMapping("axis/fixedDeposite")
String fixedDeposite(@RequestBody AccountForm fd) {
	return"Fixed Deposite Created " ;
}


}
class AccountForm{
	private String name;
	private String address;
	private int aadhar;
	private int mobno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	
	
	
	
}
class DepositeMoney{
	
	private int accNo;
	private int ifsc;
	private int amount;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getIfsc() {
		return ifsc;
	}
	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
class BalanceForm{
	private int accNo;
	private int pin;
	private int amount;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}

