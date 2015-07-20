package extrogene.gamedev.linegame.view.multiplayer;



import java.util.ArrayList;
import com.example.line.R;
import extrogene.gamedev.linegame.model.player;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

public class onlinepalyers extends Activity {
	ArrayList<player> mylistplayer=new ArrayList<player>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.onile);
		doCreateFakeDate();
		
		ListView listvew=(ListView) findViewById(R.id.listview);
		adapter nb=new adapter(onlinepalyers.this,R.layout.itempalyer,mylistplayer);
		listvew.setAdapter(nb);
		
	}
	private void doCreateFakeDate(){
	
		player p1=new player();
		
		p1.setName("aaaaaaaaaaaaaaa");
		p1.setbirthday("1221312312");
		p1.setflag(R.drawable.heroimg);
		p1.setavtar(R.drawable.hero3);
		
player p2=new player();
		
		p2.setName("bbbbbbbbbbbbbbbb");
		p2.setbirthday("1221312312");
		p2.setflag(R.drawable.heroimg);
		p2.setavtar(R.drawable.hero3);
player p3=new player();
		
		p3.setName("aaaaaaaaaaaaa");
		p3.setbirthday("1221312312");
		p3.setflag(R.drawable.heroimg);
		p3.setavtar(R.drawable.hero3);
		 mylistplayer.add(p1);
		 mylistplayer.add(p2);
		 mylistplayer.add(p3);
		 mylistplayer.add(p1);
		 mylistplayer.add(p2);
		 mylistplayer.add(p3);
		 mylistplayer.add(p1);
		 mylistplayer.add(p2);
		 mylistplayer.add(p2);
		 mylistplayer.add(p3);
		 mylistplayer.add(p1);
		 
		
	}
			
			
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
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

