package com.jc.pemerintahanade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JawaTengahActivity extends AppCompatActivity implements JawaTengahListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_tengah);
    }
    public void onShowDetails(View view) {
        Intent intent = new Intent(this, DeskripsiJawaTengahFragment.class);
        startActivity(intent);
    }
    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DeskripsiJawaTengahActivity.class);
        intent.putExtra(DeskripsiJawaTengahFragment.EXTRA_JAWA_TENGAH_ID, (int)id);
        startActivity(intent);
    }
}