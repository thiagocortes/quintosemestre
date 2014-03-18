package br.com.thiagocortes.teste;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;


public class NovaActivity extends Activity{
	
	private TextView text;
	
	public void onCreate(Bundle savedInstaceState){
		super.onCreate(savedInstaceState);
        setContentView(R.layout.nova_activity);		
        Bundle extras = getIntent().getExtras();
        
        text = (EditText) findViewById(R.id.editText1);
        text.setText(extras.getString("999"));
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.menu,menu);
		return true;
	}
	public void salvar(){
		Intent dados = new Intent();
		dados.putExtra("name", text.getText().toString());
		setResult(RESULT_OK,dados);
		finish();
	}
}
