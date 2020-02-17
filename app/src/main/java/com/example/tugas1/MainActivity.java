package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_nama;
    Button btn_kirim;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_nama = findViewById(R.id.et_nama);
        btn_kirim = findViewById(R.id.btn_kirim);
        btn_kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Bundle bundle = new Bundle();
                    String nama = et_nama.getText().toString();
                    bundle.putString("nama",nama);
                    Intent moveintent = new Intent(MainActivity.this, HiNama.class);
                    moveintent.putExtras(bundle);
                    startActivity(moveintent);
                } catch (Exception e){
                 Toast.makeText(getApplicationContext(), "Nama tidak boleh kosong !",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
