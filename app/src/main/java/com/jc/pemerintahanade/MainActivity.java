package com.jc.pemerintahanade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                        if (position == 0) {
                            Intent intent = new Intent(MainActivity.this, JawaBaratActivity.class);
                            startActivity(intent);
                        } else if (position == 1) {
                            Intent intent = new Intent(MainActivity.this, JawaTengahActivity.class);
                            startActivity(intent);
                        } else if (position == 2) {
                            Intent intent = new Intent(MainActivity.this, JawaTimurActivity.class);
                            startActivity(intent);
                        }
                    }
                };
        android.widget.ListView listView = (android.widget.ListView) findViewById(R.id.listview_main);
        listView.setOnItemClickListener(itemClickListener);
    }

}