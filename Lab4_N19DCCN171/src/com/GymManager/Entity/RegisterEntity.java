package com.GymManager.Entity;

import java.util.*;
import java.util.Collection;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "THONGTINDK")
public class RegisterEntity {
	@Id
	@Column(name = "MaTTDK")
	private String registerId;
	
	@Column(name = "NgayDK")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/YYYY")
	private Date registerDate;
	
	@Column(name = "MaKH")
	private String customerId;
	
	@Column(name = "TrangThai")
	private int status;
	
	@Column(name = "NguoiTao")
	private String userName;
	
//	@ManyToOne
//	@JoinColumn(name = "MaKH")
//	private CustomerEntity customers;

	public String getRegisterId() {
		return registerId;
	}

	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public RegisterEntity(String registerId, Date registerDate, String customerId, int status, String userName,
			CustomerEntity customers) {
		super();
		this.registerId = registerId;
		this.registerDate = registerDate;
		this.customerId = customerId;
		this.status = status;
		this.userName = userName;
//		this.customers = customers;
	}

	public RegisterEntity() {
		super();
	}


	
}
