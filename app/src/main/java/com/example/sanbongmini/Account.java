package com.example.sanbongmini;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Account extends AppCompatActivity {
    RecyclerView recyclerView;
    TextView txtchinhsua,txtdangxuat;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        txtchinhsua = findViewById(R.id.chinhsua);
        txtchinhsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account.this, Chinhsuataikhoan.class);
                startActivity(intent);
            }
        });
        txtdangxuat = findViewById(R.id.dangxuat);
        txtdangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Account.this, Login.class);
                startActivity(intent1);
            }
        });



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.taikhoan);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.thongbao:
                        startActivity(new Intent(getApplicationContext(),ThongBao.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.sanbong:
                        startActivity(new Intent(getApplicationContext(),SanBong.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.clb:
                        startActivity(new Intent(getApplicationContext(),CLB.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.taikhoan:
                        return true;
                }
                return false;
            }
        });
    }
}