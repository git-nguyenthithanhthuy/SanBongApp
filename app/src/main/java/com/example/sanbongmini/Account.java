package com.example.sanbongmini;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanbongmini.Adapter.Account_Adapter;
import com.example.sanbongmini.Model.Account_model;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Account extends AppCompatActivity {
    RecyclerView recyclerView;
    TextView txtchinhsua,txtdangxuat;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        recyclerView = findViewById(R.id.recycthongtin);
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

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<Account_model> account = new ArrayList<>();
        account.add(new Account_model(R.drawable.ic_report, "Giới thiệu"));
        account.add(new Account_model(R.drawable.ic_bookmark_border, "Chính sách bảo mật"));
        account.add(new Account_model(R.drawable.ic_content_copy, "Đánh giá ứng dụng"));
        account.add(new Account_model(R.drawable.ic_sentiment_satisfied, "Hỗ trợ & góp ý"));
        recyclerView.setAdapter( new Account_Adapter(account, this));

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