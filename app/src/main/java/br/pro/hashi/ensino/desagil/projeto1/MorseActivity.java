package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MorseActivity extends AppCompatActivity {
    private String morse;
    private Translator translator;
    private String decoded;



    // Método de conveniência para mostrar uma bolha de texto.
    private void showToast(String text) {

        // Constrói uma bolha de duração curta.
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);

        // Mostra essa bolha.
        toast.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse);
        Translator translator = new Translator();


        TextView textMessage = findViewById(R.id.text_message);

        TextView textTranslate = findViewById(R.id.text_translate);

//        EditText textPhone = findViewById(R.id.text_phone);
        Button buttonSend = findViewById(R.id.button_send);
        Button morseButton = findViewById(R.id.push_button);
        Button delspaceButton = findViewById(R.id.delspace_button);
        Button buttonSMS = findViewById(R.id.button_sms);

        Button translateButton = findViewById(R.id.button_translate);
        Bundle bundle = new Bundle();

        buttonSMS.setOnClickListener((view) ->{

            // Constrói uma Intent que corresponde ao pedido de "iniciar Activity".
            Intent intent = new Intent(this, morseSMSactivity.class);
            intent.putExtras(bundle);

            // Inicia a Activity especificada na Intent.
            startActivity(intent);

        });




        translateButton.setOnClickListener((view) -> {

            if (morse != null) {

                String Mchar = String.valueOf(translator.morseToChar(morse)); // Convert char to str
                if (decoded == null) {
                    decoded = Mchar;
                } else {
                    decoded += Mchar;
                }

            }
            textTranslate.setText(decoded);
            bundle.putString("mensagem",decoded);
            morse = null;
            textMessage.setText(morse);

        });
        // Ação do botão morse para escrever pontos
        morseButton.setOnClickListener((view) -> {
            if (morse == null) {
                morse = ".";
            } else {
                morse = morse + ".";
            }
            textMessage.setText(morse);
        });

        // Ação do botão morse para escrever traços
        morseButton.setOnLongClickListener((view) -> {
            if (morse == null) {
                morse = "-";
            } else {
                morse = morse + "-";
            }
            textMessage.setText(morse);
            return true;
        });

        // Ação do botão morse para apagar os caracteres

            delspaceButton.setOnClickListener((view) -> {
                char lastChar = morse.charAt(morse.length() - 1);
                // está com bug
                if (morse != null) {

                    morse = morse.substring(0, morse.length() - 1);
                }


                textMessage.setText(morse);
            });

        // Ação do botão morse para dar espaço
        delspaceButton.setOnLongClickListener((view) -> {

            char lastChar = decoded.charAt(decoded.length() - 1);
            // está com bug
            if (decoded != null) {

                decoded = decoded.substring(0, decoded.length() - 1);
            }


            textTranslate.setText(decoded);
            return true;
        });


        buttonSend.setOnClickListener((view) -> {

            decoded = decoded + " ";

            textTranslate.setText(decoded);

        });


    }

}