package net.example.apptds;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = (EditText)findViewById(R.id.textInput);
        Button botao = (Button)findViewById(R.id.button);
        TextView resultado = (TextView)findViewById(R.id.resCalc);

        // botao.setOnClickListener(view -> {
        //     int valor = 1;
        //     String entrada = input.getText().toString();
        //     try {
        //         valor = Integer.parseInt(entrada);
        //     } catch (NumberFormatException e) {
        //         System.out.println("Entrada inválida");
        //     }
        //     resultado.setText("" + calculaFatorial(valor));
        // });
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = 1;
                String entrada = input.getText().toString();
                try {
                    valor = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida");
                }
                resultado.setText("" + calculaFatorial(valor));
            }
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