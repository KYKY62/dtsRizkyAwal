package com.example.dtsrizky;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button bProses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bProses = (Button) findViewById(R.id.btnOK);

    bProses.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            bProses.setBackgroundColor(Color.RED);
            Toast.makeText(MainActivity.this, "Sekarang tombol jadi warna merah", Toast.LENGTH_SHORT).show();
        }
    });
    }
}