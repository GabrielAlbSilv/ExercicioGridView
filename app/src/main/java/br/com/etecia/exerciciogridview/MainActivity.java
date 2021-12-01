package br.com.etecia.exerciciogridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Personagens> perso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        perso = new ArrayList<>();
        perso.add(new Personagens("Knight", "10", "1ºLugar", R.drawable.knight_perfil));
        perso.add(new Personagens("Hornet", "14", "2ºLugar", R.drawable.hornet_perfil));
        perso.add(new Personagens("Quirrel", "24", "3ºLugar", R.drawable.quirrel_perfil));
        perso.add(new Personagens("Madeline", "21", "4ºLugar", R.drawable.madeline_perfil));
        perso.add(new Personagens("Badeline", "21", "5ºLugar", R.drawable.badeline_perfil));
        perso.add(new Personagens("Theo", "25", "6ºLugar", R.drawable.theo_perfil));
        perso.add(new Personagens("Zero", "22", "7ºLugar", R.drawable.zero_perfil));
        perso.add(new Personagens("Frisk", "11", "8ºLugar", R.drawable.frisk_perfil));
        perso.add(new Personagens("Sans", "30", "9ºLugar", R.drawable.sans_perfil));
        perso.add(new Personagens("Papyrus", "15", "10ºLugar", R.drawable.papyrus_perfil));

        RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);

        Adapter mAdapter = new Adapter(getApplicationContext(), perso);

        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mAdapter);
    }
}