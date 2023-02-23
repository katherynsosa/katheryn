package sv.edu.utec.parcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tvuser, tvpassword;
    TextView tvmensaj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvuser = findViewById(R.id.tvuser);
        tvpassword = findViewById(R.id.tvpassword);
        tvmensaj = findViewById(R.id.tvmensaj);
    }


    public void Login (View v){
        String Us, Pass;
        Us = tvuser.getText().toString();
        Pass = tvpassword.getText().toString();


        Us = tvuser.getText().toString();
        Pass = tvpassword.getText().toString();

        if (Us.equals("parcialETps1") && Pass.equals("p4rC14l#tp$"))
        {
            startActivity(new Intent(MainActivity.this, pantalla2.class));
        }
        else
        {
            tvmensaj.setText("Contraseña y/o usuario no son correctos");
        }
    }
}