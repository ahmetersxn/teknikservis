package com.ahmetersin.service;

import com.ahmetersin.model.Musteri;

import java.util.List;


public interface MusteriService {
    Musteri kayitMusteri(Musteri musteri);
    List<Musteri> tumKayitlariGetir();
    Musteri birKayitGetir(long id);
    void sil(long id);
}
