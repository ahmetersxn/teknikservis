package com.ahmetersin.servicetest;


import com.ahmetersin.model.Musteri;
import com.ahmetersin.service.MusteriService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertTrue;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MusteriServiceTest {

    Musteri musteri = new Musteri();

    @Autowired
    private MusteriService musteriService;


    public void musterikayit() throws Exception {
        musteri.setTc(14l);
        musteri.setAdi("Veli");
        musteri.setSoyadi("Ali");
        musteri.setMail("veli@gmail.com");
        musteri.setTelefon(555);
        musteri.setAdres("Konya");
        musteriService.kayitMusteri(musteri);
    }
    @Test
    public void kayitMusteri() throws Exception {
        musteri.setTc(14l);
        musteri.setAdi("Veli");
        musteri.setSoyadi("Ali");
        musteri.setMail("veli@gmail.com");
        musteri.setTelefon(555);
        musteri.setAdres("Konya");
        musteriService.kayitMusteri(musteri);
        assertTrue(null !=musteriService.birKayitGetir(musteri.getMusteriId()));
    }
    @Test
    public void tumKayitlariGetir() throws Exception {
        musterikayit();
        List<Musteri> musteriList = musteriService.tumKayitlariGetir();
         assertTrue(musteriList.size()>0);
    }
    @Test
    public void birKayitGetir() throws Exception {
        musterikayit();
        Musteri tekMusteri=
        musteriService.birKayitGetir(musteri.getMusteriId());
        assertTrue(tekMusteri != null);
    }
    @Test
    public void sil() throws Exception {
        musterikayit();
        Musteri silinecekMusteri = musteriService.birKayitGetir(musteri.getMusteriId());
        musteriService.sil(silinecekMusteri.getMusteriId());
        assertTrue(null ==musteriService.birKayitGetir(silinecekMusteri.getMusteriId()));
    }
}
