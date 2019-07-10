package com.liarkat.pushextrapractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ednombre, edapellido, ededad, edemail, edtrabajo;
    Button btnenviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnenviar = findViewById(R.id.btnenviar);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MandarAOtroActivity();
            }
        });
    }




    public void MandarAOtroActivity(){
      ednombre = findViewById(R.id.ednombre);
      edapellido = findViewById(R.id.edapellido);


      Intent intent = new Intent(this, MostrarDatos.class);

      intent.putExtra("nombre", ednombre.getText().toString());
      intent.putExtra("apellido", edapellido.getText().toString());

      startActivity(intent);
    }
}
