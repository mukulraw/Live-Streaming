package com.example.user.livestreaming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginForget extends AppCompatActivity {


    EditText mobile , password;

    Button login;

    TextView forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_forget);

        mobile = findViewById(R.id.mobile);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        forgot = findViewById(R.id.forgot);

        String m = mobile.getText().toString();
        String p = password.getText().toString();


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LoginForget.this , OtpVerification.class);
                startActivity(i);



            }
        });

       /* if (Utils.isValidMobile(m)){

            if (p.length()>0){




            }else {
                Toast.makeText(this, "Invalid Password", Toast.LENGTH_SHORT).show();
            }

        }else {
            Toast.makeText(this, "Invalid Mobile", Toast.LENGTH_SHORT).show();
        }
*/
    }
}
