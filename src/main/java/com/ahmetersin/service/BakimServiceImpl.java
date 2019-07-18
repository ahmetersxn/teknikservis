package com.ahmetersin.service;

import com.ahmetersin.model.Bakim;
import com.ahmetersin.model.Urun;
import com.ahmetersin.repository.BakimRepository;
import com.ahmetersin.repository.UrunRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BakimServiceImpl implements BakimService {

    private static final Logger log = LogManager.getLogger(CalisanServiceImpl.class);

    @Autowired
    BakimRepository bakimRepository;


    @Autowired
    UrunRepository urunRepository;

    @Override
    public Bakim kayitBakim(Bakim bakim, long urunId) {
        Urun urun = urunRepository.findById(urunId).orElse(null);
        bakim.setUrun(urun);
        log.info(" Bakim kaydı yapıldı.!"+bakim.toString());
        return bakimRepository.save(bakim);
    }

    @Override
    public Bakim guncelle(Bakim bakim) {
        log.info(" Bakim güncellenme yapıldı.!"+bakim.toString());
        return  bakimRepository.save(bakim);
    }

    @Override
    public List<Bakim> tumKayitlariGetir() {
        log.info("Tüm bakimlar çağırıldı.!");
        return bakimRepository.findAll();
    }

    @Override
    public Bakim birKayitGetir(long id) {
        log.info(id+" Id'li bakim çağırıldı.!");
        return bakimRepository.findById(id).orElse(null);
    }

    @Override
    public void sil(long id) {
        log.info(id+" Id'li bakim silindi.!");
        bakimRepository.deleteById(id);
    }
}
