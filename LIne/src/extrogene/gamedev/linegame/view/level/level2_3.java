package extrogene.gamedev.linegame.view.level;

import java.util.HashMap;

import com.example.line.R;

import extrogene.gamedev.linegame.view.draw.Givedots;
import extrogene.gamedev.linegame.view.draw.LindrawView;
import extrogene.gamedev.linegame.view.draw.enLine;
import extrogene.gamedev.linegame.view.multiplayer.challenge;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class level2_3 extends Activity{
	LindrawView  drawview;
	 challenge dc;
	 int dots = 16;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.level2);

			Button play = (Button) findViewById(R.id.buttonnext);
			play.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	            //   Intent myIntent = new Intent(view.getContext(), MainActivity.class);
	          //      startActivityForResult(myIntent, 0);
	            }
	        });
			
			Button play1 = (Button) findViewById(R.id.nextlevel);
			play1.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 3));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play2 = (Button) findViewById(R.id.level2_1);
			play2.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play3 = (Button) findViewById(R.id.level3_1);
			play3.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play4 = (Button) findViewById(R.id.level1_2);
			play4.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play5 = (Button) findViewById(R.id.level2_3);
			play5.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
		
			Button play6 = (Button) findViewById(R.id.level3_2);
			play6.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play7 = (Button) findViewById(R.id.level3_3);
			play7.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play8 = (Button) findViewById(R.id.button8);
			play8.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play9 = (Button) findViewById(R.id.button9);
			play9.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play10 = (Button) findViewById(R.id.button10);
			play10.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play11 = (Button) findViewById(R.id.button11);
			play11.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play12 = (Button) findViewById(R.id.button12);
			play12.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play13 = (Button) findViewById(R.id.button13);
			play13.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play14 = (Button) findViewById(R.id.button14);
			play14.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
			Button play15 = (Button) findViewById(R.id.button15);
			play15.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
						{
							put(enLine.L1_2, Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L5_6, Givedots.setall(5, 6, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
						}
					};

					drawview = new LindrawView(level2_3.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			
		}

		
}
