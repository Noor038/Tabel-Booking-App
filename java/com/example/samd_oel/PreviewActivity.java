package com.example.samd_oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PreviewActivity extends AppCompatActivity {
    TextView txtShow, nothing;
    UserInfo user;
    Button cncl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        txtShow = findViewById(R.id.show);
        nothing = findViewById(R.id.nothing);
        cncl = findViewById(R.id.btnCancel);

        user = new UserInfo();

        if(user.getName() == ""){
            nothing.setVisibility(TextView.VISIBLE);
        }

        else {
            txtShow.setText(user.display());
            cncl.setVisibility(View.VISIBLE);
        }
    }

    public void onBtnCancelClicked(View view) {
        user.setName("");
        cncl.setVisibility(View.GONE);
        txtShow.setVisibility(View.GONE);
        Toast.makeText(getApplicationContext(), "Your booking has been cancelled!",Toast.LENGTH_SHORT).show();



    }

    public void onBtnBackClicked(View view) {
        Intent i = new Intent(PreviewActivity.this, DashboardActivity.class);
        startActivity(i);
    }
}