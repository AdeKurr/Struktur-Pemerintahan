package com.jc.pemerintahanade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JawaTimurActivity extends AppCompatActivity implements JawaTimurListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_timur);
    }
    public void onShowDetails(View view) {
        Intent intent = new Intent(this, DeskripsiJawaTimurFragment.class);
        startActivity(intent);
    }
    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DeskripsiJawaTimurActivity.class);
        intent.putExtra(DeskripsiJawaTimurFragment.EXTRA_JAWA_TIMUR_ID, (int)id);
        startActivity(intent);
    }
}