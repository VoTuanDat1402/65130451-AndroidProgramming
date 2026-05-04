package com.example.baith7;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // BƯỚC 1: Phải nạp giao diện trước tiên
        setContentView(R.layout.activity_main);

        // BƯỚC 2: Xử lý WindowInsets (Padding cho màn hình tràn viền)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // BƯỚC 3: Khởi tạo dữ liệu
        ArrayList<String> dsVL = new ArrayList<>();
        dsVL.add("Xi măng");
        dsVL.add("Gạch");
        dsVL.add("Đá ốp lát");
        dsVL.add("Ống nhựa");
        dsVL.add("Sơn chống thấm");

        // BƯỚC 4: Ánh xạ View và đổ dữ liệu (Sau khi đã setContentView)
        ListView lvVatLieu = findViewById(R.id.lvDanhSachVL);
        ArrayAdapter<String> adapterVatLieu = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsVL
        );

        lvVatLieu.setAdapter(adapterVatLieu);
    }
}