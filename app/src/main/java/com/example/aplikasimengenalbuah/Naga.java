package com.example.aplikasimengenalbuah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Naga extends AppCompatActivity {

    EditText editTextNaga;
    Button bt_proses;
    TextView hasil;
    String benar = "buah naga";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naga);

        editTextNaga = (EditText)findViewById(R.id.edt_buah_naga);
        bt_proses = (Button)findViewById(R.id.bt_proses_naga);
        hasil = (TextView)findViewById(R.id.hasil_naga);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextNaga.length()==0){
                    Toast.makeText(getApplicationContext(), "Masukkan Pilihan Terlebih Dahulu", Toast.LENGTH_SHORT).show();

                }
                else {
                    String jawaban = editTextNaga.getText().toString();
                    if (jawaban.equals(benar)){
                        String keterangan = "Anda Benar";
                        hasil.setText(keterangan);
                    }
                    else {
                        String keterangan = "Anda Salah";
                        hasil.setText(keterangan);
                    }
                }
            }
        });

    }
}