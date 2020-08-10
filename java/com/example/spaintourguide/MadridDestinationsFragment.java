package com.example.spaintourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MadridDestinationsFragment extends Fragment {


    public MadridDestinationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.destination_list, container, false);

        ArrayList<Destination> madridDestinations = new ArrayList<>();
        madridDestinations.add(new Destination(getString(R.string.madrid_azotea_restaurant), getString(R.string.madrid_azotea_restaurant_info), R.drawable.madrid_azotea_restaurant));
        madridDestinations.add(new Destination(getString(R.string.madrid_buen_retiro), getString(R.string.madrid_buen_retiro_info), R.drawable.madrid_buen_retiro_park));
        madridDestinations.add(new Destination(getString(R.string.madrid_centro_de_arte), getString(R.string.madrid_centro_de_arte_info), R.drawable.madrid_centro_de_arte));
        madridDestinations.add(new Destination(getString(R.string.madrid_prado_museum), getString(R.string.madrid_prado_museum_info), R.drawable.madrid_prado_museum));
        madridDestinations.add(new Destination(getString(R.string.madrid_santceloni_restaurant), getString(R.string.madrid_santceloni_restaurant_info), R.drawable.madrid_santceloni_restaurant));
        madridDestinations.add(new Destination(getString(R.string.madrid_temple_debod), getString(R.string.madrid_temple_debod_info), R.drawable.madrid_temple_debod));


        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        DestinationAdapter mAdapter = new DestinationAdapter(getActivity(), madridDestinations);
        recyclerView.setAdapter(mAdapter);
        // Inflate the layout for this fragment
        return rootView;
    }
}