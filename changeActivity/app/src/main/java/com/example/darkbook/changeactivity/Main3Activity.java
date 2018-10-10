package com.example.darkbook.changeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private Button a1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        a1 = findViewById(R.id.a1);
        a1.setOnClickListener(myhandler);
    }
    View.OnClickListener myhandler = new View.OnClickListener() {
        public void onClick(View v) {
            setResult(RESULT_OK);
            finish();
        }
    };
}
