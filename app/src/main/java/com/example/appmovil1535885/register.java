package com.example.appmovil1535885;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //INICIAR OBJETOS PARA CADA CONTROL EN XML - JAVA - XML


        TextView lblcancel = findViewById(R.id.lblcancel);

        Button btncancelregist = findViewById(R.id.btncancelarregister);
        Button btnIniciarRegister = findViewById(R.id.btnIniciarRegister);
        Button btnLimpiarRegister = findViewById(R.id.btnLimpiarRegister);

        EditText txtNameRegister = findViewById(R.id.txtNameRegister);
        EditText txtTelefonoRegister = findViewById(R.id.txtTelefonoRegister);
        EditText txtEmailRegister = findViewById(R.id.txtEmailRegister);
        EditText txtPassRegister = findViewById(R.id.txtPassRegister);


        //BUTTON btncancelregist debe abrir view -> MainActivity

        btncancelregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conectar = new Intent(register.this,MainActivity.class);
                startActivity(conectar);
            }
        });

        //TXTVIEW lblcancel debe abrir view -> MainActivity

        lblcancel.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conectar = new Intent(register.this,MainActivity.class);
                startActivity(conectar);
            }
        }));

    }
}