package com.ahmetersin.controller;

import com.ahmetersin.model.Urun;
import com.ahmetersin.service.UrunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class UrunController {
    @Autowired
    UrunService urunService;

    @PostMapping("/urun/{musteriId}")
    public ResponseEntity<?> kayit(@PathVariable("musteriId") long musteriId,@RequestBody Urun urun){
            urunService.kayitUrun(urun,musteriId);
        return ResponseEntity.ok().body(urun);
    }

    @PutMapping("/urun/{id}")
    public ResponseEntity<?> guncelle(@PathVariable("id") int id, @RequestBody Urun urun) {
        Urun urunGuncelle = urunService.birKayitGetir(id);
        urunGuncelle.setBakimFiyati(urun.getBakimFiyati());
        urunGuncelle.setBitisTarihi(urun.getBitisTarihi());
        urunGuncelle.setGelisTarihi(urun.getGelisTarihi());
        urunGuncelle.setMarka(urun.getMarka());
        urunGuncelle.setModel(urun.getModel());

        urunService.guncelle(urunGuncelle);
        return ResponseEntity.ok().body(urunGuncelle);
    }

    @DeleteMapping("/urun/{id}")
    public ResponseEntity<?> sil(@PathVariable("id") long id) {
        urunService.sil(id);
        return ResponseEntity.ok().body("İşlem Tamamlandı.");
    }

    @GetMapping("/urun")
    public ResponseEntity<?> tumKayitlar() {
        return ResponseEntity.ok(urunService.tumKayitlariGetir());
    }
    @GetMapping("/urun/{id}")
    public ResponseEntity<?> birKayitGetir(@PathVariable("id") long id) {
        return ResponseEntity.ok(urunService.birKayitGetir(id));
    }

}
