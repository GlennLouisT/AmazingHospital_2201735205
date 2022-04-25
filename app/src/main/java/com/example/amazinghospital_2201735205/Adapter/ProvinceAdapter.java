package com.example.amazinghospital_2201735205.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazinghospital_2201735205.HospitalActivity;
import com.example.amazinghospital_2201735205.R;
import com.example.amazinghospital_2201735205.model.Province;

import java.util.ArrayList;

public class ProvinceAdapter extends RecyclerView.Adapter<ProvinceAdapter.ViewHolder>{
    private Context ctx;
    private ArrayList<Province> provinces;

    public ProvinceAdapter(Context ctx) {
        this.ctx = ctx;
    }

    public void setProvinces(ArrayList<Province> provinces) {
        this.provinces = provinces;
    }

    @NonNull
    @Override
    public ProvinceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.list_province, parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProvinceAdapter.ViewHolder holder, int position) {
        holder.tvProvince.setText(provinces.get(position).getProvinceName());
        holder.cvProvince.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ctx, HospitalActivity.class);
                intent.putExtra("ProvinceName", provinces.get(position).getProvinceName());

                ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return provinces.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvProvince;
        CardView cvProvince;

        public ViewHolder(View provinceView) {
            super(provinceView);

            tvProvince = provinceView.findViewById(R.id.tv_province);
            cvProvince = provinceView.findViewById(R.id.cvProvince);

        }
    }
}
