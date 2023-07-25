package com.example.hw_2_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText login;
    private EditText password;
    private Button enter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);
        enter = findViewById(R.id.Button);

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (password.getText().toString().isEmpty()) {
                    enter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                }else {
                    enter.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }

            }
        });

        login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (login.getText().toString().isEmpty()){
                    enter.setBackgroundColor(Color.GRAY);
                }else {
                    enter.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }

            }
        });
        enter.setOnClickListener(view -> {
            if (login.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("admin")){
                password.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                enter.setVisibility(View.GONE);
                enter.setVisibility(View.GONE);
                Toast.makeText(this,"Вы успешно зарегистрировались!",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this,"Неверный пароль и логин",Toast.LENGTH_SHORT).show();
            }


        });

    }




}