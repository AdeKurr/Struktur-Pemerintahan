package com.jc.pemerintahanade;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DeskripsiJawaTengahFragment extends Fragment {

    public static final String EXTRA_JAWA_TENGAH_ID = "id";
    private long provinsiId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deskripsi_jawa_tengah, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView kabupatenKota = (TextView) view.findViewById(R.id.textTitle2);
            JawaTengah jawaTengah = JawaTengah.DAFTAR_JAWA_TENGAH[(int) provinsiId];
            kabupatenKota.setText(jawaTengah.getKabupatenKota());
            TextView deskripsi = (TextView) view.findViewById(R.id.textDescription2);
            deskripsi.setText(jawaTengah.getDeskripsi());
        }
    }

    public void setProvinsi(long id) {
        this.provinsiId = id;
    }
}