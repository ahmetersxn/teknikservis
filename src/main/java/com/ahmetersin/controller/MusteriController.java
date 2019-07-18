package com.ahmetersin.controller;

import com.ahmetersin.model.Musteri;
import com.ahmetersin.service.MusteriServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest")
public class MusteriController {

    @Autowired
    MusteriServiceImpl musteriService;


    @PostMapping("/musteri")
    public ResponseEntity<?> kayit(@RequestBody Musteri musteri) {
            musteriService.kayitMusteri(musteri);
        return ResponseEntity.ok().body(musteri);
    }

    @PostMapping("/musteri/{id}")
    public ResponseEntity<?> guncelle(@PathVariable("id") int id, @RequestBody Musteri musteri) {
            Musteri numsteriUpdate = musteriService.birKayitGetir(id);
                    numsteriUpdate.setTc(musteri.getTc());
                    numsteriUpdate.setAdi(musteri.getAdi());
                    numsteriUpdate.setSoyadi(musteri.getSoyadi());
                    numsteriUpdate.setMail(musteri.getMail());
                    numsteriUpdate.setTelefon(musteri.getTelefon());
                    numsteriUpdate.setAdres(musteri.getAdres());

            musteriService.kayitMusteri(numsteriUpdate);
        return ResponseEntity.ok().body(musteri);
    }

    @DeleteMapping("/musteri/{id}")
    public ResponseEntity<?> sil(@PathVariable("id") long id) {
        musteriService.sil(id);
        return ResponseEntity.ok().body("İşlem Tamamlandı.");
    }

    @GetMapping("/musteri")
    public ResponseEntity<?> tumKayitlar() {
        return ResponseEntity.ok(musteriService.tumKayitlariGetir());
    }

    @GetMapping("/musteri/{id}")
    public ResponseEntity<?> birKayitGetir(@PathVariable("id") long id) {
        return ResponseEntity.ok(musteriService.birKayitGetir(id));
    }
}
