package com.GymManager.Entity;

import java.util.Date;
import java.util.Collection;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "TAIKHOAN")
public class AccountEntity {
	@Id
//	@Column(name = "Username")
	private String username;
	
//	@Column(name = "Password")
	private String password;
//	
////	@Column(name = "TrangThai")
//	private int status;
//	
////	@Column(name = "MaQuyen")
//	private String policyId;
//	
//	@Column(name = "NgayTao")
//	@Temporal(TemporalType.DATE)
//	@DateTimeFormat(pattern="dd/MM/YYYY")
//	private Date dateCreate;
	
//	@Column(name = "NgayCapNhap")
//	@Temporal(TemporalType.DATE)
//	@DateTimeFormat(pattern="dd/MM/YYYY")
//	private Date dateUpdate;
	
//	@OneToMany(mappedBy = "accounts", fetch = FetchType.EAGER)
//	private Collection<CustomerEntity> customers;
//	
//	@OneToOne
//	@JoinColumn(name = "MaKH")

	public String getsername() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getpassWord() {
		return password;
	}

	public void setpassWord(String passWord) {
		this.password = passWord;
	}

//	public int getStatus() {
//		return status;
//	}
//
//	public void setStatus(int status) {
//		this.status = status;
//	}
//
//	public String getPolicyId() {
//		return policyId;
//	}
//
//	public void setPolicyId(String policyId) {
//		this.policyId = policyId;
//	}

//	public Date getDateCreate() {
//		return dateCreate;
//	}
//
//	public void setDateCreate(Date dateCreate) {
//		this.dateCreate = dateCreate;
//	}

//	public Date getDateUpdate() {
//		return dateUpdate;
//	}
//
//	public void setDateUpdate(Date dateUpdate) {
//		this.dateUpdate = dateUpdate;
//	}

	public AccountEntity(String userName, String passWord, int status, String policyId, Date dateCreate,
			Date dateUpdate, Collection<CustomerEntity> customers) {
		super();
		this.username = userName;
		this.password = passWord;
//		this.status = status;
//		this.policyId = policyId;
//		this.dateCreate = dateCreate;
//		this.dateUpdate = dateUpdate;
//		this.customers = customers;
	}

	public AccountEntity() {
		super();
	}


	
}
