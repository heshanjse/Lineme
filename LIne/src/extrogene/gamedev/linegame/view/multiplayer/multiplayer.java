package extrogene.gamedev.linegame.view.multiplayer;

import com.example.line.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class multiplayer extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.multiplayer);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Button play = (Button) findViewById(R.id.play);
		play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent = new Intent(getBaseContext(), listclass.class);
                startActivityForResult(myIntent, 0);
            }
        });
		/*Button notifications = (Button) findViewById(R.id.multiplayer);
		notifications.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent = new Intent(getBaseContext(), listclass.class);
                startActivityForResult(myIntent, 0);
            }
        });
		Button send = (Button) findViewById(R.id.multiplayer);
		send.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent = new Intent(getBaseContext(), listclass.class);
                startActivityForResult(myIntent, 0);
            }
        });
		Button sent = (Button) findViewById(R.id.multiplayer);
		sent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent = new Intent(getBaseContext(), listclass.class);
                startActivityForResult(myIntent, 0);
            }
        });
		Button chat = (Button) findViewById(R.id.multiplayer);
		chat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent = new Intent(getBaseContext(), listclass.class);
                startActivityForResult(myIntent, 0);
            }
        });
		Button market = (Button) findViewById(R.id.multiplayer);
		market.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent = new Intent(getBaseContext(), listclass.class);
                startActivityForResult(myIntent, 0);
            }
        });*/
		return super.onCreateOptionsMenu(menu);
		
	}

}
