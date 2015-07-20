package extrogene.gamedev.linegame.view.level;

import java.util.HashMap;

import com.example.line.R;
import extrogene.gamedev.linegame.view.draw.Givedots;
import extrogene.gamedev.linegame.view.draw.LindrawView;
import extrogene.gamedev.linegame.view.draw.enLine;
import extrogene.gamedev.linegame.view.multiplayer.challenge;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class levels extends Activity {
	LindrawView drawview;
	static int dots = 9;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.levels);
		 final Button leval1=(Button)findViewById(R.id.nextlevel);
	        final Button leval2=(Button)findViewById(R.id.level1_2);
	        final Button leval3=(Button)findViewById(R.id.level1_3);
	        final Button leval4=(Button)findViewById(R.id.level2_1);
	        final Button leval5=(Button)findViewById(R.id.level2_2);
	        final Button leval6=(Button)findViewById(R.id.level2_3);
	        final Button leval7=(Button)findViewById(R.id.level3_1);
	        final Button leval8=(Button)findViewById(R.id.level3_2);
	        final Button leval9=(Button)findViewById(R.id.level3_3);
	      
	        final Button dalybtn=(Button)findViewById(R.id.dalychallenge);
	        TextView dalychalemge = (TextView) findViewById(R.id.TextView08);
	        
	        final Animation bound=AnimationUtils.loadAnimation(levels.this, R.anim.bouns);
	        final Animation zoon1=AnimationUtils.loadAnimation(levels.this, R.anim.zoon);
	        final Animation zoon2=AnimationUtils.loadAnimation(levels.this, R.anim.zoon);
	        final Animation zoon3=AnimationUtils.loadAnimation(levels.this, R.anim.zoon);
	        final Animation zoon4=AnimationUtils.loadAnimation(levels.this, R.anim.zoon);
	        final Animation zoon5=AnimationUtils.loadAnimation(levels.this, R.anim.zoon);
	        final Animation zoon6=AnimationUtils.loadAnimation(levels.this, R.anim.zoon);
	        final Animation zoon7=AnimationUtils.loadAnimation(levels.this, R.anim.zoon);
	        final Animation zoon8=AnimationUtils.loadAnimation(levels.this, R.anim.zoon);
	        final Animation zoon9=AnimationUtils.loadAnimation(levels.this, R.anim.zoon);
	        final Animation daly=AnimationUtils.loadAnimation(levels.this, R.anim.rotate);
	        final Animation blik=AnimationUtils.loadAnimation(levels.this, R.anim.blink);
	        dalybtn.startAnimation(blik);
	       // dalychalemge.startAnimation();
	        leval1.startAnimation(daly); 
	        leval2.startAnimation(daly); 
	        leval3.startAnimation(daly); 
	        leval4.startAnimation(daly); 
	        leval5.startAnimation(daly); 
	        leval6.startAnimation(daly); 
	        leval7.startAnimation(daly); 
	        leval8.startAnimation(daly); 
	        leval9.startAnimation(daly); 
	       
	        leval1.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){

	        		leval1.startAnimation(zoon1);  
	        		
	                    Intent myIntent = new Intent(arg0.getContext(), level1_1.class);
	                    startActivityForResult(myIntent, 0);
	                
	        		}});
	        leval2.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){

	        		leval2.startAnimation(zoon2);
	        		 Intent myIntent = new Intent(arg0.getContext(), level1_2.class);
	                 startActivityForResult(myIntent, 0);
	        		}});
	        leval3.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){

	        		leval3.startAnimation(zoon3);
	        		 Intent myIntent = new Intent(arg0.getContext(), level1_3.class);
	                 startActivityForResult(myIntent, 0);
	        		}});
	        leval4.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){

	        		leval4.startAnimation(zoon4);
	        		Intent myIntent = new Intent(arg0.getContext(), level2_1.class);
	                startActivityForResult(myIntent, 0);
	        		}});
	        leval5.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){

	        		leval5.startAnimation(zoon5);
	        		Intent myIntent = new Intent(arg0.getContext(), level2_2.class);
	                startActivityForResult(myIntent, 0);
	        		}});
	        leval6.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){

	        		leval6.startAnimation(zoon6);
	        		Intent myIntent = new Intent(arg0.getContext(), level2_3.class);
	                startActivityForResult(myIntent, 0);
	        		}});
	        leval7.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){

	        		leval7.startAnimation(zoon7);
	        		Intent myIntent = new Intent(arg0.getContext(), level3_1.class);
	                startActivityForResult(myIntent, 0);
	        		}});
	        leval8.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){

	        		leval8.startAnimation(zoon8);
	        		Intent myIntent = new Intent(arg0.getContext(), level3_2.class);
	                startActivityForResult(myIntent, 0);
	        		}});
	        leval9.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){

	        		leval9.startAnimation(zoon9);
	        		Intent myIntent = new Intent(arg0.getContext(), level3_3.class);
	                startActivityForResult(myIntent, 0);
	        		}});
	        
	        dalybtn.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){

	        		dalybtn.startAnimation(zoon9);
	        		HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L7_8, Givedots.setall(7, 8, 1));
							put(enLine.L8_9,Givedots.setall(8, 9, 1));
							put(enLine.L3_6, Givedots.setall(3, 6, 1));
							put(enLine.L5_8, Givedots.setall(5, 8, 1));
							put(enLine.L6_9,Givedots.setall(6, 9, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
							put(enLine.L4_8, Givedots.setall(4, 8, 1));
							put(enLine.L2_4, Givedots.setall(2, 4, 1));
							put(enLine.L3_5,Givedots.setall(3, 5, 1));
							put(enLine.L5_7, Givedots.setall(5, 7, 1));
						}
					};

					drawview = new LindrawView(levels.this, null, dots, Linemap,0);
					setContentView(drawview);
				}
	        		});
	        
	}

}
