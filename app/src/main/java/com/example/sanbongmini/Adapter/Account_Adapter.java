package com.example.sanbongmini.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanbongmini.Model.Account_model;
import com.example.sanbongmini.R;

import java.util.ArrayList;

public class Account_Adapter extends RecyclerView.Adapter<Account_Adapter.ViewHolder> {
    private  ArrayList<Account_model> account;
    Context context;

    public Account_Adapter(ArrayList<Account_model> account, Context context) {
        this.account = account;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_account, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     holder.Hinhacc.setImageResource(account.get(position).getHinhAcc());
     holder.Motaacc.setText(account.get(position).getMotaAcc());

    }

    @Override
    public int getItemCount() {
        return account.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView Hinhacc;
        TextView Motaacc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Hinhacc = itemView.findViewById(R.id.hinhaccount);
            Motaacc = itemView.findViewById(R.id.motaaccount);
        }
    }
}
