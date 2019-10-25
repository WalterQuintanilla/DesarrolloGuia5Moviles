package com.example.desarrolloguia5moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.btnConversations:
                miIntent = new Intent(MainActivity.this, Conversations.class);
                startActivity(miIntent);
                break;

            case R.id.btnLogin:
                miIntent = new Intent(MainActivity.this, Login.class);
                startActivity(miIntent);
                break;

            case R.id.btnCalculadora:
                miIntent = new Intent(MainActivity.this, Calculadora.class);
                startActivity(miIntent);
                break;

            case R.id.btnMisDatos:
                miIntent = new Intent(MainActivity.this, misDatos.class);
                startActivity(miIntent);
                break;

        }
    }
}
