package com.ahmetersin.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tbl_bakim")
public class Bakim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bakim_id")
    private long bakimId;
    @Column(name = "bakim_aciklama")
    private String bakimAciklama;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "bakim_tarihi")
    private java.util.Date bakimTarihi;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "urun_id", nullable = false)
    private Urun urun;


    @ManyToOne
    @JoinColumn(name = "calisan_id")
    private Calisan calisan;

    public long getBakimId() {
        return bakimId;
    }

    public void setBakimId(long bakimId) {
        this.bakimId = bakimId;
    }

    public String getBakimAciklama() {
        return bakimAciklama;
    }

    public void setBakimAciklama(String bakimAciklama) {
        this.bakimAciklama = bakimAciklama;
    }

    public Date getBakimTarihi() {
        return bakimTarihi;
    }

    public void setBakimTarihi(Date bakimTarihi) {
        this.bakimTarihi = bakimTarihi;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public Calisan getCalisan() {
        return calisan;
    }

    public void setCalisan(Calisan calisan) {
        this.calisan = calisan;
    }

    @Override
    public String toString() {
        return "Bakim{" +
                "bakimId=" + bakimId +
                ", bakimAciklama='" + bakimAciklama + '\'' +
                ", bakimTarihi=" + bakimTarihi +
                ", calisan=" + calisan +
                '}';
    }
}
