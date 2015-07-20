package extrogene.gamedev.linegame.view.dailychallenge;

import com.example.line.R;

import extrogene.gamedev.linegame.view.about;
import extrogene.gamedev.linegame.view.level.levels;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class windaily extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dailywin);
		Button about = (Button) findViewById(R.id.dailywin);
        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent = new Intent(view.getContext(), levels.class);
                startActivityForResult(myIntent, 0);
            }
        });
	}
	
	
}
