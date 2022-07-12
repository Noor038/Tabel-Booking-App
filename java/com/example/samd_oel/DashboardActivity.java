package com.example.samd_oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }


    public void onBtnLogoutClicked(View view) {
        finish();
    }

    public void onBtnCancelClicked(View view) {
        Intent i = new Intent(DashboardActivity.this, PreviewActivity.class);
        startActivity(i);

    }


    public void onBtnSpecialClicked(View view) {
        Intent i = new Intent(DashboardActivity.this, SpecialActivity.class);
        startActivity(i);

    }


    public void onBtnPreviewClicked(View view) {
        Intent i = new Intent(DashboardActivity.this, PreviewActivity.class);
        startActivity(i);

    }
}