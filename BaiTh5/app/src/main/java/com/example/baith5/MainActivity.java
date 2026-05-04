package com.example.baith5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Khai báo các đối tượng gắn với diều kiển tương ứng
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Timdieukien();
        View.OnClickListener bolangngheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sothu1 = editTextSo1.getText().toString();
                String sothu2 = editTextSo2.getText().toString();
                float soA = Float.parseFloat(sothu1);
                float soB = Float.parseFloat(sothu2);
                float Tong = soA + soB;
                String chuoiKQ = String.valueOf(Tong);
                editTextKetQua.setText(chuoiKQ);
            }
        };
        nutCong.setOnClickListener(bolangngheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sothu1 = editTextSo1.getText().toString();
                String sothu2 = editTextSo2.getText().toString();
                float soA = Float.parseFloat(sothu1);
                float soB = Float.parseFloat(sothu2);
                float Tru = soA - soB;

                String chuoiKQ = String.valueOf(Tru);
                editTextKetQua.setText(chuoiKQ);
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sothu1 = editTextSo1.getText().toString();
                String sothu2 = editTextSo2.getText().toString();
                float soA = Float.parseFloat(sothu1);
                float soB = Float.parseFloat(sothu2);
                float Nhan = soA * soB;

                String chuoiKQ = String.valueOf(Nhan);
                editTextKetQua.setText(chuoiKQ);
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sothu1 = editTextSo1.getText().toString();
                String sothu2 = editTextSo2.getText().toString();
                float soA = Float.parseFloat(sothu1);
                float soB = Float.parseFloat(sothu2);
                float Chia = soA / soB;

                String chuoiKQ = String.valueOf(Chia);
                editTextKetQua.setText(chuoiKQ);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    void Timdieukien(){
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKetQua = (EditText) findViewById(R.id.edtKQ);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }

}