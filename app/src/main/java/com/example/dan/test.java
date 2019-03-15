package com.example.dan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class test extends AppCompatActivity {

    private Button b;
    private String s;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = new Button(this);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awesomeButtonClicked(s);
            }
        });
    }

    private void awesomeButtonClicked(String s) {

        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }
}