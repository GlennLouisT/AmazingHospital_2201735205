package com.example.amazinghospital_2201735205.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazinghospital_2201735205.HospitalActivity;
import com.example.amazinghospital_2201735205.R;
import com.example.amazinghospital_2201735205.model.Hospital;
import com.example.amazinghospital_2201735205.model.Province;

import java.util.ArrayList;

public class HospitalAdapter extends RecyclerView.Adapter<HospitalAdapter.ViewHolder>{
    private Context ctx;
    private ArrayList<Hospital> hospitals;

    public HospitalAdapter(Context ctx) {
        this.ctx = ctx;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    @NonNull
    @Override
    public HospitalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.list_hospital, parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HospitalAdapter.ViewHolder holder, int position) {
        holder.tvProvinceSelected.setText(hospitals.get(position).getProvinceName());
        holder.cvHospital.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ctx, HospitalActivity.class);
                intent.putExtra("ProvinceName", hospitals.get(position).getProvinceName());

                ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return hospitals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvProvinceSelected;
        CardView cvHospital;

        public ViewHolder(View hospitalView) {
            super(hospitalView);

            tvProvinceSelected = hospitalView.findViewById(R.id.tv_provinceSelected);
            cvHospital = hospitalView.findViewById(R.id.cvHospital);

        }
    }
}
