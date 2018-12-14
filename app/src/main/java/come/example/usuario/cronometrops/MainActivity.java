package come.example.usuario.cronometrops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView texto_ejecutar,texto_pausar,texto_total;
    Button boton_ejecutar,boton_pausar,boton_finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto_ejecutar=findViewById(R.id.ejecucion);
        texto_pausar=findViewById(R.id.pausa);
        texto_total=findViewById(R.id.total);
        boton_ejecutar=findViewById(R.id.boton_ejecutar);
        boton_pausar=findViewById(R.id.boton_pausar);
        boton_finalizar=findViewById(R.id.boton_finalizar);


    }
}
