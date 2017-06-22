package com.example.venkat_4957.flames;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity_Marriage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marriage);
        Button btn = (Button) findViewById(R.id.inv5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6= new Intent(getApplicationContext(),Activity_DevBy.class);
                startActivity(intent6);
            }
        });
    }
}
