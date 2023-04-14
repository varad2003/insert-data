package com.example.insertdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button;

    RadioButton rb1,rb2;
    RadioGroup radioGroup;

    EditText cardname,apr,minage,maxage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radiogroup);

        button=findViewById(R.id.nextbtn);
        cardname=findViewById(R.id.cardname);
        apr=findViewById(R.id.apr);
        minage=findViewById(R.id.minimum_age);
        maxage=findViewById(R.id.maximum_age);
        rb1=findViewById(R.id.radiobtn1);
        rb2=findViewById(R.id.radiobtn2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((rb1.isChecked() || rb2.isChecked()) &&  cardname.getText().toString().trim().length()!=0 && apr.getText().toString().trim().length()!=0 && Integer.parseInt(minage.getText().toString())<Integer.parseInt(maxage.getText().toString())){
                    Intent intent = new Intent(MainActivity.this, SpecialOffers.class);
                    startActivity(intent);
                }

                else{
                    Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}