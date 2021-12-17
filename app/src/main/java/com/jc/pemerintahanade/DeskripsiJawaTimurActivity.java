package com.jc.pemerintahanade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DeskripsiJawaTimurActivity extends AppCompatActivity {

    public static final String EXTRA_JAWA_TIMUR_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_jawa_timur);
        DeskripsiJawaTimurFragment frag = (DeskripsiJawaTimurFragment)
                getSupportFragmentManager().findFragmentById(R.id.jawa_timur_frag);
        int provinsiId = (int) getIntent().getExtras().get(EXTRA_JAWA_TIMUR_ID);
        frag.setProvinsi(provinsiId);
    }
}