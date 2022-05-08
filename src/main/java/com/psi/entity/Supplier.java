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
@Table(name = "suppliers")
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Size(min=2,max=50, message="{supplier.name.size}")
	private String name;
	
//	@OneToMany(mappedBy = "supplier")
//	@OrderBy("id ASC")
//	private Set<Employee> employees =new LinkedHashSet<>();
	
	@Column
	private Integer phone;//電話
	
	@Column
	private String fax;//傳真

	@Column
	private String Contact_person;//聯絡人

	@Column
	private String address;//公司地址

	@Column
	private String Remark;//備註事項

	
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

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getContact_person() {
		return Contact_person;
	}

	public void setContact_person(String contact_person) {
		Contact_person = contact_person;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	

}
