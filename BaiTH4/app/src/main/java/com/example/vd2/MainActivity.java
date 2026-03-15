    package com.example.vd2;

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
    // Khai báo các đối tượng gắn với điều khiển tương ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    void TimDieuKhien() {
        EditText editTextSo1= findViewById(R.id.edtSo1);
        EditText editTextSo2= findViewById(R.id.edtSo2);
        EditText editTextKQ = (EditText)findViewById(R.id.btnKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
    // Xử lý cộng
    public void XuLyCong(View v){
        //Xử lý cộng ở đây
        //b1. lấy dữ liệu 2 số
        //b1.1 tìm EditText số 1 và số 2
        //b1.2 lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2.Tính toán
        float Tong = soA + soB;
        // b3. hiện kết quả
        //b3.1
        //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3 gán kết quả lên dkhiển
        editTextKQ.setText(chuoiKQ);
    }
    // Xử lý trừ
    public void XuLyTru(View v){
        //Xử lý trừ ở đây
        //b1. lấy dữ liệu 2 số
        //b1.1 tìm EditText số 1 và số 2
        //b1.2 lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2.Tính toán
        float Hieu = soA - soB;
        // b3. hiện kết quả
        //b3.1
        //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Hieu);
        //b3.3 gán kết quả lên dkhiển
        editTextKQ.setText(chuoiKQ);
    }
    // Xử lý nhân
    public void XuLyNhan(View v){
        //Xử lý nhân ở đây
        //b1. lấy dữ liệu 2 số
        //b1.1 tìm EditText số 1 và số 2
        //b1.2 lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2.Tính toán
        float Tich = soA * soB;
        // b3. hiện kết quả
        //b3.1
        //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tich);
        //b3.3 gán kết quả lên dkhiển
        editTextKQ.setText(chuoiKQ);
    }
    // Xử lý chia
    public void XuLyChia(View v){
        //Xử lý chia ở đây
        //b1. lấy dữ liệu 2 số
        //b1.1 tìm EditText số 1 và số 2
        //b1.2 lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2.Tính toán
        float Thuong = soA / soB;
        // b3. hiện kết quả
        //b3.1
        //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Thuong);
        //b3.3 gán kết quả lên dkhiển
        editTextKQ.setText(chuoiKQ);
    }
}