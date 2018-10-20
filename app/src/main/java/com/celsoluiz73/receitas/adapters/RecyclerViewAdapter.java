package com.celsoluiz73.receitas.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.celsoluiz73.receitas.R;
import com.celsoluiz73.receitas.modelo.Receita;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    //passo 6 - criação do adapter do recyclerview implementando todos os métodos, classes e
    // construtores necesários

    // passo 7 - criar uma lista de itens que serão usados

    private List<Receita> listaDeReceitas;

    public RecyclerViewAdapter(List<Receita> listaDeReceitas) {
        this.listaDeReceitas = listaDeReceitas;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //passo 8 - inserir o código que inflará numa view o layout que criamos para cada item a ser
        //renderizados no recyclerview
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rcv_item_receita, parent, false);
        return new ViewHolder(view);
        // o método acima infla o layout criado para item no recyclerview
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        //passo 9 - informar a posição da lista onde buscar cada receita
        Receita receita = listaDeReceitas.get(position);
        //passo 10 - vincular as informações que são necessárias para criação de cada item do recyclerview
        // ver passo 11 abaixo onde criámos o método bind (atrelar) dentro da classe ViewHolder
        holder.bind(receita);
    }

    @Override
    public int getItemCount() {
        // este método define o tamanho da lista de itens a ser renderizado no nosso recyclerview
        //passo 12 - definir o tamanho do recyclerview para o tamanho da lista que nós temos
        //essa lista foi criada no passo 7

        return listaDeReceitas.size();


        //ver passo 13 no RcvReceitasFragment
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // Passo 11 - vincular as informações do xml ao neste código java

        private ImageView imagemDaRecita;
        private TextView nomeDaReceita;


        public ViewHolder(View itemView) {
            super(itemView);

            imagemDaRecita = itemView.findViewById(R.id.imageView_receita);
            nomeDaReceita = itemView.findViewById(R.id.textView_nomeDaReceita);

        }

        public void bind(Receita receita) {
            // método responsável por receber infromações e atrelá-las aos objetos a serem
            //renderizados no recyclerview
            //perguntar para o Tairo como atrelar a imagem

            nomeDaReceita.setText(receita.getNome());
        }
    }
}
