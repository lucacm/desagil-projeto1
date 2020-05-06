package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SMSActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

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
        setContentView(R.layout.activity_sms);

        TextView textMessage = findViewById(R.id.text_message);
        EditText textPhone = findViewById(R.id.text_phone);
        Button buttonSend = findViewById(R.id.button_send);

//        TextView text = findViewById(R.id.text);

        Spinner dropdownSpinner = findViewById(R.id.dropdown);
        dropdownSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterDropdown = ArrayAdapter.createFromResource(this,
                R.array.frases, android.R.layout.simple_spinner_item);

        adapterDropdown.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dropdownSpinner.setAdapter(adapterDropdown);

        buttonSend.setOnClickListener((view) -> {
            String message = dropdownSpinner.getSelectedItem().toString();
            textMessage.setText(message);

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
            manager.sendTextMessage(phone, null, message, null, null);

            // Limpar o campo para nenhum engraçadinho
            // ficar apertando o botão várias vezes.
            textPhone.setText("");
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView textView = findViewById(R.id.text);
//        String content = parent.toString();
//        textView.setText(content);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
