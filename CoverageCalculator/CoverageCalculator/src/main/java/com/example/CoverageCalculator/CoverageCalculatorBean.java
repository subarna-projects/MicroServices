package com.example.CoverageCalculator;

import java.math.BigDecimal;

import javax.persistence.Id;

public class CoverageCalculatorBean {
	
	private int id;
	private long premium;
	private int year;
	private BigDecimal interest;
	private BigDecimal coverage;
	public CoverageCalculatorBean() {
		super();
		this.id = id;
		this.premium = premium;
		this.year = year;
		this.interest = interest;
		this.coverage = coverage;
	}
	
	public CoverageCalculatorBean(int id, long premium, int year, BigDecimal interest, BigDecimal coverage) {
		super();
		this.id = id;
		this.premium = premium;
		this.year = year;
		this.interest = interest;
		this.coverage = coverage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPremium() {
		return premium;
	}
	public void setPremium(long premium) {
		this.premium = premium;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public BigDecimal getInterest() {
		return interest;
	}
	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}
	public BigDecimal getCoverage() {
		return coverage;
	}
	public void setCoverage(BigDecimal coverage) {
		this.coverage = coverage;
	}
	

}
