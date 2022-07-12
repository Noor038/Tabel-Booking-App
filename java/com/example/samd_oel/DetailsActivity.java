package com.example.samd_oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    EditText date, time , name, people, email, phone;
    UserInfo user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        date = findViewById(R.id.date);
        time = findViewById(R.id.time);
        name = findViewById(R.id.name);
        people = findViewById(R.id.people);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);


        user = new UserInfo();


    }

    public void OnBtnBookClicked(View view) {

        if( date.getText().toString().isEmpty() || time.getText().toString().isEmpty()  ||
                name.getText().toString().isEmpty() || people.getText().toString().isEmpty()  ||
                email.getText().toString().isEmpty()
                || phone.getText().toString().isEmpty() ){
            Toast.makeText(getApplicationContext(), "Plz Enter Correct Information",Toast.LENGTH_SHORT).show();
        }


        else {
            user.setDate(date.getText().toString());
            user.setTime(time.getText().toString());
            user.setName(name.getText().toString());


            Intent i1 = getIntent();
            String tb_id = i1.getStringExtra("tbId");

            Intent i2 = new Intent(DetailsActivity.this, SpecialActivity.class);
            i2.putExtra("name", user.getName());
            i2.putExtra("tbId", tb_id);


            setResult(99, i2);
            finish();
        }

    }
}
