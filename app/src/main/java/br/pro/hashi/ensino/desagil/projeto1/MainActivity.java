package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text);

        Spinner dropdownSpinner = findViewById(R.id.dropdown);
        dropdownSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterDropdown = ArrayAdapter.createFromResource(this,
                R.array.frases, android.R.layout.simple_spinner_item);

        adapterDropdown.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dropdownSpinner.setAdapter(adapterDropdown);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
