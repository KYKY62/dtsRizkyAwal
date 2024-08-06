package com.example.dtsrizky;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.otionmenu,menu);
                return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu1){
            startActivity(new Intent(this,Menu1.class));
        } else if (item.getItemId() == R.id.menu2) {
            startActivity(new Intent(this,Menu2.class));
        }else if (item.getItemId() == R.id.menu3) {
            startActivity(new Intent(this,Menu3.class));
        }
        return  true;
    }
}