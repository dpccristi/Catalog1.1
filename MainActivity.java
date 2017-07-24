package com.example.cristinel.catalog11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cristinel.catalog11.LoginRegisterDatabase.LoginActivity;
import com.example.cristinel.catalog11.LoginRegisterDatabase.RegisterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//ghj

    public void StudentButton(View view) {
        Button buton = (Button) findViewById(R.id.studentButton);
        buton.setBackgroundResource(R.drawable.roundbutton);
        Button buton2 = (Button) findViewById(R.id.profesorButtonId);
        buton2.setBackgroundResource(R.drawable.round);


        Button signIn = (Button) findViewById(R.id.SignIn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        Button signUp = (Button) findViewById(R.id.signUpButton);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    public void profesorButton(View view) {
        Button buton1 = (Button) findViewById(R.id.profesorButtonId);
        buton1.setBackgroundResource(R.drawable.roundbutton);
        Button buton2 = (Button) findViewById(R.id.studentButton);
        buton2.setBackgroundResource(R.drawable.round);

    }
}
