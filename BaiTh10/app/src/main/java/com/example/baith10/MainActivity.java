package com.example.baith10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void ChuyenManHinh(View view) {
        // 1. Khai báo Intent (Đảm bảo tên class SubActivityOne đúng với file bạn đã tạo)
        Intent iManHinhKhac = new Intent(MainActivity.this, SubActivityOne.class);

        // 2. Gọi lệnh để bắt đầu chuyển màn hình
        startActivity(iManHinhKhac);
    }
}