package com.example.venkat_4957.flames;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name,partnername;
    Button btn;
    private static final String TAG = MainActivity.class.getSimpleName();
    String name_string,partnername_string;
    int N1len,N2len;
    StringBuffer NameB1,NameB2;
    int Name3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= (EditText) findViewById(R.id.name);
        partnername= (EditText) findViewById(R.id.partnername);


        btn =(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name_string= name.getText().toString();
                partnername_string= partnername.getText().toString();

                N1len = name_string.length();
                N2len = partnername_string.length();
                name_string = name_string.toLowerCase();
                partnername_string = partnername_string.toLowerCase();

                NameB1 = new StringBuffer(name_string);
                NameB2 = new StringBuffer(partnername_string);
                for (int i = 0; i<N1len; i++)
                {
                    for (int j = 0; j<N2len; j++)
                    {
                        if (NameB1.charAt(i) == NameB2.charAt(j))
                        {
                            NameB1 = NameB1.deleteCharAt(i);
                            NameB2 = NameB2.deleteCharAt(j);
                            N1len= NameB1.length();
                            N2len= NameB2.length();
                            i=0;
                            j=0;
                        }

                    }

                }
                Name3= NameB1.length()+NameB2.length();
                //System.out.println(NameB1);
                //System.out.println(NameB2);
                //System.out.println(Name3);

         /* Flames Calculation */

                char flameResult =0;
                String flames = "FLAMES";
                StringBuffer sb3 = new StringBuffer(flames);
                while (sb3.length()!=1)
                {
                    int Name4 =  Name3%sb3.length();
                    String temp;
                    if(Name4!=0)
                    {
                        temp = sb3.substring(Name4)+sb3.substring(0, Name4-1);
                    }
                    else
                    {
                        temp=sb3.substring(0,sb3.length()-1);
                    }
                    sb3 = new StringBuffer(temp);

                    flameResult=sb3.charAt(0);
                }


                switch(flameResult){
    case 'F':
        Intent intent= new Intent(getApplicationContext(),Activity_Friends.class);
        startActivity(intent);
        break;
    case 'L':
        Intent intent1= new Intent(getApplicationContext(),Activity_Love.class);
        startActivity(intent1);
        break;
    case 'A':
        Intent intent2= new Intent(getApplicationContext(),Activity_Affection.class);
        startActivity(intent2);
        break;
    case 'M':
        Intent intent3= new Intent(getApplicationContext(),Activity_Marriage.class);
        startActivity(intent3);
        break;
    case 'E':
        Intent intent4= new Intent(getApplicationContext(),Activity_Enemy.class);
        startActivity(intent4);
        break;
    case 'S':
        Intent intent5= new Intent(getApplicationContext(),Activity_Sister.class);
        startActivity(intent5);
        break;
    default:

}


            }
        });



    }
}

