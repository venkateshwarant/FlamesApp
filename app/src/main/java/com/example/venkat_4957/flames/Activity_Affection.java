package com.example.venkat_4957.flames;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_Affection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.affection);
        Button btn = (Button) findViewById(R.id.inv1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6= new Intent(getApplicationContext(),Activity_DevBy.class);
                startActivity(intent6);
            }
        });
    }
}
