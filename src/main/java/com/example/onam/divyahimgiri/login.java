package com.example.onam.divyahimgiri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by onam on 5/1/2015.
 */
public class login extends Activity {
Button b1;
    EditText e1,e2;
    Intent   myIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
     b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1=(EditText)findViewById(R.id.editText);
                Toast.makeText(getApplication(), "login suceesful", Toast.LENGTH_SHORT)
                        .show();

                myIntent = new Intent(getApplication(),MainActivity.class);
                startActivity(myIntent);


            }
        });


    }
}

