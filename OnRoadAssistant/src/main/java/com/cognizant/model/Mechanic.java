package com.cognizant.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mechanics")
public class Mechanic {

	@Id
	@Column(name="MECHANIC_ID")
	private int mechanicId;
	@Column(name="MECHANIC_NAME")
	private String mechanicName;
	@Column(name="MECHANIC_BIRTH")
	private Date mechanicDob;
	@Column(name="MECHANIC_GENDER")
	private int mechanicGender;
	@Column(name="MECHANIC_CONTACT_NO")
	private Long mechanicContactNo;
	@Column(name="MECHANIC_EMAIL_ID")
    private String mechanicEmailId;
	@Column(name="MECHANIC_PASSWORD")
    private String mechanicPassword;
	@Column(name="MECHANIC_LATITUDE")
    private Double mechanicLatitude;
	@Column(name="MECHANIC_LONGITUDE")
    private Double mechanicLongigtude;

	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}

	public String getMechanicName() {
		return mechanicName;
	}

	public void setMechanicName(String mechanicName) {
		this.mechanicName = mechanicName;
	}

	public Date getMechanicDob() {
		return mechanicDob;
	}

	public void setMechanicDob(Date mechanicDob) {
		this.mechanicDob = mechanicDob;
	}

	public int getMechanicGender() {
		return mechanicGender;
	}

	public void setMechanicGender(int mechanicGender) {
		this.mechanicGender = mechanicGender;
	}

	public Long getMechanicContactNo() {
		return mechanicContactNo;
	}

	public void setMechanicContactNo(Long mechanicContactNo) {
		this.mechanicContactNo = mechanicContactNo;
	}

	public String getMechanicEmailId() {
		return mechanicEmailId;
	}

	public void setMechanicEmailId(String mechanicEmailId) {
		this.mechanicEmailId = mechanicEmailId;
	}

	public String getMechanicPassword() {
		return mechanicPassword;
	}

	public void setMechanicPassword(String mechanicPassword) {
		this.mechanicPassword = mechanicPassword;
	}

	public Double getMechanicLatitude() {
		return mechanicLatitude;
	}

	public void setMechanicLatitude(Double mechanicLatitude) {
		this.mechanicLatitude = mechanicLatitude;
	}

	public Double getMechanicLongigtude() {
		return mechanicLongigtude;
	}

	public void setMechanicLongigtude(Double mechanicLongigtude) {
		this.mechanicLongigtude = mechanicLongigtude;
	}

}
