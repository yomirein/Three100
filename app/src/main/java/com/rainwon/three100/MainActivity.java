package com.rainwon.three100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // поля
    private Button button;
    private EditText editEngine, editTransmission, editBody; // поля вводных данных

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // привязка разметки к полям
        button = findViewById(R.id.button);
        editEngine = findViewById(R.id.editEngine);
        editTransmission = findViewById(R.id.editTransmission);
        editBody = findViewById(R.id.editBody);
        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }
    // слушатель нажатия кнопки
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // считывание данных
            int engine = Integer.parseInt(editEngine.getText().toString());
            int transmission = Integer.parseInt(editTransmission.getText().toString());
            int body = Integer.parseInt(editBody.getText().toString());
            // подсчёт стоимости комплекта
            int sum = engine + transmission + body;
            // создание намерения
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            // упаковка в намерение простых данных
            intent.putExtra("sum", sum);
            // запуск намерения
            startActivity(intent);
        }
    };
}