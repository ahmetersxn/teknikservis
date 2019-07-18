package com.ahmetersin.service;

import com.ahmetersin.model.Musteri;
import com.ahmetersin.model.Urun;
import com.ahmetersin.repository.MusteriRepository;
import com.ahmetersin.repository.UrunRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrunServiceImpl implements UrunService {

    private static final Logger log = LogManager.getLogger(UrunServiceImpl.class);

    @Autowired
    UrunRepository urunRepository;

    @Autowired
    MusteriRepository musteriRepository;

    @Override
    public Urun kayitUrun(Urun urun,long musteriId) {
        Musteri musteri = musteriRepository.findById(musteriId).orElse(null);
        urun.setMusteri(musteri);
        log.info(" Ürün kaydı yapıldı.!"+urun.toString());
        return urunRepository.save(urun);
    }

    @Override
    public Urun guncelle(Urun urun) {
        log.info(" Ürün güncelleme yapıldı.!"+urun.toString());
        return urunRepository.save(urun);
    }

    @Override
    public List<Urun> tumKayitlariGetir() {
        log.info("Tüm ürünler çağırıldı.!");
        return urunRepository.findAll();
    }

    @Override
    public Urun birKayitGetir(long id) {
        log.info(id+" Id'li ürün çağırıldı.!");
        return urunRepository.findById(id).orElse(null);
    }

    @Override
    public void sil(long id) {
        log.info(id+" Id'li ürün silindi.!");
        urunRepository.deleteById(id);
    }
}
