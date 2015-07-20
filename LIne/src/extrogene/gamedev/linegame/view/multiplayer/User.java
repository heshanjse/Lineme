package extrogene.gamedev.linegame.view.multiplayer;



import com.example.line.R;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class User extends Activity{
	challenge dc;
	static int dots = 9;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.user);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Button help = (Button) findViewById(R.id.button_challenge);
        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	dc = new challenge(User.this, null, dots);
				dc.setText("Draw your challenge");
				setContentView(dc);
            }
        });
        Button about = (Button) findViewById(R.id.level2_1);
        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent = new Intent(view.getContext(), listclass.class);
                startActivityForResult(myIntent, 0);
            }
        });
		return super.onCreateOptionsMenu(menu);
	}
}
