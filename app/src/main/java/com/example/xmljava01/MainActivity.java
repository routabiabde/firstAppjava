package com.example.xmljava01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nomPrenom = findViewById(R.id.nom_prenom);
        EditText email = findViewById(R.id.email);
        EditText Phone = findViewById(R.id.phone);
        EditText adresse = findViewById(R.id.adresse);
        EditText ville =findViewById(R.id.Ville);
        Button btn = findViewById(R.id.button);
        HashMap<String,String> data = new HashMap<>();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                data.put("nom et prenom",nomPrenom.getText().toString());
                data.put("email",email.getText().toString());
                data.put("phone",Phone.getText().toString());
                data.put("Adresse",adresse.getText().toString());
                data.put("ville",ville.getText().toString());
                intent.putExtra("data",data);
//                Context context = getApplicationContext();
//                int  dr = Toast.LENGTH_LONG;
//                String str = "hello istaNtic";
//                Toast t = Toast.makeText(context,str,dr);
//                t.show();

                startActivity(intent);
            }
        });




}}
