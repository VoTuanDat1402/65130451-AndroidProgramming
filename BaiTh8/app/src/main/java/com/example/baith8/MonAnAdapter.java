package com.example.baith8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private ArrayList<MonAn> dsMonAn; // Tên biến là arrayList
    private LayoutInflater layoutInflater; // Tên biến là layoutInflater
    private Context context; // Tên biến là context

    public MonAnAdapter(Context _context,ArrayList<MonAn> dsMonAn) {
        this.dsMonAn = dsMonAn;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(context);
    }



    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ViewHienHanh = convertView;
        if(ViewHienHanh == null)
            ViewHienHanh=   layoutInflater.inflate(R.layout.item_monan, null);
        MonAn monAnhienhanh= dsMonAn.get(position);
        //
        TextView tvtenMonAn = (TextView) ViewHienHanh.findViewById(R.id.tvTenMon);
        TextView tvtDonGia = (TextView) ViewHienHanh.findViewById(R.id.DonGia);
        TextView tvMoTa = (TextView) ViewHienHanh.findViewById(R.id.Bio);
        ImageView tvAnh = (ImageView) ViewHienHanh.findViewById(R.id.imAvatar);


        tvtenMonAn.setText(monAnhienhanh.getTenmonan());
        tvtDonGia.setText(String.valueOf(monAnhienhanh.getDonGia()));
        tvMoTa.setText(monAnhienhanh.getMota());
        tvAnh.setImageResource(monAnhienhanh.getAnhmminhhoa());

        return ViewHienHanh;
    }
}
