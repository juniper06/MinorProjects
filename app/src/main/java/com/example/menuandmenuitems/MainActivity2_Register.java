package com.example.menuandmenuitems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2_Register extends AppCompatActivity {
    private EditText txtFirstName;
    private EditText txtLastName;
    private RadioGroup radioGender;
    private RadioButton radioSelectedGender;
    private EditText txtBirthDate;
    private EditText txtPhoneNumber;
    private EditText txtEmailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_register);

        txtFirstName = findViewById(R.id.txtFirstName);
        txtLastName = findViewById(R.id.txtLastName);
        radioGender = findViewById(R.id.radioGender);
        txtPhoneNumber = findViewById(R.id.txtPhoneNumber);
        txtBirthDate = findViewById(R.id.txtBirthDate);
        txtEmailAddress = findViewById(R.id.txtEmailAddress);
    }

    public void submitFields(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity3_ListDisplay.class);
        String firstName = txtFirstName.getText().toString();
        String lastName = txtLastName.getText().toString();
        int radioGenderID = radioGender.getCheckedRadioButtonId();
        radioSelectedGender = findViewById(radioGenderID);
        String selectedGender = radioSelectedGender.getText().toString();
        String birthDate = txtBirthDate.getText().toString();
        String phoneNumber = txtPhoneNumber.getText().toString();
        String emailAddress = txtEmailAddress.getText().toString();
        intent.putExtra("firstName", firstName);
        intent.putExtra("lastName", lastName);
        intent.putExtra("gender", selectedGender);
        intent.putExtra("birthDate", birthDate);
        intent.putExtra("phoneNumber", phoneNumber);
        intent.putExtra("emailAddress", emailAddress);
        startActivity(intent);
    }
}