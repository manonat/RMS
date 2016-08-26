package com.virtualsiamu.rms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ServiceActivity extends AppCompatActivity {
    //explict
    private String userIDString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        //ส่งค่าuserpassไปด้วย
        userIDString = getIntent().getStringExtra("UserID");


    }//main method

    public void clickUpdateResource(View view) {

        Intent intent = new Intent(ServiceActivity.this, UpdateResource.class);
        intent.putExtra("UserID", userIDString);
        startActivity(intent);


    }
    public void clicCheckResource(View view) {

        Intent intent = new Intent(ServiceActivity.this, CheckResource.class);
        intent.putExtra("UserID", userIDString);
        startActivity(intent);


    }


}//mainclass


