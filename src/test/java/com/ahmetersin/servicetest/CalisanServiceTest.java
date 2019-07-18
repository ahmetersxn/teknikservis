package com.ahmetersin.servicetest;

import com.ahmetersin.model.Calisan;
import com.ahmetersin.service.CalisanService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalisanServiceTest {
    Calisan calisan = new Calisan();

    @Autowired
    private CalisanService calisanService;


    public void calisanKayit() throws Exception {
        calisan.setAdi("Ali");
        calisan.setSoyadi("Veli");
        calisan.setGorevi("Teknik Servis");
        calisanService.kayitCalisan(calisan);
    }
    @Test
    public void kayitMusteri() throws Exception {
        calisan.setAdi("Ali");
        calisan.setSoyadi("Veli");
        calisan.setGorevi("Teknik Servis");
        calisanService.kayitCalisan(calisan);
        assertTrue(null !=calisanService.birKayitGetir(calisan.getCalisanId()));
    }
    @Test
    public void tumKayitlariGetir() throws Exception {
        calisanKayit();
        List<Calisan> calisanList = calisanService.tumKayitlariGetir();
        assertTrue(calisanList.size()>0);
    }
    @Test
    public void birKayitGetir() throws Exception {
        calisanKayit();
        Calisan tekCalisan = calisanService.birKayitGetir(calisan.getCalisanId());
        assertTrue(tekCalisan != null);
    }
    @Test
    public void sil() throws Exception {
        calisanKayit();
        Calisan silinecekCalisan = calisanService.birKayitGetir(calisan.getCalisanId());
        calisanService.sil(silinecekCalisan.getCalisanId());
        assertTrue(null ==calisanService.birKayitGetir(silinecekCalisan.getCalisanId()));
    }
}
