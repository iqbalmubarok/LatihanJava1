package com.example.latihanjava1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenghitungLuas extends AppCompatActivity {

    private EditText editPanjang, editLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung_luas);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        editPanjang = findViewById(R.id.edit_panjang);
        editLebar = findViewById(R.id.edit_lebar);
        btnHitung = findViewById(R.id.btn_hitung);
        txtLuas = findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = editPanjang.getText().toString().trim();
                String lebar = editLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p*l;

                txtLuas.setText("Luas : "+luas);
            }
        });
    }
}
