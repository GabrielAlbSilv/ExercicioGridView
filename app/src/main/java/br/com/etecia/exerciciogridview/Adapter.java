package br.com.etecia.exerciciogridview;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context mContext;
    private List<Personagens> dado;

    public Adapter(Context applicationContext, List<Personagens> dado) {
        this.mContext = mContext;
        this.dado = dado;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.modelo_personagem, parent, false);

        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        //passando valores para o RecyclerView
        holder.tvNome.setText(dado.get(position).getNome());
        holder.tvIdade.setText(dado.get(position).getIdade());
        holder.tvPontuacao.setText(dado.get(position).getPontuacao());
        holder.imgPers.setImageResource(dado.get(position).getMiniatura());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, Personagem.class);

                intent.putExtra("Nome", dado.get(position).getNome());
                intent.putExtra("Idade", dado.get(position).getIdade());
                intent.putExtra("Pontuacao", dado.get(position).getPontuacao());
                intent.putExtra("Miniatura", dado.get(position).getMiniatura());

                mContext.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }


    @Override
    public int getItemCount() {
       return dado.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvNome, tvIdade, tvPontuacao;
        ImageView imgPers;
        CardView cardView;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            tvNome = itemView.findViewById(R.id.idNome);
            tvIdade = itemView.findViewById(R.id.idIdad);
            tvPontuacao = itemView.findViewById(R.id.idPont);
            imgPers = itemView.findViewById(R.id.ImgPerso);
            cardView = itemView.findViewById(R.id.idCardView);
        }
    }
}
