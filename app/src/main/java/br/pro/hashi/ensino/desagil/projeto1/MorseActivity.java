package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

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

        TextView textMessage = findViewById(R.id.text_message);
        EditText textPhone = findViewById(R.id.text_phone);
        Button buttonSend = findViewById(R.id.button_send);
        Button morseButton = findViewById(R.id.push_button);
        Button delspaceButton = findViewById(R.id.delspace_button);

        // Ação do botão morse para escrever pontos
        morseButton.setOnClickListener((view) -> {
            if (morse == null){
                morse = ".";
            } else {
                morse = morse + ".";
            }
            textMessage.setText(morse);
        });

        // Ação do botão morse para escrever traços
        morseButton.setOnLongClickListener((view) -> {
            if (morse == null){
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
            if (morse != null){
                morse = morse.substring(0, morse.length() -1);
            }
            textMessage.setText(morse);
        });

        // Ação do botão morse para dar espaço
        delspaceButton.setOnLongClickListener((view) -> {
            if (morse == null){
                morse = " ";
            } else {
                morse = morse + " ";
            }
            textMessage.setText(morse);
            return true;
        });



        buttonSend.setOnClickListener((view) -> {
//            String message = .getSelectedItem().toString();
//            textMessage.setText(message);

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
            manager.sendTextMessage(phone, null, morse, null, null); // precisa arrumar o message

            // Limpar o campo para nenhum engraçadinho
            // ficar apertando o botão várias vezes.
            textPhone.setText("");
        });
    }

}
