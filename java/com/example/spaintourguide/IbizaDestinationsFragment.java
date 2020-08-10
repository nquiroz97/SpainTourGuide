package com.example.spaintourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class IbizaDestinationsFragment extends Fragment {

    public IbizaDestinationsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.destination_list, container, false);

        ArrayList<Destination> ibizaDestinations = new ArrayList<>();
        ibizaDestinations.add(new Destination(getString(R.string.ibiza_benirras), getString(R.string.ibiza_benirras_info), R.drawable.ibiza_benirras));
        ibizaDestinations.add(new Destination(getString(R.string.ibiza_playa_bossa), getString(R.string.ibiza_playa_bossa_info), R.drawable.ibiza_playa_bossa));
        ibizaDestinations.add(new Destination(getString(R.string.ibiza_portinatx), getString(R.string.ibiza_portinatx_info), R.drawable.ibiza_portinax));
        ibizaDestinations.add(new Destination(getString(R.string.ibiza_san_miguel), getString(R.string.ibiza_san_miguel_info), R.drawable.ibiza_san_miguel));
        ibizaDestinations.add(new Destination(getString(R.string.ibiza_ses_salines), getString(R.string.ibiza_ses_salines_info), R.drawable.ibiza_ses_salines));
        ibizaDestinations.add(new Destination(getString(R.string.ibiza_sol), getString(R.string.ibiza_sol_info), R.drawable.ibiza_sol_d_en_serra));


        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        DestinationAdapter mAdapter = new DestinationAdapter(getActivity(), ibizaDestinations);
        recyclerView.setAdapter(mAdapter);
        // Inflate the layout for this fragment
        return rootView;
    }
}