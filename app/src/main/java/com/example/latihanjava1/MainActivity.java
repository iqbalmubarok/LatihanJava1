package com.example.latihanjava1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNamaDepan, txtNamaBelakang;
    TextView txtOutput;
    Button btnTampilkan, btnLuas, btnKalku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNamaDepan = findViewById(R.id.txtNamaDepan);
        txtNamaBelakang = findViewById(R.id.txtNamaBelakang);
        txtOutput = findViewById(R.id.txtOutput);
        btnTampilkan = findViewById(R.id.btnTampil);
        btnLuas = findViewById(R.id.btnHitungLuas);
        btnKalku = findViewById(R.id.btnKalkulator);

        btnTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nmDepan = txtNamaDepan.getText().toString();
                String nmBelakang = txtNamaBelakang.getText().toString();
                String output = nmDepan +" "+ nmBelakang;

                txtOutput.setText(output);
            }
        });

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent luasIntent = new Intent(MainActivity.this, MenghitungLuas.class);
                startActivity(luasIntent);
            }
        });

        btnKalku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kalkulatorIntent = new Intent(MainActivity.this, Kalkulator.class);
                startActivity(kalkulatorIntent);
            }
        });
    }
}
