package com.example.registration_page;

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

    public void btnclick (View view) {
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editTest);
        textView.setText(editText.getText().toString());
        TextView textView2 = findViewById(R.id.textView2);
        EditText editText1 = findViewById(R.id.editTest1);
        textView2.setText(editText1.getText().toString());
        TextView textView3 = findViewById(R.id.textView3);
        EditText editText2 = findViewById(R.id.editTest2);
        textView3.setText(editText2.getText().toString());

    }
}