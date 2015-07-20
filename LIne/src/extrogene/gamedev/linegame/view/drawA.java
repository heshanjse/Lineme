package extrogene.gamedev.linegame.view;

import com.example.line.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class drawA extends Activity {

	@Override
	protected  void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}
	
	protected void winpopup(){
		Intent myIntent = new Intent(getBaseContext(), win.class);
        startActivityForResult(myIntent, 0);
	}
}
