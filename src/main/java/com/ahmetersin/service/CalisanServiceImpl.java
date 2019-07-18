package com.ahmetersin.service;

import com.ahmetersin.model.Calisan;
import com.ahmetersin.repository.CalisanRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalisanServiceImpl implements CalisanService {

    private static final Logger log = LogManager.getLogger(CalisanServiceImpl.class);

    @Autowired
    CalisanRepository calisanRepository;

    @Override
    public Calisan kayitCalisan(Calisan calisan) {
        log.info(" Çalişan kaydı yapıldı.!"+calisan.toString());
        return calisanRepository.save(calisan);
    }

    @Override
    public List<Calisan> tumKayitlariGetir() {
        log.info("Tüm çalişanlar çağırıldı.!");
        return calisanRepository.findAll();
    }

    @Override
    public Calisan birKayitGetir(long id) {
        log.info(id+" Id'li çalışan çağırıldı.!");
        return calisanRepository.findById(id).orElse(null);
    }

    @Override
    public void sil(long id) {
        log.info(id+" Id'li çalışan silindi.!");
        calisanRepository.deleteById(id);
    }
}
