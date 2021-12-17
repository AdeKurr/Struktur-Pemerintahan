package com.jc.pemerintahanade;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DeskripsiJawaBaratFragment extends Fragment {
    private long provinsiId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deskripsi_jawa_barat, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView kabupatenKota = (TextView) view.findViewById(R.id.textTitle);
            JawaBarat jawaBarat = JawaBarat.DAFTAR_JAWA_BARAT[(int) provinsiId];
            kabupatenKota.setText(jawaBarat.getKabupatenKota());
            TextView deskripsi = (TextView) view.findViewById(R.id.textDescription);
            deskripsi.setText(jawaBarat.getDeskripsi());
        }
    }

    public void setProvinsi(long id) {
        this.provinsiId = id;
    }
}