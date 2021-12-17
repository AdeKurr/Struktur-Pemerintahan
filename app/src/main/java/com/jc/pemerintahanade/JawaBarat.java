package com.jc.pemerintahanade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JawaBarat {
    private String kabupatenKota;
    private String deskripsi;
    public static final JawaBarat[] DAFTAR_JAWA_BARAT = {
            new JawaBarat("Kota Bekasi",
                    "Walikota: Rahmat Effendi\nLuas Wilayah: 207,00 km2"),
            new JawaBarat("Kabupaten Bekasi",
                    "Bupati: H. Akhmad Marjuki, S.E.\nLuas Wilayah: 1.225 km2"),
            new JawaBarat("Kota Bandung",
                    "Walikota: Yana Mulyana\nLuas Wilayah: 167,31 km2")
    };
}
