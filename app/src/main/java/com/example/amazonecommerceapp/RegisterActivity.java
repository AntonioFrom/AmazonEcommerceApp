package com.example.amazonecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private Button registerBtn;
    private EditText inputName, inputPhoneNumber, inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerBtn.findViewById(R.id.register_btn);
        inputName.findViewById(R.id.register_name_input);
        inputPhoneNumber.findViewById(R.id.register_phone_number_input);
        inputPassword.findViewById(R.id.register_password_input);
    }
}