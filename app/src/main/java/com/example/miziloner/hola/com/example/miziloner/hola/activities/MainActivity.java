package com.example.miziloner.hola.com.example.miziloner.hola.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.miziloner.hola.R;
import com.example.miziloner.hola.com.example.miziloner.hola.model.Carro;

public class MainActivity extends AppCompatActivity {

    Button pintaBtn;
    TextView textoTv;
    Carro carro1;
    Carro carro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mi_home);// se va mostrar el layaout con nombre R.layout.xxxxx

        /**Aki enlazamos desde XML a Java para asiganrles acciones o comportamientos oo eventos**/
        pintaBtn = (Button) findViewById(R.id.pintaBtn);
        textoTv = (TextView) findViewById(R.id.textoTv);
        pintaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoTv.setText("huevolas!");

                creameDosCarros();

                Log.i("MainActivity", "marca:" + carro1.getMarca());
                Log.i("MainActivity", "modelo: "+ carro1.getModelo());

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void creameDosCarros(){

        carro1 = new Carro();
        carro1.setMarca("Ford");
        carro1.setModelo("fiesta");
        carro1.setNumPuertas(4);
        carro1.setPlacas("DVL-5675");

        carro2 = new Carro(4, "Nissan","versa", "LM-123");
    }
}
