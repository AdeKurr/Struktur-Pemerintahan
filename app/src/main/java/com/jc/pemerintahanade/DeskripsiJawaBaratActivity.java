package com.jc.pemerintahanade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DeskripsiJawaBaratActivity extends AppCompatActivity {

    public static final String EXTRA_JAWA_BARAT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_jawa_barat);
        DeskripsiJawaBaratFragment frag = (DeskripsiJawaBaratFragment)
                getSupportFragmentManager().findFragmentById(R.id.jawa_barat_frag);
        int provinsiId = (int) getIntent().getExtras().get(EXTRA_JAWA_BARAT_ID);
        frag.setProvinsi(provinsiId);
    }
}