package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class perkalian extends AppCompatActivity {
    EditText et_satu, et_dua;
    TextView tv_hasil;
    Button btn_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);

        et_satu = findViewById(R.id.et_satu);
        et_dua = findViewById(R.id.et_dua);
        tv_hasil = findViewById(R.id.tv_hasil);
        btn_hasil = findViewById(R.id.btn_hasil);
        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String satu = et_satu.getText().toString();
                    String dua = et_dua.getText().toString();

                    double dbsatu = Double.parseDouble(satu);
                    double dbdua = Double.parseDouble(dua);

                    double hasil_perkalian = dbsatu * dbdua;

                    tv_hasil.setText(""+hasil_perkalian);
                } catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh kosong", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}
