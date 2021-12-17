package com.jc.pemerintahanade;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JawaTimurListFragment extends ListFragment {

    static interface Listener {
        void itemClicked(long id);
    };
    private JawaTimurListFragment.Listener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[JawaTimur.DAFTAR_JAWA_TIMUR.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = JawaTimur.DAFTAR_JAWA_TIMUR[i].getKabupatenKota();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (JawaTimurListFragment.Listener)context;
    }
    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}