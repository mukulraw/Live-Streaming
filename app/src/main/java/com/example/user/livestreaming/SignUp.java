package com.example.user.livestreaming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.ConnectException;

public class SignUp extends AppCompatActivity {

    EditText user , mobile , password , retype;

    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        user = findViewById(R.id.user);
        password = findViewById(R.id.password);
        mobile = findViewById(R.id.mobile);
        retype = findViewById(R.id.retype);
        signup = findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });


        String u = user.getText().toString();
        String m = mobile.getText().toString();
        String p = password.getText().toString();
        String rp = retype.getText().toString();




       /* if (u.length()>0){

            if (m.length()>0){

                if (p.length()>0){

                    if (rp.length()>0){



                    }else {

                        Toast.makeText(this, "Invalid Retype Password", Toast.LENGTH_SHORT).show();
                    }

                }else {

                    Toast.makeText(this, "Invalid Password", Toast.LENGTH_SHORT).show();

                }

            }else {
                Toast.makeText(this, "Invalid Mobile Number", Toast.LENGTH_SHORT).show();

            }


        }else {
            Toast.makeText(this, "Invalid Username", Toast.LENGTH_SHORT).show();
        }*/


    }
}
