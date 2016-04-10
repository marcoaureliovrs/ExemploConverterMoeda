package br.com.marcogorak.exemploconvertermoeda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    //Declarando atributos da classe
    TextView txtValorConvertido;
    Button btnDolar;
    Button btnEuro;
    EditText edtValor;
    Double valor;
    String apresentacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associando os elementos da tela com os atributos locais da classe
        txtValorConvertido = (TextView) findViewById(R.id.txtValorConvertido);
        btnDolar = (Button) findViewById(R.id.btnDolar);
        btnEuro = (Button) findViewById(R.id.btnEuro);
        edtValor= (EditText) findViewById(R.id.edtValor);

        //Implementando o ouvinte de eventos
        btnDolar.setOnClickListener(this);
        btnEuro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        //Validando qual o elemento ecutado pelo ouvinte
        if (btnDolar.getId() == id) {
            //Faz o calculo da moeda convertendo os elementos de String para Double
            valor= Double.parseDouble(edtValor.getText().toString()) / 3.63;
            //Monta a mensagem da conversão para Dolar através do método String.format
            apresentacao = String.format("$: %.2f",valor);
            txtValorConvertido.setText(apresentacao);

        } else if (btnEuro.getId() == id) {
            //Faz o calculo da moeda convertendo os elementos de String para Double
            valor= Double.parseDouble(edtValor.getText().toString()) / 4.63;
            //Monta a mensagem da conversão para Euro através do método String.format
            apresentacao = String.format("$: %.2f",valor);
            txtValorConvertido.setText(apresentacao);

        }

    }
}
