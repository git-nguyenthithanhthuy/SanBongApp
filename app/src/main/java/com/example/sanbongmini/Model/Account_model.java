package com.example.sanbongmini.Model;

public class Account_model {
    private int HinhAcc;
    private String MotaAcc;

    public Account_model(int hinhAcc, String motaAcc) {
        this.HinhAcc = hinhAcc;
        MotaAcc = motaAcc;
    }

    public int getHinhAcc() {
        return HinhAcc;
    }

    public void setHinhAcc(int hinhAcc) {
        this.HinhAcc = hinhAcc;
    }

    public String getMotaAcc() {
        return MotaAcc;
    }

    public void setMotaAcc(String motaAcc) {
        MotaAcc = motaAcc;
    }
}
