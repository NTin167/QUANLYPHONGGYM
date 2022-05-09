package com.GymManager.Entity;

import java.util.*;
import java.util.Collection;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "KHACHHANG")
public class CustomerEntity {
	@Id
	@Column(name="MaKH")
	private String customerId;
	@Column(name="HoTen")
	private String name;
	@Column(name="Phai")
	private int gender;
	@Column(name="DiaChi")
	private String address;
	
	@Column(name="Email")
	private String email;
	
	@Column(name = "NgaySinh")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/YYYY")
	private Date dob;
	
	@Column(name = "SDT")
	private String phonenumber;
	
	@Column(name = "TaiKhoan")
	private String userName;
	
//	@ManyToOne
//	@JoinColumn (name = "TaiKhoan")
//	private AccountEntity accounts;
//	
//	@OneToMany(mappedBy = "customers", fetch = FetchType.EAGER)
//	private Collection<RegisterEntity> registerEntities;
	

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public CustomerEntity(String customerId, String name, int gender, String address, String email, Date dob,
			String phonenumber, String userName, AccountEntity accounts, Collection<RegisterEntity> registerEntities) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.dob = dob;
		this.phonenumber = phonenumber;
		this.userName = userName;
//		this.accounts = accounts;
//		this.registerEntities = registerEntities;
	}

	public CustomerEntity() {
		super();
	}


	
	
	
}
