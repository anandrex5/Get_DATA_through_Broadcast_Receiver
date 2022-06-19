package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view
        ImageView imageView = findViewById(R.id.image1);

        //if you want text then uncomment it.
        ///TextView textView = findViewById(R.id.text3);

        //We can pass the data through the Intent

        //get data through intent
        Intent intent = getIntent();
        //receive and get Action
        String action = intent.getAction();
        //type of action
        String type = intent.getAction();


        //Now we check the condition the data && check the data is present or not.


        if (Intent.ACTION_SEND.equals(action) && type != null) ;

        {
            //To get image we Use EXTRA_STREAM if we want to get Text we put EXTRA_TEXT
            imageView.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM));


            ///if you want text then commment the above line imageView

            // textView.setText(intent.getParcelableExtra(intent.EXTRA_TEXT));
        }

    }
}