package com.example.darkbook.changeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private Button quit;
    private Button a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        quit = findViewById(R.id.quit);
        a3 = findViewById(R.id.a3);
        a3.setOnClickListener(myhandler2);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getExtras();
        String message = bundleExtra.getString("searchText");


        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
        quit.setOnClickListener(myhandler);


    }

    View.OnClickListener myhandler = new View.OnClickListener() {
        public void onClick(View v) {
            finish();
        }
    };
    View.OnClickListener myhandler2 = new View.OnClickListener() {
        public void onClick(View v) {
           openA3(v);
        }
    };

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == 3) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                finish();
            }
        }

    }
    public void openA3(View view) {
        Intent intent2 = new Intent(this, Main3Activity.class);
        Bundle mybundle = new Bundle();
        startActivityForResult(intent2,3);
    }
}
