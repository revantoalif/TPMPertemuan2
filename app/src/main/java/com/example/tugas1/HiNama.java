package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HiNama extends AppCompatActivity {
    TextView nama;
    Button btn_perkalian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hi_nama);
        nama = findViewById(R.id.tv_nama);
        Bundle bundle = getIntent().getExtras();
        String nama_bundle = bundle.getString("nama");
        nama.setText("Hi "+nama_bundle+"!");
        btn_perkalian = findViewById(R.id.btn_perkalian);
        btn_perkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(HiNama.this, perkalian.class);
                startActivity(moveIntent);
            }
        });
    }
}
