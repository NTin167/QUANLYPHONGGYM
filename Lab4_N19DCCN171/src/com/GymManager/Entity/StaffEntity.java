package com.GymManager.Entity;

import java.util.*;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "NHANVIEN")
public class StaffEntity {
	
	@Id
	@Column(name = "MaNV")
	private String staffId;
	
	@Column(name = "HoTen")
	private String staffName;
	
	@Column(name = "Phai")
	private int gender;
	
	@Column(name = "CMND")
	private String identityCard;
	
	@Column(name = "DiaChi")
	private String address;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "NgaySinh")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	private Date birthday;
	
	@Column(name = "SDT")
	private String phoneNumber;
	
	@Column(name = "TaiKhoan")
	private String userName;

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public StaffEntity(String staffId, String staffName, int gender, String identityCard, String address, String email,
			Date birthday, String phoneNumber, String userName) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.gender = gender;
		this.identityCard = identityCard;
		this.address = address;
		this.email = email;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
	}

	public StaffEntity() {
		super();
	}


	
}
