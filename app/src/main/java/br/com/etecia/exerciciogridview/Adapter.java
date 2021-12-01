package br.com.etecia.exerciciogridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
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
    //Será realizada a montagem dos dados.
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        //passando valores para o RecyclerView
        holder.tvNome.setText(dado.get(position).getNome());
        holder.imgPers.setImageResource(dado.get(position).getMiniatura());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
