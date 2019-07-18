package com.ahmetersin.service;

import com.ahmetersin.model.Bakim;

import java.util.List;

public interface BakimService {
    Bakim kayitBakim(Bakim bakim,long urunId);
    Bakim guncelle(Bakim bakim);
    List<Bakim> tumKayitlariGetir();
    Bakim birKayitGetir(long id);
    void sil(long id);
}
