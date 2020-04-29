package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.text);
        Button buttonExample = findViewById(R.id.button_example);


        Spinner dropdownSpinner = findViewById(R.id.dropdown);
        dropdownSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterDropdown = ArrayAdapter.createFromResource(this,
                R.array.frases, android.R.layout.simple_spinner_item);

        adapterDropdown.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dropdownSpinner.setAdapter(adapterDropdown);

        buttonExample.setOnClickListener((view) -> {
            String Message = dropdownSpinner.getSelectedItem().toString();
            text.setText(Message);
       });



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        TextView textView = findViewById(R.id.text);
//        String content =parent.toString();
//        textView.setText(content);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
