package thigk2.votuandat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class DiaDiemAdapter extends RecyclerView.Adapter<DiaDiemAdapter.ViewHolder> {

    Context context;
    ArrayList<DiaDiem> danhSach;

    public DiaDiemAdapter(Context context, ArrayList<DiaDiem> danhSach) {
        this.context = context;
        this.danhSach = danhSach;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgDiaDiem;
        TextView tvTenDiaDiem, tvDiaChi;

        public ViewHolder(View itemView) {
            super(itemView);
            imgDiaDiem    = itemView.findViewById(R.id.imgDiaDiem);
            tvTenDiaDiem  = itemView.findViewById(R.id.tvTenDiaDiem);
            tvDiaChi      = itemView.findViewById(R.id.tvDiaChi);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_diadiem, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DiaDiem dd = danhSach.get(position); // lấy địa điểm tại vị trí này

        holder.tvTenDiaDiem.setText(dd.getTen());
        holder.tvDiaChi.setText(dd.getDiaChi());
        holder.imgDiaDiem.setImageResource(dd.getHinhAnh());
    }

    @Override
    public int getItemCount() {
        return danhSach.size();
    }
}