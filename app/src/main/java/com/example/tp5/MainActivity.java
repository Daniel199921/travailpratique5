package com.example.tp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText passeword;
    private Button inscript;
    private DataBaseManager dataBaseManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText) findViewById(R.id.Name);
        passeword=(EditText) findViewById(R.id.password);
        inscript=(Button) findViewById(R.id.incript);
        dataBaseManager=new DataBaseManager(this);
        //dataBaseManager.record(Name,passeword);
    }

    public void accueil(View view) {
        Intent i= new Intent(this, accueil.class);
        if (Name != null && passeword != null){



            startActivity(i);
        }
    }
}