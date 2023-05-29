package com.example.pruebaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> opciones;
    private String aux;
    private Spinner spinner;
    private TextView textView;

    private Button btn;
  //  private Repos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opciones = new ArrayList<>();

        textView = findViewById(R.id.textView);
        textView.setText("1");
        btn = findViewById(R.id.button2);

        opciones.add("suma");
        opciones.add("resta");



        spinner = findViewById(R.id.spi);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opciones);
        spinner.setAdapter(adaptador);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = textView.getText().toString();
                int b = Integer.parseInt(a);
                if (spinner.getSelectedItem().toString().equals("suma")) {
                   b=suma(b);
                   textView.setText(b+"");
                }else {
                   b= resta(b);
                    textView.setText(b+"");

                }
            }
        });



    }


    public int suma ( int i){
        i++;
        return i;
    }

    public int resta ( int i){
        i--;
        return i;
    }

}