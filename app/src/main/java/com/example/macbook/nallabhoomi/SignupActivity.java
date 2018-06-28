package com.example.macbook.nallabhoomi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {
    Button btregister;
    EditText trucknumber, password, secretcode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        trucknumber = (EditText)findViewById(R.id.trucknumber);
        password = (EditText)findViewById(R.id.password);
        secretcode = (EditText)findViewById(R.id.Secretcode);

        btregister = (Button)findViewById(R.id.register);
        btregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
