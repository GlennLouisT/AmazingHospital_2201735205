package com.example.amazinghospital_2201735205.model;

public class Hospital {
    private String HospitalName;
    private String HospitalEmail;
    private String HospitalPhone;
    private String ProvinceName;

    public Hospital(String hospitalName, String hospitalEmail, String hospitalPhone, String provinceName) {
        HospitalName = hospitalName;
        HospitalEmail = hospitalEmail;
        HospitalPhone = hospitalPhone;
        ProvinceName = provinceName;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

    public String getHospitalEmail() {
        return HospitalEmail;
    }

    public void setHospitalEmail(String hospitalEmail) {
        HospitalEmail = hospitalEmail;
    }

    public String getHospitalPhone() {
        return HospitalPhone;
    }

    public void setHospitalPhone(String hospitalPhone) {
        HospitalPhone = hospitalPhone;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String provinceName) {
        ProvinceName = provinceName;
    }
}
