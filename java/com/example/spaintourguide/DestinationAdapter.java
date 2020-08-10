package com.example.spaintourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DestinationAdapter extends RecyclerView.Adapter<DestinationAdapter.ViewHolder> {
    private ArrayList<Destination> mDestination;
    private LayoutInflater mInflater;

    public DestinationAdapter(Context context, ArrayList<Destination> destination) {
        mInflater = LayoutInflater.from(context);
        mDestination = destination;
    }


    @NonNull
    @Override
    public DestinationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //uses the card view widget as a view holder for data in ArrayList
        View view = mInflater.inflate(R.layout.card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DestinationAdapter.ViewHolder holder, int position) {
        //uses the getter methods from Destination class to populate ArrayList
        Destination currentDestination = mDestination.get(position);
        holder.destinationName.setText(currentDestination.getDestinationName());
        holder.destinationInfo.setText(currentDestination.getDestinationInfo());
        holder.destinationImage.setImageResource(currentDestination.getImageResourceId());

    }

    @Override
    public int getItemCount() {
        return mDestination.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView destinationName;
        TextView destinationInfo;
        ImageView destinationImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            destinationName = itemView.findViewById(R.id.destinationName);
            destinationInfo = itemView.findViewById(R.id.destinationInfo);
            destinationImage = itemView.findViewById(R.id.destinationImage);
        }
    }
}
