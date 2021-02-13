package com.example.aplikasimengenalbuah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Melon extends AppCompatActivity {

    EditText editTextMelon;
    Button bt_proses;
    TextView hasil;
    String benar = "melon";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melon);

        editTextMelon = (EditText)findViewById(R.id.edt_buah_melon);
        bt_proses = (Button)findViewById(R.id.bt_proses_melon);
        hasil = (TextView)findViewById(R.id.hasil_melon);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextMelon.length()==0){
                    Toast.makeText(getApplicationContext(), "Masukkan Pilihan Terlebih Dahulu", Toast.LENGTH_SHORT).show();

                }
                else {
                    String jawaban = editTextMelon.getText().toString();
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