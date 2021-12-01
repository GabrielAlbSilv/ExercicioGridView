package br.com.etecia.exerciciogridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Personagem extends AppCompatActivity {


    private TextView txtnome, txtidade, txtpontuacao;
    private ImageView imageper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem);

        txtnome = findViewById(R.id.idNome);
        txtidade = findViewById(R.id.Idade);
        txtpontuacao = findViewById(R.id.Pont);
        imageper = findViewById(R.id.ImgPerso);

        Intent intent = getIntent();

        String nome, idade, pontuacao;
        int miniatura;

        nome = intent.getExtras().getString("Nome");
        idade = intent.getExtras().getString("Idade");
        pontuacao = intent.getExtras().getString("Pontuacao");
        miniatura = intent.getExtras().getInt("Miniatura");

        txtnome.setText(nome);
        txtidade.setText(idade);
        txtpontuacao.setText(pontuacao);
        imageper.setImageResource(miniatura);
    }
}





