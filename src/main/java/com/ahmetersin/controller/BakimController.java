package com.ahmetersin.controller;


import com.ahmetersin.model.Bakim;
import com.ahmetersin.service.BakimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class BakimController {

    @Autowired
    BakimService bakimService;

    @PostMapping("/bakim/{urunId}")
    public ResponseEntity<?> kayit(@PathVariable("urunId") long urunId, @RequestBody Bakim bakim){
        bakimService.kayitBakim(bakim,urunId);
        return ResponseEntity.ok().body(bakim);
    }

    @PutMapping("/bakim/{id}")
    public ResponseEntity<?> guncelle(@PathVariable("id") int id, @RequestBody Bakim bakim) {
        Bakim bakimGuncelle = bakimService.birKayitGetir(id);
        bakimGuncelle.setBakimAciklama(bakim.getBakimAciklama());
        bakimGuncelle.setBakimTarihi(bakim.getBakimTarihi());
        bakimGuncelle.setCalisan(bakim.getCalisan());
        bakimService.guncelle(bakimGuncelle);
        return ResponseEntity.ok().body(bakimGuncelle);
    }

    @DeleteMapping("/bakim/{id}")
    public ResponseEntity<?> sil(@PathVariable("id") long id) {
        bakimService.sil(id);
        return ResponseEntity.ok().body("İşlem Tamamlandı.");
    }

    @GetMapping("/bakim")
    public ResponseEntity<?> tumKayitlar() {
        return ResponseEntity.ok(bakimService.tumKayitlariGetir());
    }
    @GetMapping("/bakim/{id}")
    public ResponseEntity<?> birKayitGetir(@PathVariable("id") long id) {
        return ResponseEntity.ok(bakimService.birKayitGetir(id));
    }

}
