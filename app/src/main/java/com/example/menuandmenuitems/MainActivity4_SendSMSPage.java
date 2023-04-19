package com.example.menuandmenuitems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4_SendSMSPage extends AppCompatActivity {
    Button btnSend;
    EditText txtPhoneNumber;
    EditText txtMessage;
    String phoneNo;
    String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_send_smspage);

        btnSend = (Button) findViewById(R.id.btnSend);
        txtPhoneNumber = (EditText) findViewById(R.id.txtPhoneNumber);
        txtMessage = (EditText) findViewById(R.id.txtMessage);

        btnSend.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                phoneNo = txtPhoneNumber.getText().toString();
                message = txtMessage.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms",phoneNo, null));
                intent.putExtra("sms_body", message);
                startActivity(intent);

                Toast.makeText(MainActivity4_SendSMSPage.this,"SMS Sent", Toast.LENGTH_SHORT).show();
            }
        });
    }
}