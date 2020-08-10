package com.example.spaintourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BarcelonaDestinationsFragment extends Fragment {

    public BarcelonaDestinationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.destination_list, container, false);

        ArrayList<Destination> barcelonaDestinations = new ArrayList<>();
        barcelonaDestinations.add(new Destination(getString(R.string.barcelona_camp_nou), getString(R.string.barcelona_camp_info), R.drawable.barcelona_camp_nou));
        barcelonaDestinations.add(new Destination(getString(R.string.barcelona_la_barceloneta), getString(R.string.barcelona_la_barceloneta_info), R.drawable.barcelona_la_barceloneta));
        barcelonaDestinations.add(new Destination(getString(R.string.barcelona_la_rambla), getString(R.string.barcelona_la_rambla_info), R.drawable.barcelona_la_rambla));
        barcelonaDestinations.add(new Destination(getString(R.string.barcelona_monestir_pedralbes), getString(R.string.barcelona_monestir_info), R.drawable.barcelona_monestir_de_pedralbes));
        barcelonaDestinations.add(new Destination(getString(R.string.barcelona_mont_juic), getString(R.string.barcelona_mont_juic_info), R.drawable.barcelona_mont_juic));
        barcelonaDestinations.add(new Destination(getString(R.string.barcelona_parc_guell), getString(R.string.barcelona_parc_guell_info), R.drawable.barcelona_parc_guell));


        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        DestinationAdapter mAdapter = new DestinationAdapter(getActivity(), barcelonaDestinations);
        recyclerView.setAdapter(mAdapter);
        // Inflate the layout for this fragment
        return rootView;
    }
}