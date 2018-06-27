package com.example.macbook.nallabhoomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Loginactivity2 extends AppCompatActivity {
   private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity3);
        button = (Button) findViewById(R.id.register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity2();
            }
        });

                }

                public void openactivity2() {
                    Intent intent = new Intent(this, SignupActivity.class);
                    startActivity(intent);
                }


    }

