package extrogene.gamedev.linegame.view.multiplayer;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.example.line.R;

import extrogene.gamedev.linegame.view.Main;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class send extends Activity {
	challenge dc;
	static int dots = 9;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sendlayout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Button help = (Button) findViewById(R.id.button_send);
		help.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				
				ObjectMapper mapper = new ObjectMapper();
				try {
					String json=mapper.writeValueAsString(challenge.enLineMap_defaultchallange);
					Log.d("value_json", json);
				} catch (JsonGenerationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			//	Intent myIntent = new Intent(getBaseContext(), Main.class);
            //    startActivityForResult(myIntent, 0);
			}
		});
		Button about = (Button) findViewById(R.id.button_retry);
		about.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

			}
		});
		return super.onCreateOptionsMenu(menu);
	}
}
