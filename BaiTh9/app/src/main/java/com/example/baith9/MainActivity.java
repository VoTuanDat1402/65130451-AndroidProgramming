package com.example.baith9;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerData;
    RecyclerView recyclerViewLandScape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerData = getRecyclerData();

        recyclerViewLandScape = findViewById(R.id.recyclerLand);
// 5
//        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
//        recyclerViewLandScape.setLayoutManager(layoutLinear);
        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
        recyclerViewLandScape.setLayoutManager(layoutGrid);

        landScapeAdapter= new LandScapeAdapter(this, recyclerData);

        recyclerViewLandScape.setAdapter(landScapeAdapter);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    ArrayList<LandScape>getRecyclerData(){
        ArrayList<LandScape> dsDulieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("tower_of_hanoi","Hồ Guơm ở Hà Nội");
        dsDulieu.add(landScape1);
        dsDulieu.add(new LandScape("effeltower","Tháp Effel ở Pháp"));
        dsDulieu.add(new LandScape("tower_of_khanhhoa","Tháp Trầm Hương ở Khánh Hoà"));
        dsDulieu.add(new LandScape("statue_intheus","Tượng Nữ Thần Tự Do ở Mĩ"));

        return dsDulieu;
    }
}