package com.example.passcodeassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PasscodeScreen extends AppCompatActivity {
Button btn1, btn2, btn3, btn4;
TextView passcode;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passcode_screen);

        passcode = findViewById(R.id.passcode);
        passcode.setText("");

        final Intent returnToMain = new Intent(this, MainActivity.class);



        btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {


                public void onClick(View v) {

                    passcode.setText(passcode.getText()+"1");
                }
                                });

        btn2 = findViewById(R.id.button2);
            btn2.setOnClickListener(new View.OnClickListener() {


                public void onClick(View v) {

                    passcode.setText(passcode.getText()+"2");
                }
            });



        btn3 = findViewById(R.id.button3);
            btn3.setOnClickListener(new View.OnClickListener() {


                public void onClick(View v) {

                    passcode.setText(passcode.getText()+"3");
                }
            });



        btn4 = findViewById(R.id.button4);
           btn4.setOnClickListener(new View.OnClickListener() {


               public void onClick(View v) {

                   passcode.setText(passcode.getText()+"4");
               }
           });



        Button submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                    returnToMain.putExtra("code", passcode.getText());

                    startActivity(returnToMain);

            }

        });

    }
}
