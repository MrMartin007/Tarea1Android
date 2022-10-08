package com.example.tarea1androiddisweb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.tarea1androiddisweb.Utiles.Assets;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Connection connection = new Connection(this, Assets.DB_NAME, null, Assets.DB_VERSION);
    }


    public void onClick(View view){

        Intent intent = null;

        switch (view.getId()){
            case R.id.btnRegistrar:
                intent = new Intent(this, RegistrarProducto.class);
                break;
            case R.id.btnListaProducto:
                intent = new Intent(this, ListaProducto.class);
                break;
        }
        if (intent!=null){
            startActivity(intent);
        }
    }
}
