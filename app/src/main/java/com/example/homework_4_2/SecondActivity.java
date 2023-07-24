package com.example.homework_4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    
    private TextView infoTicket;
    
    private Ticket ticket;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        
        infoTicket = findViewById(R.id.infoTicket);

        Bundle bundleTicket = getIntent().getExtras();
        
        if (bundleTicket != null) {
            
            ticket = (Ticket) bundleTicket.getSerializable(Ticket.class.getSimpleName());
            
            infoTicket.setText(ticket.toString());
        }
    }
}