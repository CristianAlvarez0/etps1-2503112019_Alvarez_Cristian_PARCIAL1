package sv.edu.utec.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PantallaPrincipal extends AppCompatActivity {

    Button btnCal;
    EditText etAltura;
    EditText etPeso;
    TextView tvRes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);
        btnCal = findViewById(R.id.btnCalcular);
        etAltura = findViewById(R.id.edtAltura);
        etPeso = findViewById(R.id.edtPeso);
        tvRes = findViewById(R.id.edtResultado);

    }


    public void CalcularIMC(View view){
        double altura = 0;
        double peso = 0;
        double IMC = 0;

        altura = Double.parseDouble(etAltura.getText().toString());
        peso = Double.parseDouble(etPeso.getText().toString());
        IMC = (peso)/(altura*altura);



        if(IMC < 10.5){
            tvRes.setText("Críticamente Bajo de Peso ");
        }else if(IMC < 15.9){
            tvRes.setText("Severamente Bajo de Peso");
        } else if (IMC < 18.5) {
            tvRes.setText("Bajo de Peso");
        } else if (IMC < 25) {
            tvRes.setText("Normal (peso saludable)");
        } else if (IMC < 30) {
            tvRes.setText("Sobrepeso");
        } else if (IMC < 35) {
            tvRes.setText("Obesidad Clase 1 - Moderadamente Obeso");
        } else if (IMC < 40) {
            tvRes.setText("Obesidad Clase 2 - Severamente Obeso");
        }else if(IMC > 50) {
            tvRes.setText("Obesidad Clase 3 - Críticamente Obeso");
        }else {
            tvRes.setText("DATO ERRONEO");
        }


    }

}