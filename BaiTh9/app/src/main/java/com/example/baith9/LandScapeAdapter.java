package com.example.baith9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemlandHolder>{
    Context context;
    ArrayList<LandScape> listdata;

    public LandScapeAdapter(Context context, ArrayList<LandScape> listdata) {
        this.context = context;
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public ItemlandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View Vitem = cai_bom.inflate(R.layout.item_land,parent,false);
        ItemlandHolder viewholderCreated = new ItemlandHolder(Vitem);

        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemlandHolder holder, int position) {
        // Lay doi tuong hien thi
        LandScape landScapeHienThi = listdata.get(position);
        // Trich thong tin
        String caption = landScapeHienThi.landCation;
        String imagename = landScapeHienThi.landImageFilename;
        // Dac vao cac truong thong tin cua holder
        holder.tvCation.setText(caption);
        String packagename = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(imagename,"mipmap", packagename);
        holder.ivLandScape.setImageResource(imageID);

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    class ItemlandHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvCation;
        ImageView ivLandScape;
        public ItemlandHolder(@NonNull View itemView) {
            super(itemView);
            tvCation = itemView.findViewById(R.id.textViewCation);
            ivLandScape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Code here
            int vitriduocclick = getAdapterPosition();
            LandScape phantuduocclick= listdata.get(vitriduocclick);
            String ten = phantuduocclick.getLandCation();
            String tenFile = phantuduocclick.getLandImageFilename();
            String chuoithongbao = "Bạn vừa click vào : " + ten;
            Toast.makeText(v.getContext(), chuoithongbao, Toast.LENGTH_SHORT).show();
        }
    }
}
