package com.example.terapeutavr;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View;


public class LoginActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //OCULTAR BARRA DE ESTADO
        getSupportActionBar().hide();
        Tools.setSystemBarLight(this);
        Tools.setSystemBarColor(this,R.color.white);
        setContentView(R.layout.activity_login);
        //LANZAR ACTIVITY
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(v.getContext(), MainActivity.class);
                //startActivityForResult(intent, 0);
            }
        });



    }
}