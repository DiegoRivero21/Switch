package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button.setEnabled(false);
        SwitchCompat switchCompat = (SwitchCompat)findViewById(R.id.switchejemplo);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    button.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Activado", Toast.LENGTH_SHORT).show();
                } else {
                    button.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Desactivado", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}