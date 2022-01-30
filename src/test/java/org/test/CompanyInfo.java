package org.test;

public class CompanyInfo {

	private void companyName() {
	System.out.println("Royal Enfield");
	}
	
	private void companyId() {
	System.out.println("RE01");
	}
	
	private void companyAddress() {
	System.out.println("Rayal Enfield At Oragadam");
	}
	
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
}
}
	
