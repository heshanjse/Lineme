package extrogene.gamedev.linegame.view.multiplayer;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;





public class listclass extends ListActivity {

	String className[]={"heshan","malitha","nipun","kasun","thisun","ishara"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, className));
	}
	protected void onListItemClick(ListView lv,View v,int position,long id) {
		super.onListItemClick(lv, v, position, id);
		//String openClass = className[position];
		try{
		//	Class selected =Class.forName("com.example.web3."+openClass);
			Intent selectedIntent = new Intent(this,User.class);
			startActivity(selectedIntent);
		//	Intent myIntent = new Intent(view.getContext(), help.class);
            startActivityForResult(selectedIntent, 0);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		finish();
	}
}
