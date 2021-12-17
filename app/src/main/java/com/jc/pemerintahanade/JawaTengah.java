package com.jc.pemerintahanade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JawaTengah {
    private String kabupatenKota;
    private String deskripsi;
    public static final JawaTengah[] DAFTAR_JAWA_TENGAH = {
            new JawaTengah("Kabupaten Cilacap",
                    "Bupati: H. Tato Suwarto Pamuji\nLuas Wilayah: 2.124,47 km2"),
            new JawaTengah("Kabupaten Sragen",
                    "Bupati: Kusdinar Untung Yuni Sukowati\nLuas Wilayah: 941,55 km2"),
            new JawaTengah("Kabupaten Banyumas",
                    "Bupati: Ir. H. Achmad Husein\nLuas Wilayah: 1.335,30 km2")
    };
}
