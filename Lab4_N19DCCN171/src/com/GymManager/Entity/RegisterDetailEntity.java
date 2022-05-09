package com.GymManager.Entity;

import java.util.*;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CT_TTDK")
public class RegisterDetailEntity {
	@Id
	@Column(name = "MaGoi")
	private String packId;
	
	@Column(name = "TenGoi")
	private String packName;
	
	@Column(name = "ThoiHanGoi")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/YYYY")
	private Date packDuration;
	
	@Column(name = "TrangThai")
	private String status;
	
	@Column(name = "LoaiGoi")
	private String trainingPack;
	
	@Column(name ="GiaTien")
	private float money;

	public String getPackId() {
		return packId;
	}

	public void setPackId(String packId) {
		this.packId = packId;
	}

	public String getPackName() {
		return packName;
	}

	public void setPackName(String packName) {
		this.packName = packName;
	}


	public Date getPackDuration() {
		return packDuration;
	}

	public void setPackDuration(Date packDuration) {
		this.packDuration = packDuration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTrainingPack() {
		return trainingPack;
	}

	public void setTrainingPack(String trainingPack) {
		this.trainingPack = trainingPack;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public RegisterDetailEntity(String packId, String packName, Date packDuration, String status, String trainingPack,
			float money) {
		super();
		this.packId = packId;
		this.packName = packName;
		this.packDuration = packDuration;
		this.status = status;
		this.trainingPack = trainingPack;
		this.money = money;
	}

	public RegisterDetailEntity() {
		super();
	}


	
}
