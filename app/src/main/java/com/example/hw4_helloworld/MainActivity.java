//Qishu Zhang
//522004100
//hw 4, part 1

package com.example.hw4_helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonclick(View view) {
        TextView textview = findViewById(R.id.textView);
        EditText edittext = findViewById(R.id.editText);
        String mystring;
        mystring = edittext.getText().toString();
        edittext.getText().clear();
        textview.setText(mystring);

    }
}
