package com.jc.pemerintahanade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DeskripsiJawaTengahActivity extends AppCompatActivity {

    public static final String EXTRA_JAWA_TENGAH_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_jawa_tengah);
        DeskripsiJawaTengahFragment frag = (DeskripsiJawaTengahFragment)
                getSupportFragmentManager().findFragmentById(R.id.jawa_tengah_frag);
        int provinsiId = (int) getIntent().getExtras().get(EXTRA_JAWA_TENGAH_ID);
        frag.setProvinsi(provinsiId);
    }
}