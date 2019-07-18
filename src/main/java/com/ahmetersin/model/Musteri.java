package com.ahmetersin.model;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "tbl_musteri")
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "musteri_id")
    private long musteriId;
    @Column(name = "tc")
    private long tc;
    @Column(name = "adi")
    private String adi;
    @Column(name = "soyadi")
    private String soyadi;
    @Column(name = "mail")
    private String mail;
    @Column(name = "telefon")
    private int telefon;
    @Column(name = "adres")
    private String adres;


    @OneToMany(mappedBy = "musteri")
    private Set<Urun> urun;

    public long getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(long musteriId) {
        this.musteriId = musteriId;
    }

    public long getTc() {
        return tc;
    }

    public void setTc(long tc) {
        this.tc = tc;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Set<Urun> getUrun() {
        return urun;
    }

    public void setUrun(Set<Urun> urun) {
        this.urun = urun;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "musteriId=" + musteriId +
                ", tc=" + tc +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", mail='" + mail + '\'' +
                ", telefon=" + telefon +
                ", adres='" + adres + '\'' +
                '}';
    }
}
