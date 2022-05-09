package com.GymManager.Entity;

import javax.persistence.*;

@Entity
@Table(name = "TKB_LOP")
public class ScheduleEntity {
	@Id
	@Column(name = "MaLop")
	private String classId;
	
	@Column(name ="Thu")
	private int day;
	
	@Column (name="Buoi")
	private int session;

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getSession() {
		return session;
	}

	public void setSession(int session) {
		this.session = session;
	}

	public ScheduleEntity(String classId, int day, int session) {
		super();
		this.classId = classId;
		this.day = day;
		this.session = session;
	}

	public ScheduleEntity() {
		super();
	}


	
}
