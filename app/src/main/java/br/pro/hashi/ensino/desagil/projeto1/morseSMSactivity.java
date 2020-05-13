package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class morseSMSactivity extends AppCompatActivity {

    private String morse;
    private Translator translator;
    private String decoded;
    private String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morsesms);
        Translator translator = new Translator();

        TextView textMessage = findViewById(R.id.text_message);
        TextView textPhone = findViewById(R.id.text_phone);
        Button buttonSend = findViewById(R.id.button_send);
        Button buttonTel = findViewById(R.id.push_button);
        Button buttonEnter = findViewById(R.id.translate_button);

        Bundle extras = getIntent().getExtras();

        buttonEnter.setOnClickListener((view) -> {
            if (morse != null) {

                String Mchar = String.valueOf(translator.morseToChar(morse)); // Convert char to str
                if (decoded == null) {
                    decoded = Mchar;
                } else {
                    decoded += Mchar;
                }
            }
            textPhone.setText(decoded);
            morse = null;
            textMessage.setText(morse);
        });


        buttonEnter.setOnLongClickListener((view) -> {
            char lastChar = morse.charAt(morse.length() - 1);
            // está com bug
            if (morse != null) {

                morse = morse.substring(0, morse.length() - 1);
            }


            textMessage.setText(morse);
            return true;
        });
        buttonTel.setOnClickListener((view) -> {
            if (morse == null) {
                morse = ".";
            } else {
                morse = morse + ".";
            }
            textMessage.setText(morse);


        });
        buttonTel.setOnLongClickListener((view) -> {
            if (morse == null) {
                morse = "-";
            } else {
                morse = morse + "-";
            }
            textMessage.setText(morse);
            return true;


        });
        buttonSend.setOnClickListener((view) -> {

            String mensagem = extras.getString("mensagem");




//            if (textMessage.isEmpty()) {
//                showToast("Mensagem inválida!");
//                return;
//            }

            String phone = textPhone.getText().toString();

            // Esta verificação do número de telefone é bem
            // rígida, pois exige até mesmo o código do país.
            if (!PhoneNumberUtils.isGlobalPhoneNumber(phone)) {
                showToast("Número inválido!");
                return;
            }

            // Enviar uma mensagem de SMS. Por simplicidade,
            // não estou verificando se foi mesmo enviada,
            // mas é possível fazer uma versão que verifica.
            SmsManager manager = SmsManager.getDefault();
            manager.sendTextMessage(phone, null, mensagem, null, null);

            // Limpar o campo para nenhum engraçadinho
            // ficar apertando o botão várias vezes.
            textPhone.setText("");
        });


    }

    private void showToast(String text) {

        // Constrói uma bolha de duração curta.
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);

        // Mostra essa bolha.
        toast.show();
    }

}
