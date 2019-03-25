package com.tranhao.intentandobject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDangNhap, btnThoat;
    EditText edtTen, edtMK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitMapping();

        ControlButtons();
    }

    private void ControlButtons() {
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edtTen.getText().toString();
                String mk = edtMK.getText().toString();

                if (ten.equals("admin") && mk.equals("123")) {
                    Account account = new Account(ten, mk);

                    Bundle bundle = new Bundle();
                    bundle.putSerializable("taikhoan", account);

                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("dulieu", bundle);

                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Tài khoản đăng nhập không đúng!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void InitMapping() {
        btnDangNhap = findViewById(R.id.btnDangNhap);
        btnThoat = findViewById(R.id.btnThoat);
        edtTen = findViewById(R.id.edtTen);
        edtMK = findViewById(R.id.edtMK);
    }
}
