package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class AAAA {
	
	private Integer aaid;
	private String aaName;
	
	@Id
	@SequenceGenerator(name="aa",sequenceName="seq_aa",allocationSize=1)
	@GeneratedValue(generator="aa",strategy=GenerationType.SEQUENCE)
	public Integer getAaid() {
		return aaid;
	}
	public void setAaid(Integer aaid) {
		this.aaid = aaid;
	}
	public String getAaName() {
		return aaName;
	}
	public void setAaName(String aaName) {
		this.aaName = aaName;
	}
	
}
