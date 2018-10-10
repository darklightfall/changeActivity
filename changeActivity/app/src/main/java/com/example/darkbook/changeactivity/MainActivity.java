package com.example.darkbook.changeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        private Button search;
        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search = findViewById(R.id.buttonSearch);
        search.setOnClickListener(myhandler);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        Bundle mybundle = new Bundle();
        EditText editText = findViewById(R.id.editText);
        mybundle.putString("searchText",editText.getText().toString());
        intent.putExtras(mybundle);
        startActivityForResult(intent,69);
    }

    View.OnClickListener myhandler = new View.OnClickListener() {
        public void onClick(View v) {
            sendMessage(v);
        }
    };


}
