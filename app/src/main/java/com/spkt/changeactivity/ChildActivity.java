package com.spkt.changeactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChildActivity extends AppCompatActivity {

    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.childactivity);

        anhXa();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChildActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void anhXa() {
        btnSignUp = (Button) findViewById(R.id.btnOpenChildActivity);
    }
}