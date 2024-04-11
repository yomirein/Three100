package com.rainwon.three100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // поля
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // привязка разметки к полям
        output = findViewById(R.id.output);

        // считывание данных из намерения (приведшего в данную активность)
        Bundle bundle = getIntent().getExtras(); // упаковка всех данных намерения в контейнер Bundle
        int outputSum = bundle.getInt("sum"); // считывание стоимости комплекта

        // вывод данных на экран смартфона
        output.setText("Стоимость комплекта: " + outputSum + " условных единиц");
    }
}