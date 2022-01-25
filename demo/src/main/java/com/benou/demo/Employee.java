package com.benou.demo;

public class Employee {

    private String empTid;
    private String name;
    private String district;
    private String phone;
    private String Dept;

    public Employee(String empTid, String name, String district, String phone, String dept) {
        this.empTid = empTid;
        this.name = name;
        this.district = district;
        this.phone = phone;
        Dept = dept;
    }

    public String getEmpTid() {
        return empTid;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public String getPhone() {
        return phone;
    }

    public String getDept() {
        return Dept;
    }
}
