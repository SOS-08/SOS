package com.example.sos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

public class EmergencyInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_information);

        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"red\">" + getString(R.string.emergency_info)));
    }
}