package br.pro.hashi.ensino.desagil.projeto1;

;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.LinkedList;

public class DictActivity extends AppCompatActivity {
    private Translator translator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dict);

        translator = new Translator();
        LinkedList<String> myStringArray = translator.getCodes();
        LinkedList<String> Dict = new LinkedList<>();

        for (String s : myStringArray) {
            Dict.add(s + "  =  " + Character.toUpperCase(translator.morseToChar(s)));

        }


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, Dict);



        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    };



}
