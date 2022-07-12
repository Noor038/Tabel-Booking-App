package com.example.samd_oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SpecialActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    TextView txt1, txt2, txt3;
    UserInfo user;
    final int ACTIVITY_CLOCK=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special);

        btn1 = findViewById(R.id.btnBook1);
        btn2 = findViewById(R.id.btnBook2);
        btn3 = findViewById(R.id.btnBook3);


        txt1 = findViewById(R.id.textView1);
        txt2 = findViewById(R.id.textView2);
        txt3 = findViewById(R.id.textView3);


        user = new UserInfo();

        if(user.getName().equals("")){
            btn1.setText("Book");
            btn3.setText("Book");
            txt1.setText("Party Tabel\nPrice: 1500/-\nCapacity: 6");
            txt3.setText("Party Tabel\nPrice: 1500/-\nCapacity: 3");



        }
    }

    public void btn1OnClicked(View view) {
        Intent i = new Intent(SpecialActivity.this, DetailsActivity.class);
        i.putExtra("tbId", "1");
        startActivity(i);
        startActivityForResult(i, ACTIVITY_CLOCK);
    }


    public void btn2OnClicked(View view) {
        Intent i = new Intent(SpecialActivity.this, DetailsActivity.class);
        i.putExtra("tbId", "2");
      startActivityForResult(i, ACTIVITY_CLOCK);
    }



    public void btn3OnClicked(View view) {
        Intent i = new Intent(SpecialActivity.this, DetailsActivity.class);
        i.putExtra("tbId", "3");
        startActivityForResult(i, ACTIVITY_CLOCK);
    }



    protected void onActivityResult(int requestCode, int resultCode, Intent i) {
        super.onActivityResult(requestCode, resultCode, i);
        if(requestCode == ACTIVITY_CLOCK) {

            String name = i.getStringExtra("name");
            String tbId = i.getStringExtra("tbId");

            switch(tbId){
                case "1":
                    btn1.setText("Reserved");
                    txt1.setText("Party Tabel\nPrice: 1500/-\nCapacity: 6\nBooked - " + name);
                    break;

                case "2":
                    btn2.setText("Reserved");
                    txt2.setText("Party Tabel\nPrice: 1500/-\nCapacity: 4\nBooked - " + name);
                    break;

                case "3":
                    btn3.setText("Reserved");
                    txt3.setText("Party Tabel\nPrice: 1500/-\nCapacity: 3\nBooked - " + name);
                    break;
            }




        }}}


