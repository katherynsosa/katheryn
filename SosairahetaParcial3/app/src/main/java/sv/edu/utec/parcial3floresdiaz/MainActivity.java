package sv.edu.utec.parcial3floresdiaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;

public class MainActivity extends AppCompatActivity {
    EditText Nombre,Apellido,Telefono,Correo,edtcod;
    Button Insertar,Editar,Eliminar,Buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtcod = findViewById(R.id.edtcod);
        Nombre = findViewById(R.id.edtname);
        Apellido = findViewById(R.id.edtApellido);
        Telefono = findViewById(R.id.edtTelefono);
        Correo = findViewById(R.id.edtCorreo);

        Insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getApplicationContext(), "contactos", null,1);
                //AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getApplicationContext(), "contactos",null,1);
                SQLiteDatabase db = admin.getWritableDatabase();
                String etcod =edtcod.getText().toString();
                String nomb =Nombre.getText().toString();
                String ape =Apellido.getText().toString();
                String tel =Telefono.getText().toString();
                String corre =Correo.getText().toString();

                ContentValues informacion  = new ContentValues();
                informacion.put("codcontactos",etcod);
                informacion.put("nombre",nomb);
                informacion.put("apellido",ape);
                informacion.put("Telefono",tel);
                informacion.put("Correo",corre);
                db.insert("contactos",null,informacion);
                db.close();
            }
        });
    }
}