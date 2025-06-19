package com.example.vendorregistration;

public class VendorRequest {
    private String companyName;
    private String taxId;
    private String sector;
    private String category;
    private int yearsExperience;
    private String bankDetails;
    private String licenseNumber;
    private String complianceCertificates;
    private String paymentTerms;
    
    // Getters
    public String getCompanyName() {
        return companyName;
    }

    public String getTaxId() {
        return taxId;
    }

    public String getSector() {
        return sector;
    }

    public String getCategory() {
        return category;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getComplianceCertificates() {
        return complianceCertificates;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    // Setters
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setComplianceCertificates(String complianceCertificates) {
        this.complianceCertificates = complianceCertificates;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    // Optional: toString() method for debugging
    @Override
    public String toString() {
        return "VendorRequest{" +
                "companyName='" + companyName + '\'' +
                ", taxId='" + taxId + '\'' +
                ", sector='" + sector + '\'' +
                ", category='" + category + '\'' +
                ", yearsExperience=" + yearsExperience +
                ", bankDetails='" + bankDetails + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", complianceCertificates='" + complianceCertificates + '\'' +
                ", paymentTerms='" + paymentTerms + '\'' +
                '}';
    }
}