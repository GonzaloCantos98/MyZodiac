package es.studium.myzodiac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dia = datePicker.getDayOfMonth();
                int mes = datePicker.getMonth() + 1; // El mes empieza desde cero
                int ano = datePicker.getYear();

                // Pasamos a la segunda actividad
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Dia", dia);
                intent.putExtra("Mes", mes);
                intent.putExtra("Año", ano);
                startActivity(intent);
            }
        });
    }
}
