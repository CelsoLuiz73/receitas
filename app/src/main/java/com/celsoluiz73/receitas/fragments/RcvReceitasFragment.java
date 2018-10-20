package com.celsoluiz73.receitas.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.celsoluiz73.receitas.R;
import com.celsoluiz73.receitas.modelo.Receita;

/**
 * A simple {@link Fragment} subclass.
 */
public class RcvReceitasFragment extends Fragment {

    //passo 3 - criação do fragment e do layout em xml
    //ver passo 4 no fragment_rcv_receitas.xml


    public RcvReceitasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // passo 13 - ajustar este método para que possamos manipular o RecylcerView, o LayoutManager e
        // o adapter. Para isso, precisamos destacar um objeto do tipo View, porque o 1) Java é orientado a objeto
        // e 2) somente objetos do tipo View podem ser usados para vincular o Java ao xml
        // passo 14 - destacar um objeto do tipo View para manipular
        View view = inflater.inflate(R.layout.fragment_rcv_receitas, container, false);

        //passo 15 - vincular um objeto do tipo RecyclerView com o xml

        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);

        return view;
    }

}
