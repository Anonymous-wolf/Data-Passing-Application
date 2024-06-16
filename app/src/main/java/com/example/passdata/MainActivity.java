package com.example.passdata;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge;
    private Button buttonSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        buttonSendData = findViewById(R.id.buttonSendData);

        buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
    }

    private void sendData() {
        String name = editTextName.getText().toString().trim();
        int age = Integer.parseInt(editTextAge.getText().toString().trim());

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("NAME", name);
        intent.putExtra("AGE", age);
        startActivity(intent);
    }
}
