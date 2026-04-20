package thigk2.votuandat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class ChucNang2Activity extends AppCompatActivity {

    ListView listViewTinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang2);

        listViewTinh = findViewById(R.id.listViewTinh);
        ArrayList<String> danhSachTinh = new ArrayList<>();
        danhSachTinh.add("Hà Nội");
        danhSachTinh.add("Hồ Chí Minh");
        danhSachTinh.add("Đà Nẵng");
        danhSachTinh.add("Khánh Hòa - Nha Trang");
        danhSachTinh.add("Cần Thơ");
        danhSachTinh.add("Hải Phòng");
        danhSachTinh.add("Huế");
        danhSachTinh.add("Đà Lạt");
        danhSachTinh.add("Vũng Tàu");
        danhSachTinh.add("Võ Thanh Đạt"); // ★ thành phố đặc biệt = Họ và Tên

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                danhSachTinh
        );

        listViewTinh.setAdapter(adapter);
    }
}