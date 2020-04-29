package com.example.tab_taikhoan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView = (ScrollView) findViewById(R.id.scv_taikhoan);
    }

    public void onClick_imgTaiKhoan(View view) {
        Toast.makeText(MainActivity.this,"Click Image Tài Khoản",Toast.LENGTH_SHORT).show();
    }

    public void onClick_ViCuaToi(View view) {
        Toast.makeText(MainActivity.this,"Click Ví của tôi",Toast.LENGTH_SHORT).show();
    }

    public void onClick_Nhom(View view) {
        Toast.makeText(MainActivity.this,"Click Nhóm",Toast.LENGTH_SHORT).show();
    }
    public void onClick_CongCu(View view) {
        Toast.makeText(MainActivity.this,"Click Công cụ",Toast.LENGTH_SHORT).show();
    }
    public void onClick_CaiDat(View view) {
        Toast.makeText(MainActivity.this,"Click Cài đặt",Toast.LENGTH_SHORT).show();
    }
    public void onClick_HoTro(View view) {
        Toast.makeText(MainActivity.this,"Click Hỗ trợ",Toast.LENGTH_SHORT).show();
    }
    public void onClick_GioiThieu(View view) {
        Toast.makeText(MainActivity.this,"Click Giới thiệu",Toast.LENGTH_SHORT).show();
    }
}
