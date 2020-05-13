package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Collections;
import java.util.LinkedList;

public class Dict2Activity extends AppCompatActivity {
    private Translator translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dict);
        translator = new Translator();
        LinkedList<String> myStringArray = translator.getCodes();
        LinkedList<String> Dict = new LinkedList<>();

        for (String s : myStringArray) {
            Dict.add(Character.toUpperCase(translator.morseToChar(s))  + "  =  " + s);

        }

        Collections.sort(Dict);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, Dict);



        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    };



}