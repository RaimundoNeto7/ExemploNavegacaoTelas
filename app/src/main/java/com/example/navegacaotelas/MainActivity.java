package com.example.navegacaotelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO #2 Instanciar os botões e criar o evento de click para fazer a navegação de tela
        Button btnTela1 = findViewById(R.id.btnTela1);
        Button btnTela2 = findViewById(R.id.btnTela2);
        Button btnTela3 = findViewById(R.id.btnTela3);


        // TODO #3 Para cada evento de click, intanciar uma intent e chamar a activity que você quer mostrar
        btnTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tela1Activity.class);
                startActivity(intent);
            }
        });

        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tela2Activity.class);
                startActivity(intent);
            }
        });

        btnTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tela3Activity.class);
                startActivity(intent);
            }
        });
    }
}
