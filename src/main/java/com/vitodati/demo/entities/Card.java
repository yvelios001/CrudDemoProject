package com.vitodati.demo.entities;

import java.io.Serializable;
import java.util.Objects;

public class Card implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private long id;
	private String name;
	private int quantity;
	private double value;
	
	public Card() {
		
	}

	public Card(long id, String name, int quantity, long value) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.value = value;
		}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return id == other.id;
	}
	
	
}

