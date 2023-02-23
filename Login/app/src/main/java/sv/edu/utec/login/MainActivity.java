package sv.edu.utec.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Button btLogin;
EditText etUsu;
EditText etPass;
TextView tvMens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btLogin = findViewById(R.id.btnLogin);
        etUsu = findViewById(R.id.edtUsuario);
        etPass = findViewById(R.id.edtPass);
        tvMens = findViewById(R.id.txvMensaje);

    }
   public void LOGIN(View view) {

        String usuario = "parcialETps1";
        String pass = "p4rC14l#tp$";
        usuario = etUsu.getText().toString();
        pass = etPass.getText().toString();

        if (usuario.equals("parcialETps1") && pass.equals("p4rC14l#tp$")) {
            btLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent entrar = new Intent(getApplicationContext(), PantallaPrincipal.class);
                    startActivity(entrar);
                }
            });
        } else {
            tvMens.setText("¡Contraseña y/o usuario no son correctos!");
        }

    }
}