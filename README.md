[![Build Status](https://travis-ci.com/ahmetersxn/teknikservis.svg?branch=master)](https://travis-ci.com/ahmetersxn/teknikservis)

# Teknik Servis / Spring Boot Projesi 


# Başlanhıç Sqlleri 

```sql
INSERT INTO TBL_MUSTERI VALUES (1, 'Veli','konya','veli@gmail.com' ,'ali',14,0553); 
INSERT INTO TBL_MUSTERI VALUES (2, 'Hasan','İstanbul','hasan@gmail.com' ,'şahin',15,0554); 
INSERT INTO TBL_URUN VALUES (1, 1.0, null,'2019-05-05','İNTEL','CORE İ5',1); 
INSERT INTO TBL_URUN VALUES (2, 2.0, null,'2019-05-05','İNTEL','CORE İ7',1); 
INSERT INTO TBL_URUN VALUES (3, 3.0, null,'2019-05-05','İNTEL','CORE İ3',2); 
INSERT INTO TBL_CALISAN VALUES (1, 'Kamil','Teknik Servis', 'Güzel'); 
INSERT INTO TBL_CALISAN VALUES (2, 'Ayşe','Teknik Servis Uzmanı', 'İyi'); 
INSERT INTO TBL_BAKIM VALUES (1, 'Urun teslim Edildi',  '2019-05-05',1,2); 
INSERT INTO TBL_BAKIM VALUES (2, 'Urun parşalandı',  '2019-05-05',1,2); 
INSERT INTO TBL_BAKIM VALUES (3, 'Urun Tamir Edildi',  '2019-05-05',2,2); 
```




# Musteri

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| /rest/musteri | `GET` | Empty | Tüm kayitlari listeler |
| /rest/musteri | `POST` | Empty | Yeni kayit ekleme |
| /rest/musteri/:id | `GET` | Empty | Bir kayit getirir. |
| /rest/musteri/:id | `POST` | Empty | Bir kayit günceller |
| /rest/musteri/:id | `DELETE` | Empty | Bir kayit siler |

### Example : GET /rest/musteri 

Example: https://teknikservis.herokuapp.com/rest/musteri

Response body:

```json
[
    {
        "musteriId": 1,
        "tc": 14,
        "adi": "Veli",
        "soyadi": "ali",
        "mail": "veli@gmail.com",
        "telefon": 553,
        "adres": "konya",
        "urun": [
            {
                "urunId": 1,
                "model": "CORE İ5",
                "marka": "İNTEL",
                "gelisTarihi": "2019-05-05",
                "bitisTarihi": null,
                "bakimFiyati": 1.0,
                "bakim": []
            },
            {
                "urunId": 2,
                "model": "CORE İ7",
                "marka": "İNTEL",
                "gelisTarihi": "2019-05-05",
                "bitisTarihi": null,
                "bakimFiyati": 2.0,
                "bakim": [
                    {
                        "bakimId": 1,
                        "bakimAciklama": "Urun teslim Edildi",
                        "bakimTarihi": "2019-05-05",
                        "calisan": {
                            "calisanId": 1,
                            "adi": "Kamil",
                            "soyadi": "Güzel",
                            "gorevi": "Teknik Servis"
                        }
                    },
                    {
                        "bakimId": 2,
                        "bakimAciklama": "Urun parşalandı",
                        "bakimTarihi": "2019-05-05",
                        "calisan": {
                            "calisanId": 1,
                            "adi": "Kamil",
                            "soyadi": "Güzel",
                            "gorevi": "Teknik Servis"
                        }
                    },
                    {
                        "bakimId": 3,
                        "bakimAciklama": "Urun Tamir Edildi",
                        "bakimTarihi": "2019-05-05",
                        "calisan": {
                            "calisanId": 2,
                            "adi": "Ayşe",
                            "soyadi": "İyi",
                            "gorevi": "Teknik Servis Uzmanı"
                        }
                    }
                ]
            }
        ]
    },
    {
        "musteriId": 2,
        "tc": 15,
        "adi": "Hasan",
        "soyadi": "şahin",
        "mail": "hasan@gmail.com",
        "telefon": 554,
        "adres": "İstanbul",
        "urun": [
            {
                "urunId": 3,
                "model": "CORE İ3",
                "marka": "İNTEL",
                "gelisTarihi": "2019-05-05",
                "bitisTarihi": null,
                "bakimFiyati": 3.0,
                "bakim": []
            }
        ]
    }
]
```

### GET /rest/urun

Example: https://teknikservis.herokuapp.com/rest/urun

Response body:

```json
[
  {
    "urunId": 1,
    "model": "CORE İ5",
    "marka": "İNTEL",
    "gelisTarihi": "2019-05-05",
    "bitisTarihi": null,
    "bakimFiyati": 1.0,
    "bakim": [
      
    ]
  },
  {
    "urunId": 2,
    "model": "CORE İ7",
    "marka": "İNTEL",
    "gelisTarihi": "2019-05-05",
    "bitisTarihi": null,
    "bakimFiyati": 2.0,
    "bakim": [
      {
        "bakimId": 3,
        "bakimAciklama": "Urun Tamir Edildi",
        "bakimTarihi": "2019-05-05",
        "calisan": {
          "calisanId": 2,
          "adi": "Ayşe",
          "soyadi": "İyi",
          "gorevi": "Teknik Servis Uzmanı"
        }
      },
      {
        "bakimId": 1,
        "bakimAciklama": "Urun teslim Edildi",
        "bakimTarihi": "2019-05-05",
        "calisan": {
          "calisanId": 1,
          "adi": "Kamil",
          "soyadi": "Güzel",
          "gorevi": "Teknik Servis"
        }
      },
      {
        "bakimId": 2,
        "bakimAciklama": "Urun parşalandı",
        "bakimTarihi": "2019-05-05",
        "calisan": {
          "calisanId": 1,
          "adi": "Kamil",
          "soyadi": "Güzel",
          "gorevi": "Teknik Servis"
        }
      }
    ]
  },
  {
    "urunId": 3,
    "model": "CORE İ3",
    "marka": "İNTEL",
    "gelisTarihi": "2019-05-05",
    "bitisTarihi": null,
    "bakimFiyati": 3.0,
    "bakim": [
      
    ]
  }
]
```

### GET /rest/bakim

Example: https://teknikservis.herokuapp.com/rest/bakim

Response body:

```json
[
  {
    "bakimId": 1,
    "bakimAciklama": "Urun teslim Edildi",
    "bakimTarihi": "2019-05-05",
    "calisan": {
      "calisanId": 1,
      "adi": "Kamil",
      "soyadi": "Güzel",
      "gorevi": "Teknik Servis"
    }
  },
  {
    "bakimId": 2,
    "bakimAciklama": "Urun parşalandı",
    "bakimTarihi": "2019-05-05",
    "calisan": {
      "calisanId": 1,
      "adi": "Kamil",
      "soyadi": "Güzel",
      "gorevi": "Teknik Servis"
    }
  },
  {
    "bakimId": 3,
    "bakimAciklama": "Urun Tamir Edildi",
    "bakimTarihi": "2019-05-05",
    "calisan": {
      "calisanId": 2,
      "adi": "Ayşe",
      "soyadi": "İyi",
      "gorevi": "Teknik Servis Uzmanı"
    }
  }
]
```

### GET /rest/calisan

Example: https://teknikservis.herokuapp.com/rest/calisan

Response body:

```json
[
  {
    "calisanId": 1,
    "adi": "Kamil",
    "soyadi": "Güzel",
    "gorevi": "Teknik Servis"
  },
  {
    "calisanId": 2,
    "adi": "Ayşe",
    "soyadi": "İyi",
    "gorevi": "Teknik Servis Uzmanı"
  }
]
```
