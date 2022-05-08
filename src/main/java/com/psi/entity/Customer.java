package com.psi.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.validation.constraints.Size;



@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Size(min=2,max=50, message="{customer.name.size}")
	private String name;
	
	@OneToMany(mappedBy = "customer")
	@OrderBy("id ASC")
	private Set<Order> orders =new LinkedHashSet<>();
	
	@Column
	private Integer Telephone;//電話
	
	@Column
	private String phone;//手機
	
	@Column
	private String Uniform_numbers;//統一編號
	
	@Column
	private String address;//地址

	
	
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

	public Integer getTelephone() {
		return Telephone;
	}

	public void setTelephone(Integer telephone) {
		Telephone = telephone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUniform_numbers() {
		return Uniform_numbers;
	}

	public void setUniform_numbers(String uniform_numbers) {
		Uniform_numbers = uniform_numbers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
}
