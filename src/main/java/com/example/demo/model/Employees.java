package com.example.demo.model;

import java.util.Date;

public class Employees {

    private String fullName;
    private String jobTitle;
    private String department;
    private String businessUnit;

    enum Gender {
        MALE,
        FEMALE

    }

    private String ethnicity;
    private Integer age;
    private Date hireDate;
    private Float salaryAmount;
    private Character salaryCurrency;
    private Integer bonus;
    private String country;
    private String city;
    private Date exitDate;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Float getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(Float salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public Character getSalaryCurrency() {
        return salaryCurrency;
    }

    public void setSalaryCurrency(Character salaryCurrency) {
        this.salaryCurrency = salaryCurrency;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }
}