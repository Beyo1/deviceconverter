package com.example.mycurrency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1, sp2;
    Button bt1;
    EditText edt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.input);
        sp1 = findViewById(R.id.spde);
        sp2 = findViewById(R.id.spen);
        bt1 = findViewById(R.id.convert);

        String[] from = {"USD", "FCFA","EUR"};
        ArrayAdapter ad = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"FCFA", "EUR", "USD"};
        ArrayAdapter ad1 = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tot;
                double amount = Double.parseDouble(edt1.getText().toString());

                if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "FCFA"){
                    tot = amount * 577.42;
                    Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
                }

                else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "EUR"){
                    tot = amount * 0.88;
                    Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
                }

                else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "USD"){
                    tot = amount;
                    Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
                }

                else if (sp1.getSelectedItem().toString() == "FCFA" && sp2.getSelectedItem().toString() == "EUR"){
                    tot = amount / 656.00;
                    Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
                }

                else if (sp1.getSelectedItem().toString() == "FCFA" && sp2.getSelectedItem().toString() == "USD"){
                    tot = amount / 577.42;
                    Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
                }

                else if (sp1.getSelectedItem().toString() == "FCFA" && sp2.getSelectedItem().toString() == "FCFA"){
                    tot = amount;
                    Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
                }

                else if (sp1.getSelectedItem().toString() == "EUR" && sp2.getSelectedItem().toString() == "EUR"){
                    tot = amount;
                    Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
                }

                else if (sp1.getSelectedItem().toString() == "EUR" && sp2.getSelectedItem().toString() == "FCFA"){
                    tot = amount * 656.00;
                    Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
                }

                else if (sp1.getSelectedItem().toString() == "EUR" && sp2.getSelectedItem().toString() == "USD"){
                    tot = amount * 1.14;
                    Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}