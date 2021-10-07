package com.example.myappreclycerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataRecyclerViewAdapter extends RecyclerView.Adapter<DataRecyclerViewAdapter.DataViewHolder> {
    ArrayList<Data> arrayListData;

    public DataRecyclerViewAdapter(ArrayList<Data> arrayListData) {
        this.arrayListData = arrayListData;
    }

    @NonNull
    @Override
    public DataRecyclerViewAdapter.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataRecyclerViewAdapter.DataViewHolder holder, int position) {
        final Data data = arrayListData.get(position);

        holder.textViewTittle.setText(data.getTittle());
        holder.textViewRating.setText(String.valueOf(data.getRating()));
        holder.textViewReleaseData.setText(data.getReleasedate());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailMainActivity.class);
                intent.putExtra("Data", data);
                holder.itemView.getContext().startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListData.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTittle, textViewRating, textViewReleaseData;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTittle = itemView.findViewById(R.id.tvTittle);
            textViewRating = itemView.findViewById(R.id.tvRating);
            textViewReleaseData = itemView.findViewById(R.id.tvReleaseDate);
        }
    }
}
