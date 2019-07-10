package com.liarkat.pushextrapractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MostrarDatos extends AppCompatActivity {
    TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);
        Button btnatras = findViewById(R.id.btnatras);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        try{
            Bundle bundle = new Bundle();
            bundle = getIntent().getExtras();
            txt1.setText(bundle.getString("nombre"));
            txt2.setText(bundle.getString("apellido"));

        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "¡A ocurrido un error!", Toast.LENGTH_SHORT).show();
        }


        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
