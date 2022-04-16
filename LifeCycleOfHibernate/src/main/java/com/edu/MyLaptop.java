package com.edu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class MyLaptop 
{
	@Id
	//@GeneratedValue(generator ="lseq" ,strategy=GenerationType.SEQUENCE)
	//@SequenceGenerator(name="lseq",sequenceName = "myseq",initialValue = 1000,allocationSize =1)
	private int lid;
	String lname;
	float lprice;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public float getLprice() {
		return lprice;
	}
	public void setLprice(float lprice) {
		this.lprice = lprice;
	}


}


