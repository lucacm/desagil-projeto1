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



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, myStringArray){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = (TextView) super.getView(position, convertView, parent);

                return view;
            }
        };


        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }



}
