package com.example.assignmentlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView texts;
    String toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear
        );

        EditText txt =  (EditText) findViewById(R.id.editText);

        texts = (TextView)findViewById(R.id.textView1);
        toast = getResources().getString(R.string.Toast_M);

        Button pMe = findViewById(R.id.PressMe);

        CheckBox cb = (CheckBox)findViewById(R.id.checkBox);


        pMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String edTexts = txt.getText().toString();

                texts.setText(edTexts);

                Toast.makeText(MainActivity.this, toast, Toast.LENGTH_LONG).show();
            }
        });

        cb.setOnCheckedChangeListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cb.setChecked(true);
                cb.setOnCheckedChangeListener( (cb, isChecked) -> {});
                cb.onCheckChanged(CompoundButton cb, boolean b) {
                    Snackbar.make(v, "Checkboc is" +  b, Snackbar.LENGTH_LONG).show();
                    Snackbar.setAction( "undo", click ->cb.setChecked(!b));
            }}
        });


    }


}






