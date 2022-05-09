package com.GymManager.Entity;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "LOP")
public class ClassEntity {
	@Id
	@Column(name = "MaLop")
	private String classId;
	
	@Column(name = "NgayMoDK")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	private Date dateOpen;
	
	@Column(name = "NgayDongDK")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	private Date dateClose;
	
	@Column(name = "NgayBatDauLop")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	private Date dateStart;
	
	@Column(name = "SoLuongNguoiToiDa")
	private int maxPP;
	
	@Column(name = "PT")
	private String PT;
	
	@Column(name = "MaGoi")
	private String packId;

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public Date getDateOpen() {
		return dateOpen;
	}

	public void setDateOpen(Date dateOpen) {
		this.dateOpen = dateOpen;
	}

	public Date getDateClose() {
		return dateClose;
	}

	public void setDateClose(Date dateClose) {
		this.dateClose = dateClose;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public int getMaxPP() {
		return maxPP;
	}

	public void setMaxPP(int maxPP) {
		this.maxPP = maxPP;
	}

	public String getPT() {
		return PT;
	}

	public void setPT(String pT) {
		PT = pT;
	}

	public String getPackId() {
		return packId;
	}

	public void setPackId(String packId) {
		this.packId = packId;
	}

	public ClassEntity(String classId, Date dateOpen, Date dateClose, Date dateStart, int maxPP, String pT,
			String packId) {
		super();
		this.classId = classId;
		this.dateOpen = dateOpen;
		this.dateClose = dateClose;
		this.dateStart = dateStart;
		this.maxPP = maxPP;
		PT = pT;
		this.packId = packId;
	}

	public ClassEntity() {
		super();
	}


	
	
}
