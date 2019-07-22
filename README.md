[![Build Status](https://travis-ci.com/ahmetersxn/teknikservis.svg?branch=master)](https://travis-ci.com/ahmetersxn/teknikservis)

# teknikservis *





### GET /rest/musteri

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