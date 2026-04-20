package thigk2.votuandat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class ChucNang3Activity extends AppCompatActivity {

    RecyclerView recyclerViewDiaDiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang3);

        recyclerViewDiaDiem = findViewById(R.id.recyclerViewDiaDiem);
        ArrayList<DiaDiem> danhSach = new ArrayList<>();
        danhSach.add(new DiaDiem(
                "Vịnh Nha Trang",
                "Trần Phú, Nha Trang, Khánh Hòa",
                R.mipmap.ic_launcher));

        danhSach.add(new DiaDiem(
                "Tháp Bà Ponagar",
                "2 Tháng 4, Vĩnh Phước, Nha Trang",
                R.mipmap.ic_launcher));

        danhSach.add(new DiaDiem(
                "Hòn Chồng",
                "Phạm Cự Lượng, Nha Trang",
                R.mipmap.ic_launcher));

        danhSach.add(new DiaDiem(
                "Đảo Hòn Mun",
                "Vịnh Nha Trang, Khánh Hòa",
                R.mipmap.ic_launcher));

        danhSach.add(new DiaDiem(
                "Vinpearl Land",
                "Đảo Hòn Tre, Nha Trang",
                R.mipmap.ic_launcher));

        recyclerViewDiaDiem.setLayoutManager(new LinearLayoutManager(this));
        DiaDiemAdapter adapter = new DiaDiemAdapter(this, danhSach);
        recyclerViewDiaDiem.setAdapter(adapter);
    }
}