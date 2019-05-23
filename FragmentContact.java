package com.example.lims.onibus;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;

    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("109-MONTE VERDE / SHOPPING",R.drawable.ic_bus));
        lstContact.add(new Contact("108-VASSOURAS / SHOPPING via CENTENÁRIO",R.drawable.ic_bus));
        lstContact.add(new Contact("201-SANTA MARIA via CENTENÁRIO",R.drawable.ic_bus));
        lstContact.add(new Contact("105-MONTE VERDE via PARQUE ALVORADA",R.drawable.ic_bus));
        lstContact.add(new Contact("102-MOCAMBINHO - POTY VELHO via UESPI / ACARAPE",R.drawable.ic_bus));
        lstContact.add(new Contact("501-ANITA FERRAZ",R.drawable.ic_bus));
        lstContact.add(new Contact("405-PLANALTO URUGUAI/JOCKEY CLUB/SHOPPING",R.drawable.ic_bus));
        lstContact.add(new Contact("502-SOCOPO - CIDADE JARDIM via SÃO CRISTOVÃO",R.drawable.ic_bus));
        lstContact.add(new Contact("403-VILA BANDEIRANTE - SATÉLITE via DOM SEVERINO",R.drawable.ic_bus));
        lstContact.add(new Contact("365-UNIVERSIDADE CIRCULAR 2",R.drawable.ic_bus));
        lstContact.add(new Contact("A538-PEDRO BALZI / TERM. LIVRAMENTO",R.drawable.ic_bus));
        lstContact.add(new Contact("327-RODOVIÁRIA CIRCULAR 2",R.drawable.ic_bus));
        lstContact.add(new Contact("A632-REDONDA - DIRCEU I / TERMINAL ITARARÉ",R.drawable.ic_bus));
        lstContact.add(new Contact("T532-TERM. LIVRAMENTO via SÃO JOÃO / SHOPPING",R.drawable.ic_bus));
        lstContact.add(new Contact("A831-DISTRITO INDUSTRIAL / TERM. PARQUE PIAUÍ",R.drawable.ic_bus));
        lstContact.add(new Contact("A832-SANTA FÉ / TERMINAL PARQUE PIAUÍ",R.drawable.ic_bus));
        lstContact.add(new Contact("A733-PORTO ALEGRE / TERMINAL BELA VISTA",R.drawable.ic_bus));
        lstContact.add(new Contact("A736-MONTE VERDE / SHOPPING",R.drawable.ic_bus));
        lstContact.add(new Contact("A738-TERM. PARQUE PIAUÍ - TERM. BELA VISTA via SANTO ANTÔNIO",R.drawable.ic_bus));
        lstContact.add(new Contact("03-MOCAMBINHO / ALTO DA RESSURREIÇÃO",R.drawable.ic_bus));
        lstContact.add(new Contact("04-PORTO ALEGRE / SHOPPING",R.drawable.ic_bus));
        lstContact.add(new Contact("08-BELA VISTA - MORADA NOVA / SHOPPING",R.drawable.ic_bus));
        lstContact.add(new Contact("09-PROMORAR / SATÉLITE",R.drawable.ic_bus));
        lstContact.add(new Contact("UFPI-Circular UFPI (Fantasmão)",R.drawable.ic_bus));
        lstContact.add(new Contact("RURAL-BELA VISTA - MORADA NOVA / SHOPPING",R.drawable.ic_bus));

    }
}
