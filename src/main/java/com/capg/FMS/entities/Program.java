
package com.capg.FMS.entities;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name="Program")
public class Program {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String trainingId;
	@Column(name = "Start_Date",nullable=false)
	private LocalDate startDate;
	@Column(name = "End_Date",nullable=false)
	private LocalDate endDate;
	@OneToOne
	private Course course;//annotation @1:1
	@OneToOne
	private Employee faculty;//saa
	
	public String getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}
