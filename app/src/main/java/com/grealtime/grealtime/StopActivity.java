package com.grealtime.grealtime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);
        Intent smsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:57555"));
        smsIntent.putExtra("sms_body", "2674");
        startActivity(smsIntent);
    }
}
