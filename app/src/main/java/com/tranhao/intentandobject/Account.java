package com.tranhao.intentandobject;

import java.io.Serializable;

public class Account implements Serializable {
    private String ten, matkhau;

    public Account(String ten, String matkhau) {
        this.ten = ten;
        this.matkhau = matkhau;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
}
