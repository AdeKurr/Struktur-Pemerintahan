package com.jc.pemerintahanade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JawaTimur {
    private String kabupatenKota;
    private String deskripsi;
    public static final JawaTimur[] DAFTAR_JAWA_TIMUR = {
            new JawaTimur("Kota Surabaya",
                    "Walikota: Eri Cahyadi, S.T., M.T.\nLuas Wilayah: 350,54 km2"),
            new JawaTimur("Kabupaten Banyuwangi",
                    "Bupati: Ipuk Fiestiandani\nLuas Wilayah: 5.782,50 km2"),
            new JawaTimur("Kota Malang",
                    "Walikota: Drs. H. Sutiaji\nLuas Wilayah: 110,06 km2")
    };
}
