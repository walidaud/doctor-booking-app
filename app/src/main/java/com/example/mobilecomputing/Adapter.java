package com.example.mobilecomputing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MahasiswaViewHolder> {

    private ArrayList<Clinic> dataList;

    public Adapter(ArrayList<Clinic> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getName());
        holder.txtNpm.setText(dataList.get(position).getAddress());
        holder.txtNoHp.setText(dataList.get(position).getPhone());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtNama = itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = itemView.findViewById(R.id.txt_npm_mahasiswa);
            txtNoHp = itemView.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}


