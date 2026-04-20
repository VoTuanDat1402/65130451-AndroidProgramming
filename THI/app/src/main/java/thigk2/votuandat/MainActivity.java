package thigk2.votuandat;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnChucNang1, btnChucNang2, btnChucNang3, btnChucNang4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChucNang1 = findViewById(R.id.btnChucNang1);
        btnChucNang2 = findViewById(R.id.btnChucNang2);
        btnChucNang3 = findViewById(R.id.btnChucNang3);
        btnChucNang4 = findViewById(R.id.btnChucNang4);
        btnChucNang1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChucNang1Activity.class);
            startActivity(intent);
        });

        btnChucNang2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChucNang2Activity.class);
            startActivity(intent);
        });

        btnChucNang3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChucNang3Activity.class);
            startActivity(intent);
        });

        btnChucNang4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChucNang4Activity.class);
            startActivity(intent);
        });
    }
}