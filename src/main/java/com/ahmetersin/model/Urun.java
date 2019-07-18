package com.ahmetersin.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "tbl_urun")
public class Urun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "urun_id")
    private long urunId;

    @Column(name = "model")
    private String model;

    @Column(name = "marka")
    private String marka;

    @Column(name = "gelis_tarihi")
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    private java.util.Date gelisTarihi;

    @Column(name = "bitis_tarihi")
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    private java.util.Date bitisTarihi;

    @Column(name = "bakim_fiyati")
    private double bakimFiyati;

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "musteri_id", nullable = false)
    private Musteri musteri;


    @OneToMany(mappedBy = "urun")
    private Set<Bakim> bakim;


    public long getUrunId() {
        return urunId;
    }

    public void setUrunId(long urunId) {
        this.urunId = urunId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Date getGelisTarihi() {
        return gelisTarihi;
    }

    public void setGelisTarihi(Date gelisTarihi) {
        this.gelisTarihi = gelisTarihi;
    }

    public Date getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(Date bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public double getBakimFiyati() {
        return bakimFiyati;
    }

    public void setBakimFiyati(double bakimFiyati) {
        this.bakimFiyati = bakimFiyati;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }


    public Set<Bakim> getBakim() {
        return bakim;
    }

    public void setBakim(Set<Bakim> bakim) {
        this.bakim = bakim;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "urunId=" + urunId +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", gelisTarihi=" + gelisTarihi +
                ", bitisTarihi=" + bitisTarihi +
                ", bakimFiyati=" + bakimFiyati +
                '}';
    }
}
