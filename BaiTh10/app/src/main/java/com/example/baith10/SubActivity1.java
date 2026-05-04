package com.example.baith10;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }

    // Hàm xử lý quay lại màn hình trước đó
    public void QuayVe(View v) {
        finish(); // Đóng màn hình này để quay về MainActivity
    }
}
