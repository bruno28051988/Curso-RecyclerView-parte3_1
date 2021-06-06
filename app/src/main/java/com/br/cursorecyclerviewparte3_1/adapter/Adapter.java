package com.br.cursorecyclerviewparte3_1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.br.cursorecyclerviewparte3_1.R;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    @NonNull
    @Override
    //Criar as visualizações
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    //Exibir as visualizações
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.titulo.setText("Titulo Filme");
        holder.genero.setText("Comédia");
        holder.ano.setText("2017");
    }

    @Override
    //retorna a quantidade de itens que vão ser exibidos
    public int getItemCount() {
        return 5;
    }

    //classe para criar os itens
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView genero;
        TextView ano;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            genero = itemView.findViewById(R.id.textGenero);
            ano = itemView.findViewById(R.id.textAno);
        }
    }
}
