package com.ahmetersin.service;

import com.ahmetersin.model.Urun;

import java.util.List;

public interface UrunService {
    Urun kayitUrun(Urun urun,long musteriId);
    Urun guncelle(Urun urun);
    List<Urun> tumKayitlariGetir();
    Urun birKayitGetir(long id);
    void sil(long id);
}
