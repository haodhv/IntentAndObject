package com.tranhao.intentandobject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");

        Account account = (Account) bundle.getSerializable("taikhoan");

        String ten = account.getTen();
        String mk = account.getMatkhau();

        Toast.makeText(this, ten + " " + mk, Toast.LENGTH_SHORT).show();
    }
}
