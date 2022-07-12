package com.example.samd_oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText name, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.setTitle("S A A S");

        name = (EditText) findViewById(R.id.name_id);
        pass = (EditText) findViewById(R.id.pass_id);

    }

    public void btnOnClicked(View view) {

       if (name.getText().toString().equals("Noor")  && pass.getText().toString().equals("12345")){
            Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(i);
            finish();
       }
      else {
          Toast.makeText(getApplicationContext(), "Plz Enter Correct Credentials",Toast.LENGTH_SHORT).show();
       }

    }
}