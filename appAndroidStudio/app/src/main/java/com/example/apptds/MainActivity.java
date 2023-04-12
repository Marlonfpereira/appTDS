package com.example.apptds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.textInput);
        Button botao = findViewById(R.id.button);
        TextView resultado = findViewById(R.id.resCalc);

        botao.setOnClickListener(view -> {
            int valor = 1;
            String entrada = input.getText().toString();
            try {
                valor = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida");
            }
            resultado.setText("" + calculaFatorial(valor));
        });
    }

    BigInteger calculaFatorial(int valor) {
        BigInteger fat = BigInteger.valueOf(1);
        for (int i = valor; i > 0; i--) {
            fat = fat.multiply(BigInteger.valueOf(i));
        }
        return fat;
    }
}