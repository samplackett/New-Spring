package com.atos.demo.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pokemon {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int dexNo;
	private String nativeRegion;
	private boolean coolShiny;
	
	public Pokemon() {
		super();
		System.out.println("I choose you!");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDexNo() {
		return dexNo;
	}

	public void setDexNo(int dexNo) {
		this.dexNo = dexNo;
	}

	public String getNativeRegion() {
		return nativeRegion;
	}

	public void setNativeRegion(String nativeRegion) {
		this.nativeRegion = nativeRegion;
	}

	public boolean isCoolShiny() {
		return coolShiny;
	}

	public void setCoolShiny(boolean coolShiny) {
		this.coolShiny = coolShiny;
	}
	
}
