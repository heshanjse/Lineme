package extrogene.gamedev.linegame.view;

import com.example.line.R;

import extrogene.gamedev.linegame.view.draw.LindrawView;
import extrogene.gamedev.linegame.view.level.level1_1;
import extrogene.gamedev.linegame.view.level.level2_1;
import extrogene.gamedev.linegame.view.level.level3_1;
import extrogene.gamedev.linegame.view.level.levels;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class win extends Activity {
	LindrawView drawview;
	int dots;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Bundle values = getIntent().getExtras();
		if (values != null) {
		    dots = values.getInt("dots");
		}
		setContentView(R.layout.win);
		Button level = (Button) findViewById(R.id.nextlevel);
        level.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	if(dots==9){
            		Intent myIntent = new Intent(view.getContext(), level1_1.class);
	                startActivityForResult(myIntent, 0);
            	}else if(dots==16){
            		Intent myIntent = new Intent(view.getContext(), level2_1.class);
	                startActivityForResult(myIntent, 0);
            	}else if(dots==25){
            		Intent myIntent = new Intent(view.getContext(), level3_1.class);
	                startActivityForResult(myIntent, 0);
            	}
            	
            }
        });
        
        Button about = (Button) findViewById(R.id.dailywin);
        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent = new Intent(view.getContext(), Main.class);
                startActivityForResult(myIntent, 0);
            }
        });
	}
	

}
