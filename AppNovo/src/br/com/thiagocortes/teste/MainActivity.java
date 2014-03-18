package br.com.thiagocortes.teste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);       
    }
    public void enviarTexto(View v){
    	EditText texto = (EditText) findViewById(R.id.et_1);
    	String novo = texto.getText().toString();
    	Intent intent = new Intent(this,NovaActivity.class);
    	intent.putExtra("999",novo);
    	startActivity(intent);
    	/*Intent intent = new Intent(this,NovaActivity.class);
    	intent.putExtra("chave","valor");
    	startActivity(intent);*/
    }
}
