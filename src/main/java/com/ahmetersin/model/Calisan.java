package com.ahmetersin.model;


import javax.persistence.*;

@Entity(name = "tbl_calisan")
public class Calisan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calisan_id")
    private long calisanId;
    @Column(name = "adi")
    private String adi;
    @Column(name = "soyadi")
    private String soyadi;
    @Column(name = "gorevi")
    private String gorevi;


    public long getCalisanId() {
        return calisanId;
    }

    public void setCalisanId(long calisanId) {
        this.calisanId = calisanId;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "calisanId=" + calisanId +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }
}
