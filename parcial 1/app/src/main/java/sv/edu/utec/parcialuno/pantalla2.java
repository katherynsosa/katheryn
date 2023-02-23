package sv.edu.utec.parcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity {

    EditText ePeso, tvEstatura;
    TextView ResultadoIMC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        ePeso = findViewById(R.id.tvpeso);
        tvEstatura = findViewById(R.id.tvmetros);
        ResultadoIMC = findViewById(R.id.tvRIMC);

    }

    public void MetodoIMC (View v){
        Double peso, estatura, imc;

        peso = Double.parseDouble(ePeso.getText().toString());
        estatura = Double.parseDouble(tvEstatura.getText().toString());

        imc = (peso) / (estatura * estatura);

        if(estatura > 2.5)
        {
            ResultadoIMC.setText("Ingrese una estatura real");
        }
        else
        {
            if (imc < 10.5 ){
                ResultadoIMC.setText("Críticamente Bajo de Peso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 15.9) {
                ResultadoIMC.setText("Severamente Bajo de Peso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 18.5){
                ResultadoIMC.setText("Bajo de Peso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 25){
                ResultadoIMC.setText("Normal (peso saludable). Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 30){
                ResultadoIMC.setText("Sobrepeso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 35){
                ResultadoIMC.setText("Obesidad Clase 1 - Moderadamente Obeso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 40){
                ResultadoIMC.setText("Obesidad Clase 2 - Severamente Obeso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc > 50){
                ResultadoIMC.setText("Obesidad Clase 3 - Críticamente Obeso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }

            ePeso.setText("");
            tvEstatura.setText("");
        }



    }
}