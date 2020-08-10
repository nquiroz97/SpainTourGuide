package com.example.spaintourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class TarragonaDestinationsFragment extends Fragment {

    public TarragonaDestinationsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.destination_list, container, false);

        ArrayList<Destination> tarragonaDestinations = new ArrayList<>();
        tarragonaDestinations.add(new Destination(getString(R.string.tarragona_aqueduct), getString(R.string.tarragona_aqueduct_info), R.drawable.tarragona_aqueduct));
        tarragonaDestinations.add(new Destination(getString(R.string.tarragona_balcon_de_med), getString(R.string.tarragona_balcon_de_med_info), R.drawable.tarragona_balcon_del_med));
        tarragonaDestinations.add(new Destination(getString(R.string.tarragona_paseo_arqueologico), getString(R.string.tarragona_paseo_arqueologico_info), R.drawable.tarragona_paseo_arqueologico));
        tarragonaDestinations.add(new Destination(getString(R.string.tarragona_playa_del_milagro), getString(R.string.tarragona_playa_del_milagro_info), R.drawable.tarragona_playa_del_milagro));
        tarragonaDestinations.add(new Destination(getString(R.string.tarragona_roman_amphitheatre), getString(R.string.tarragona_roman_amphitheatre_info), R.drawable.tarragona_roman_amphitheatre));
        tarragonaDestinations.add(new Destination(getString(R.string.tarragona_roman_forum), getString(R.string.tarragona_roman_forum_info), R.drawable.tarragona_roman_forum));


        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        DestinationAdapter mAdapter = new DestinationAdapter(getActivity(), tarragonaDestinations);
        recyclerView.setAdapter(mAdapter);
        // Inflate the layout for this fragment
        return rootView;
    }
}