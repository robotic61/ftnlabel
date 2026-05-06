package com.forthems.ftnlabel.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "FTN", schema = "dbo")
public class Ftn {

    @Id
    @Column(name = "FTN_No")
    private String ftnNo; // Primary key
    // field name is used to match with JSON body

    @Column(name = "Material_No")
    private String pn;

    @Column(name = "MSL")
    private String msl; // All NULL

    @Column(name = "Description")
    private String description;

    @Column(name = "Brand")
    private String brand;

    @Column(name = "Maker")
    private String maker;

    @Column(name = "DateCode")
    private String dc; // mostly NULL

    @Column(name = "latest_expire_date")
    private LocalDateTime exp;

    @Column(name = "LotCode")
    private String lotCode;

    @Column(name = "CustBatch")
    private String custBatch;

    @Column(name = "CustomerPart")
    private String custPart;

    @Column(name = "Batch")
    private String batch;

    @Column(name = "Shelf")
    private String shelf;

    @Column(name = "Project")
    private String project;

    @Column(name = "Qty")
    private Integer qty;
    // can always use wrapper type(class type),
    // for field names, in case db column is NULL,
    // int default = 0
    // INTEGER default = NULL

    @Column(name = "BaseUnit")
    private String baseUnit;

    public String getFtnNo() {
        return ftnNo;
    }

    public void setFtnNo(String ftnNo) {
        this.ftnNo = ftnNo;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMsl() {
        return msl;
    }

    public void setMsl(String msl) {
        this.msl = msl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public LocalDateTime getExp() {
        return exp;
    }

    public void setExp(LocalDateTime exp) {
        this.exp = exp;
    }

    public String getLotCode() {
        return lotCode;
    }

    public void setLotCode(String lotCode) {
        this.lotCode = lotCode;
    }

    public String getCustBatch() {
        return custBatch;
    }

    public void setCustBatch(String custBatch) {
        this.custBatch = custBatch;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getBaseUnit() {
        return baseUnit;
    }

    public void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }

    public String getCustPart() {
        return custPart;
    }

    public void setCustPart(String custPart) {
        this.custPart = custPart;
    }


}
