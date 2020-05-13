package br.pro.hashi.ensino.desagil.projeto1;

;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DictActivity extends AppCompatActivity {
    private Translator translator;
    private String steste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dict);

        Translator translator = new Translator();
        TextView textMessage = findViewById(R.id.text_dict);
        Button teste = findViewById(R.id.button_dict);
    teste.setOnClickListener((view) -> {
        steste = translator.charToMorse('a');
        textMessage.setText(steste);
    });
    }




}
