package com.example.passcodeassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button unlockBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unlockBtn = (Button) findViewById(R.id.unlockBtn);
        textView = (TextView)findViewById(R.id.welcomeText);

        //boolean locked = true;


       // if (locked) {
            textView.setText("Welcome to the App! The App is LOCKED!");
       // }

        Bundle resultIntent = getIntent().getExtras();


        if(resultIntent != null)
        {

            String pc = resultIntent.getString("code");
            if (pc.equals("1234")) {
            textView.setText("The App is Unlocked.");

            }
        }

      //  else {
           // textView.setText("The App is Unlocked.");
      //  }



        final Intent intent = new Intent(this, PasscodeScreen.class);

        unlockBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // String passcode = editPasscode.getText().toString();
                startActivity(intent);

            }
        });





        }


}
