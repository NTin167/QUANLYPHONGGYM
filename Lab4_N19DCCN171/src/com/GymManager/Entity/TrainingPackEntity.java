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
@Table(name = "GOITAP")
public class TrainingPackEntity {
	@Id
	@Column(name = "MaGoi")
	private String packID;
	
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

	


	 
}
