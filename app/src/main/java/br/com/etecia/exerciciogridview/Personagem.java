package br.com.etecia.exerciciogridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Personagem extends AppCompatActivity {


    private TextView Nome, Idade, Pontua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem);

        Nome = findViewById(R.id.idNome);
        Idade = findViewById(R.id.Idad);


    }
}