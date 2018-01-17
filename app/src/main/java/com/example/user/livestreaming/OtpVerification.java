package com.example.user.livestreaming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OtpVerification extends AppCompatActivity {

    Button verify;

    EditText otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        otp = findViewById(R.id.otp);
        verify = findViewById(R.id.verify);


        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(OtpVerification.this , MainActivity.class);
                startActivity(i);
            }
        });


        String o = otp.getText().toString();

       /* if (o.length()>0){



        }else {
            Toast.makeText(this, "Invalid Otp", Toast.LENGTH_SHORT).show();
        }*/
    }
}
