package com.jc.pemerintahanade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JawaBaratActivity extends AppCompatActivity implements JawaBaratListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_barat);
    }
    public void onShowDetails(View view) {
        Intent intent = new Intent(this, DeskripsiJawaBaratActivity.class);
        startActivity(intent);
    }
    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DeskripsiJawaBaratActivity.class);
        intent.putExtra(DeskripsiJawaBaratActivity.EXTRA_JAWA_BARAT_ID, (int)id);
        startActivity(intent);
    }
}