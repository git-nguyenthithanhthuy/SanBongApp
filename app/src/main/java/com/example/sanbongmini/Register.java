package com.example.sanbongmini;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanbongmini.Login;
import com.example.sanbongmini.R;

public class Register extends AppCompatActivity {
    TextView txtdangnhaplai;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtdangnhaplai = findViewById(R.id.dangnhaplai);
        txtdangnhaplai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });

    }
}
