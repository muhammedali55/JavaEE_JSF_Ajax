package com.vektortel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="indexbean")
@SessionScoped
public class indexBean {

	private int sayi1;
	
	
	
	public int karesi() {
		return sayi1*sayi1;		
	}
	
	public int getSayi1() {
		return sayi1;
	}
	public void setSayi1(int sayi1) {
		this.sayi1 = sayi1;
	}
	
	
	
	
	
	
}
