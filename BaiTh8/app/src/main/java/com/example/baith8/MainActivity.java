package com.example.baith8;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        setContentView(R.layout.activity_main);
        ListView lsDSMonAn = (ListView) findViewById(R.id.lvDSMonAn) ;

        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Cơm Tấm Sườn",25.000,"Cơm tấm sườn siu ngon có cơm và miếng sườn.",R.drawable.cts));
        dsMonAn.add(new MonAn("Cơm Tấm Sườn Trứng",27.000,"Cơm tấm có cơm, miếng sườn và có thêm miếng trứng.",R.drawable.ctst));
        dsMonAn.add(new MonAn("Cơm Gà Xối Mỡ",30.000,"Đĩa cơm gà bày ra đĩa trông bắt mắt với phần cơm vừa đủ ăn lưng bụng, thịt gà trộn bày lên trên, trang...",R.drawable.cgxm));
        dsMonAn.add(new MonAn("Cơm Sườn Bì Chả",32.000,"Cơm tấm có cơm, miếng sườn, cộng thêm bì và miếng chả siu thơm ngon.",R.drawable.csbc));
        dsMonAn.add(new MonAn("Cơm Tấm Đặc Biệt",35.000,"Cơm tấm đặc biệt có cơm và đầy đủ topping trứng, bì, chả siu thơm ngon.",R.drawable.ctdb));

        //Adapter
        MonAnAdapter adapter= new MonAnAdapter(this, dsMonAn);
        lsDSMonAn.setAdapter(adapter);
        lsDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonAn monAnChon = dsMonAn.get(position);
                Toast.makeText(MainActivity.this, monAnChon.getTenmonan(), Toast.LENGTH_SHORT).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}