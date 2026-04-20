package thigk2.votuandat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ChucNang1Activity extends AppCompatActivity {

    EditText edtChieuDai, edtChieuRong; // ô nhập liệu
    Button btnTinhToan;                  // nút tính
    TextView tvChuVi, tvDienTich;        // hiển thị kết quả

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang1);

        // Gắn biến với view trong XML
        edtChieuDai  = findViewById(R.id.edtChieuDai);
        edtChieuRong = findViewById(R.id.edtChieuRong);
        btnTinhToan  = findViewById(R.id.btnTinhToan);
        tvChuVi      = findViewById(R.id.tvChuVi);
        tvDienTich   = findViewById(R.id.tvDienTich);

        btnTinhToan.setOnClickListener(v -> {
            // Lấy chuỗi từ EditText
            String strDai  = edtChieuDai.getText().toString().trim();
            String strRong = edtChieuRong.getText().toString().trim();

            // Kiểm tra người dùng có nhập chưa
            if (strDai.isEmpty() || strRong.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ!", Toast.LENGTH_SHORT).show();
                return; // dừng lại, không tính
            }

            // Chuyển chuỗi sang số thực
            double chieuDai  = Double.parseDouble(strDai);
            double chieuRong = Double.parseDouble(strRong);

            // Công thức tính
            double chuVi   = 2 * (chieuDai + chieuRong);
            double dienTich = chieuDai * chieuRong;

            // Hiển thị kết quả (%.2f = làm tròn 2 chữ số thập phân)
            tvChuVi.setText("Chu vi: " + String.format("%.2f", chuVi) + " m");
            tvDienTich.setText("Diện tích: " + String.format("%.2f", dienTich) + " m²");
        });
    }
}