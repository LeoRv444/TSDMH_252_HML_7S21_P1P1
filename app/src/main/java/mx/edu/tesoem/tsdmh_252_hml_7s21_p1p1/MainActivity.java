package mx.edu.tesoem.tsdmh_252_hml_7s21_p1p1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText txtn1, txtn2;

    Button btnsuma, btnresta, btndivicion, btnmulti, btnpote, btnn, btnraiz;

    TextView lblres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtn1 = findViewById(R.id.txtn1);
        txtn2 = findViewById(R.id.txtn2);
        lblres = findViewById(R.id.lblres);

        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btndivicion = findViewById(R.id.btndivicion);
        btnmulti = findViewById(R.id.btnmulti);
        btnpote = findViewById(R.id.btnpot);
        btnn = findViewById(R.id.btnn);
        btnraiz = findViewById(R.id.btnraiz);

    }


    public void oclicksuma (View v){

        int num1, num2;
        num1 = Integer.parseInt(txtn1.getText().toString());
        num2 = Integer.parseInt(txtn2.getText().toString());
        String cadena = "el resultado de la suma es "+String.valueOf(num1+num2);
        lblres.setText(cadena);

    }


    public void oclickresta (View v){

        int num1, num2;
        num1 = Integer.parseInt(txtn1.getText().toString());
        num2 = Integer.parseInt(txtn2.getText().toString());
        String cadena = "el resultado de la resta es "+String.valueOf(num1-num2);
        lblres.setText(cadena);

    }


    public void oclickdivicion (View v){

        int num1, num2;
        num1 = Integer.parseInt(txtn1.getText().toString());
        num2 = Integer.parseInt(txtn2.getText().toString());
        String cadena = "el resultado de la divicion es "+String.valueOf(num1/num2);
        lblres.setText(cadena);

    }

    public void oclickmulti (View v){

        int num1, num2;
        num1 = Integer.parseInt(txtn1.getText().toString());
        num2 = Integer.parseInt(txtn2.getText().toString());
        String cadena = "el resultado de la multiplicacion es "+String.valueOf(num1*num2);
        lblres.setText(cadena);

    }

    public void oclickpote (View v){

        int num1, num2;
        num1 = Integer.parseInt(txtn1.getText().toString());
        num2 = Integer.parseInt(txtn2.getText().toString());
        String cadena = "La potencia del primer numero es: "+String.valueOf(num1*num1)+ " La potencia del segundo numero es: "+ String.valueOf(num2*num2);
        lblres.setText(cadena);

    }

    public void oclickn (View v){

        int num1, num2;
        num1 = Integer.parseInt(txtn1.getText().toString());
        num2 = Integer.parseInt(txtn2.getText().toString());

        long res = 1;

        for (int i=0; i < num2; i++ ){

            res *= num1;

        }

        String cadena = "el resultado del numero "+num1+ " Usando como exponente " +num2+ " es: " +res;
        lblres.setText(cadena);

    }


    public void onclickraiz (View v){

        int num1, num2;

        num1 = Integer.parseInt(txtn1.getText().toString());
        num2 = Integer.parseInt(txtn2.getText().toString());

        double aprox = num1 / 2.0;
        double aprox2 = num2 / 2.0;

        for (int i = 0; i < 20; i++){

            aprox = (aprox + num1 / aprox) / 2;
            aprox2 = (aprox2 + num2 / aprox2) / 2;

            String cadena = "El resultado de la raiz es: " +aprox+ " para el primer numero y para el segundo numero es: " +aprox2;
            lblres.setText(cadena);


        }



    }


}

