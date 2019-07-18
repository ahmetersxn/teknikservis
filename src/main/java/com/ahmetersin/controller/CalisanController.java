package com.ahmetersin.controller;


import com.ahmetersin.model.Calisan;
import com.ahmetersin.service.CalisanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class CalisanController {
    @Autowired
    CalisanService calisanService;

    @PostMapping("/calisan")
    public ResponseEntity<?> kayit(@RequestBody Calisan calisan) {
        calisanService.kayitCalisan(calisan);
        return ResponseEntity.ok().body(calisan);
    }

    @PostMapping("/calisan/{id}")
    public ResponseEntity<?> guncelle(@PathVariable("id") int id, @RequestBody Calisan calisan) {
        Calisan calisanUpdate = calisanService.birKayitGetir(id);
        calisanUpdate.setAdi(calisan.getAdi());
        calisanUpdate.setSoyadi(calisan.getSoyadi());
        calisanUpdate.setGorevi(calisan.getGorevi());

        calisanService.kayitCalisan(calisanUpdate);
        return ResponseEntity.ok().body(calisan);
    }

    @DeleteMapping("/calisan/{id}")
    public ResponseEntity<?> sil(@PathVariable("id") long id) {
        calisanService.sil(id);
        return ResponseEntity.ok().body("İşlem Tamamlandı.");
    }

    @GetMapping("/calisan")
    public ResponseEntity<?> tumKayitlar() {
        return ResponseEntity.ok(calisanService.tumKayitlariGetir());
    }

    @GetMapping("/calisan/{id}")
    public ResponseEntity<?> birKayitGetir(@PathVariable("id") long id) {
        return ResponseEntity.ok(calisanService.birKayitGetir(id));
    }
}
