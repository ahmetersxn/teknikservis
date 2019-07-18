package com.ahmetersin.service;

import com.ahmetersin.model.Calisan;

import java.util.List;

public interface CalisanService {
    Calisan kayitCalisan(Calisan calisan);
    List<Calisan> tumKayitlariGetir();
    Calisan birKayitGetir(long id);
    void sil(long id);
}
