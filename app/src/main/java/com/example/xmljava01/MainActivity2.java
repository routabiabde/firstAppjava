package com.example.xmljava01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.HashMap;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView nomPrenom =(TextView) findViewById(R.id.affichNom);
        TextView email =(TextView) findViewById(R.id.affichEmail);
        TextView Phone =(TextView) findViewById(R.id.affichPhone);
        TextView adresse =(TextView) findViewById(R.id.affichAdresse);
        TextView ville =(TextView)findViewById(R.id.affichVille);

        Intent i = getIntent();
        Serializable s = getIntent().getSerializableExtra("data");
        if (s != null){
            HashMap data = (HashMap) s;
            nomPrenom.setText("nom :"+data.get("nom et prenom"));
            email.setText("email :"+data.get("email"));
            Phone.setText("phone :"+data.get("phone"));
            adresse.setText("Adresse :"+data.get("Adresse"));
            ville.setText("ville :"+data.get("ville"));
        }



    }
}