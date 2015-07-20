package extrogene.gamedev.linegame.view;

import com.example.line.R;
import com.example.line.R.id;
import com.example.line.R.layout;
import com.example.line.R.menu;

import extrogene.gamedev.linegame.view.level.levels;
import extrogene.gamedev.linegame.view.multiplayer.listclass;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main); 
		// this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		    //Remove notification bar
		 //   this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		   //set content view AFTER ABOVE sequence (to avoid crash)
		   // this.setContentView(R.layout.main); 
		
		final Button Singal=(Button)findViewById(R.id.singalplayer);
        final Button multy=(Button)findViewById(R.id.multiplayer);
        final Button setting=(Button)findViewById(R.id.setting);
        final Button about=(Button)findViewById(R.id.about);
        final Button help=(Button)findViewById(R.id.help);
        final Button frofile=(Button)findViewById(R.id.profile);
        
 
        Singal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), levels.class);
                startActivityForResult(myIntent, 0);
            }
        });

		multy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent = new Intent(getBaseContext(), listclass.class);
                startActivityForResult(myIntent, 0);
            }
        });
	
	        about.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	            	Intent myIntent = new Intent(view.getContext(), about.class);
	                startActivityForResult(myIntent, 0);
	            }
	        });
		
      
        		Animation b1=AnimationUtils.loadAnimation(Main.this, R.anim.animation);
        		Animation b2=AnimationUtils.loadAnimation(Main.this, R.anim.animation2);
        		Animation b3=AnimationUtils.loadAnimation(Main.this, R.anim.animation3);
        		Animation b4=AnimationUtils.loadAnimation(Main.this, R.anim.animation4);
        		final Animation bound=AnimationUtils.loadAnimation(Main.this, R.anim.bouns);
        		final Animation b22=AnimationUtils.loadAnimation(Main.this, R.anim.bnn);
        		
        		Singal.startAnimation(b1);
        		multy.startAnimation(b1);
        		setting.startAnimation(b4);
        		about.startAnimation(b1);
        		frofile.startAnimation(b4);
        		help.startAnimation(b1);
        		
        		help.setOnClickListener(new OnClickListener(){
        		        	public void onClick(View arg0){
        		
        		        		Singal.startAnimation(bound);
        		        		about.startAnimation(b22);
        	}
        	
        });
        		 about.setOnClickListener(new OnClickListener(){
 		        	public void onClick(View arg1){
 		
 		        		about.startAnimation(bound);
 		        		Singal.startAnimation(b22);
 	}
 	
 });
	}

	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
