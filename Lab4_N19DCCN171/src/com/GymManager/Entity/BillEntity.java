package com.GymManager.Entity;

import java.util.*;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="HOADON")


/*
 * MaHD chả(8)
 * NgayTao date
 * MaKM char
 * MaTK	varchar
 * TongTien money
 * MaTTDK char(8)
 */
public class BillEntity {
	@Id
	@Column(name = "MaHD")
	private String billId;
	
	@Column(name = "NgayTao")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/YYYY")
	private Date date;
	
//	@ManyToOne
//	@JoinColumn(name= "MaKM")
	@Column(name = "MaKM")
	private String promotionId;
	
	@Column(name = "MaTK")
	private String  userId;
	
	@Column(name = "TongTien")
	private float money;
	
	@Column(name = "MaTTDK")
	private String registerId;

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public String getRegisterId() {
		return registerId;
	}

	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}
	
	
	
	
}
