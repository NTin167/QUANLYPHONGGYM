package com.GymManager.Entity;

import javax.persistence.*;

@Entity
@Table(name = "TKB_LOP")
public class ScheduleEntity {
	@Id
	@Column(name = "MaTKB")
	private String scheduleId;
	
	@OneToOne
	@JoinColumn(name = "MaLop")
	private ClassEntity classEntity;

	@Column(name = "Thu")
	private int day;

	@Column(name = "Buoi")
	private int session;

	public ClassEntity getClassEntity() {
		return classEntity;
	}

	public void setClassEntity(ClassEntity classEntity) {
		this.classEntity = classEntity;
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

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	
}
