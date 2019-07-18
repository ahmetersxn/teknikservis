package com.ahmetersin.service;

import com.ahmetersin.model.Musteri;
import com.ahmetersin.repository.MusteriRepository;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusteriServiceImpl implements MusteriService{


    private static final Logger log = LogManager.getLogger(MusteriServiceImpl.class);

    @Autowired
    MusteriRepository musteriRepository;

    @Override
    public Musteri kayitMusteri(Musteri musteri) {
        log.info(" Müşteri kaydı yapıldı.!"+musteri.toString());
        return musteriRepository.save(musteri);
    }

    @Override
    public List<Musteri> tumKayitlariGetir() {
        log.info("Tüm müşteriler çağırıldı.!");
        return musteriRepository.findAll();
    }

    @Override
    public Musteri birKayitGetir(long id) {
        log.info(id+" Id'li müşteri çağırıldı.!");
        return musteriRepository.findById(id).orElse(null);
    }

    @Override
    public void sil(long id) {
        log.info(id+" Id'li müşteri silindi.!");
        musteriRepository.deleteById(id);
    }
}
