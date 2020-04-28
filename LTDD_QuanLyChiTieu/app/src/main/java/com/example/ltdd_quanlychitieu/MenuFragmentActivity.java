package com.example.ltdd_quanlychitieu;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


import com.example.ltdd_quanlychitieu.uiHome.Home;
import com.example.ltdd_quanlychitieu.uiHome.SectionsPagerAdapter;
import com.example.ltdd_quanlychitieu.uiMenu.AccountFragment;
import com.example.ltdd_quanlychitieu.uiMenu.AddFragment;
import com.example.ltdd_quanlychitieu.uiMenu.HomeFragment;
import com.example.ltdd_quanlychitieu.uiMenu.ReportFragment;
import com.example.ltdd_quanlychitieu.uiMenu.SettingFragmet;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;


public class MenuFragmentActivity extends AppCompatActivity {



    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_frame);

        bottomNavigationView = findViewById(R.id.bottomNav);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentNav,new HomeFragment()).commit();
        }

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
                    case R.id.home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.add:
                        fragment = new AddFragment();
                        break;
                    case R.id.setting:
                        fragment = new SettingFragmet();
                        break;
                    case R.id.account:
                        fragment = new AccountFragment();
                        break;
                    case R.id.report:
                        fragment = new ReportFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentNav,fragment).commit();
                return true;
            }
        });
    }
}
