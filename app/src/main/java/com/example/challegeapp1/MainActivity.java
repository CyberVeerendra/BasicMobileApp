package com.example.challegeapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton(View view) {
        TextView textHello1 = findViewById(R.id.textMessage1);
        TextView textHello2 = findViewById(R.id.textMessage2);
        TextView textHello3 = findViewById(R.id.textMessage3);


        EditText editFirstName = findViewById(R.id.editFirstName);
        EditText editLastName = findViewById(R.id.editLastName);
        EditText editEmail = findViewById(R.id.editEmail);

        textHello1.setText("First Name: " + editFirstName.getText().toString());
        textHello2.setText("Last Name: " + editLastName.getText().toString());
        textHello3.setText("Email: " + editEmail.getText().toString());


    }
}