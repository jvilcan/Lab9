package com.example.nh.lab9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class activity_chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Toast.makeText(this,"Bienvenido al Chat Firebase", Toast.LENGTH_LONG).show();
    }
}
