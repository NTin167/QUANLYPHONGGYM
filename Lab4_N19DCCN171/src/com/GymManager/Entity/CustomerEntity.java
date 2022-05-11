package com.GymManager.Entity;

import java.util.*;
import java.util.Collection;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "KHACHHANG")
public class CustomerEntity {
	@Id
	@Column(name = "MaKH")
	private String customerId;
	@Column(name = "HoTen")
	private String name;
	@Column(name = "Phai")
	private int gender;
	@Column(name = "DiaChi")
	private String address;

	@Column(name = "Email")
	private String email;

	@Column(name = "NgaySinh")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;

	@Column(name = "SDT")
	private String phonenumber;

	@Column(name = "TaiKhoan")
	private String username;

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

	public Date getbirthday() {
		return birthday;
	}

	public void setbirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public CustomerEntity(String customerId, String name, int gender, String address, String email, Date birthday,
			String phonenumber, String username, AccountEntity accounts, Collection<RegisterEntity> registerEntities) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.birthday = birthday;
		this.phonenumber = phonenumber;
		this.username = username;
//		this.accounts = accounts;
//		this.registerEntities = registerEntities;
	}

	public CustomerEntity() {
		super();
	}

}
