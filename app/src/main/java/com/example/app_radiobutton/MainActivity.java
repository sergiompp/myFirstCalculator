package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        tv1 = (TextView)findViewById(R.id.txt_resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_sumar);
        rb2 = (RadioButton)findViewById(R.id.rb_restar);
        rb3 = (RadioButton)findViewById(R.id.rb_multiplicar);
        rb4 = (RadioButton)findViewById(R.id.rb_dividir);
    }
    //Metodo para el boton calcular
    public void calcular(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();
        String resultado;

        float valor1_float = Integer.parseInt(valor1_String);
        float valor2_float = Integer.parseInt(valor2_String);
        float suma;
        float resta;
        float multiplicar;
        float dividir;

        while(rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()){
            if(rb1.isChecked()){
                Toast.makeText(this,"SUMAR",Toast.LENGTH_SHORT).show();

                suma = valor1_float + valor2_float;
                resultado = String.valueOf(suma);
                tv1.setText(resultado);

                rb1.setChecked(false);
            } else if (rb2.isChecked()){
                Toast.makeText(this,"RESTAR",Toast.LENGTH_SHORT).show();

                resta = valor1_float - valor2_float;
                resultado = String.valueOf(resta);
                tv1.setText(resultado);

                rb2.setChecked(false);
            } else if(rb3.isChecked()){
                Toast.makeText(this,"MULTIPLICAR",Toast.LENGTH_SHORT).show();

                multiplicar = valor1_float * valor2_float;
                resultado = String.valueOf(multiplicar);
                tv1.setText(resultado);

                rb3.setChecked(false);
            } else if (rb4.isChecked()){
                Toast.makeText(this,"DIVIDIR",Toast.LENGTH_SHORT).show();

                if (valor2_float == 0){
//                    Toast.makeText(this, "ERROR. DIVISIÓN POR 0!!", Toast.LENGTH_LONG).show();
                    tv1.setText("IMPOSIBLE. DIVISIÓN POR 0");
                } else {
                    dividir = valor1_float / valor2_float;
                    resultado = String.valueOf(dividir);
                    tv1.setText(resultado);
                }
                rb4.setChecked(false);
            }

        }

    }
}