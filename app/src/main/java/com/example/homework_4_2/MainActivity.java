package com.example.homework_4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idIn, departurePointIn, departureDateIn, arrivalPointIn, arrivalDateIn;
    private TextView costTicketIn;
    private Button button;

    private int id;
    private float cost = 100.25F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idIn = findViewById(R.id.idIn);
        departurePointIn = findViewById(R.id.departurePointIn);
        departureDateIn = findViewById(R.id.departureDateIn);
        arrivalPointIn = findViewById(R.id.arrivalPointIn);
        arrivalDateIn = findViewById(R.id.arrivalDateIn);
        costTicketIn = findViewById(R.id.costTicketIn);
        button = findViewById(R.id.button);

        costTicketIn.setText("стоимость билета " + cost + " монет");

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = view -> {

        id = Integer.parseInt(idIn.getText().toString());

        Ticket ticket = new Ticket(id,
                departurePointIn.getText().toString(), departureDateIn.getText().toString(),
                arrivalPointIn.getText().toString(), arrivalDateIn.getText().toString(),
                cost);

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra(Ticket.class.getSimpleName(), String.valueOf(ticket));
        startActivity(intent);
    };
}