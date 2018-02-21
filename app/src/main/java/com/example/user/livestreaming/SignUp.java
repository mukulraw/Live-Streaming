package com.example.user.livestreaming;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

public class SignUp extends AppCompatActivity {

    EditText firstname, lastname, company, jobtitle, email, phone;

    Spinner type, spinner;

    String t = "";
    String s = "";

    List<String> typ;
    List<String> spin;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        typ = new ArrayList<>();
        spin = new ArrayList<>();

        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        company = findViewById(R.id.company);
        jobtitle = findViewById(R.id.jobtitle);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);

        spinner = findViewById(R.id.spinner);

        type = findViewById(R.id.type);

        typ.add("Organization Type*");
        typ.add("Tobacco");
        typ.add("Translation and Localization");
        typ.add("Transportation/Trucking/Railroad");
        typ.add("Utilities");
        typ.add("Venture Capital & Private Equity");
        typ.add("Veterinary");
        typ.add("Warehousing");
        typ.add("Wholesale");
        typ.add("Wine and Spirits");
        typ.add("Wireless");
        typ.add("Writing and Editing");
        typ.add("Supermarkets");
        typ.add("Telecommunications");
        typ.add("Textiles");
        typ.add("Think Tanks");
        typ.add("Tobacco");
        typ.add("Translation and Localization");
        typ.add("Transportation/Trucking/Railroad");
        typ.add("Utilities");
        typ.add("Venture Capital & Private Equity");
        typ.add("Veterinary");
        typ.add("Warehousing");
        typ.add("Printing");
        typ.add("Professional Training & Coaching");
        typ.add("Program Policy");
        typ.add("Public Relations and Communications");
        typ.add("Public Safety");
        typ.add("Publishing");
        typ.add("Railroad Manufacture");
        typ.add("Ranching");
        typ.add("Real Estate");
        typ.add("Recreational Facilities and Services");
        typ.add("Religious Institutions");
        typ.add("Renewables & Environment");
        typ.add("Research");
        typ.add("Restaurants");
        typ.add("Retail");
        typ.add("Security and Investigations");
        typ.add("Semiconductors");
        typ.add("Shipbuilding");
        typ.add("Sporting Goods");
        typ.add("Sports");
        typ.add("Staffing and Recruiting");
        typ.add("Outsourcing/Offshoring");
        typ.add("Package/Freight Delivery");
        typ.add("Packaging and Containers");
        typ.add("Paper & Forest Products");
        typ.add("Performing Arts");
        typ.add("Pharmaceuticals");
        typ.add("Philanthropy");
        typ.add("Photography");
        typ.add("Plastics");
        typ.add("Political Organization");
        typ.add("Primary/Secondary Education");


        ArrayAdapter aa = new ArrayAdapter(this, R.layout.spinner, typ);
        aa.setDropDownViewResource(android.R.layout.simple_list_item_1);

        type.setAdapter(aa);

        type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //((TextView)adapterView.getChildAt(i)).setTextColor(Color.parseColor("#ffffff"));
                typ.get(i);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spin.add("What are you using LiveStream for?*");
        spin.add("Wholesale");
        spin.add("Wine and Spirits");
        spin.add("Wireless");
        spin.add("Writing and Editing");


        ArrayAdapter aa1 = new ArrayAdapter(this, R.layout.spinner, spin);
        aa1.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(aa1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                spin.get(i);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        signup = findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });


        String u = firstname.getText().toString();
        String m = lastname.getText().toString();
        String p = company.getText().toString();
        String rp = jobtitle.getText().toString();
        String e = email.getText().toString();
        String ph = phone.getText().toString();





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
