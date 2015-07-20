package extrogene.gamedev.linegame.view.level;

import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.line.R;

import extrogene.gamedev.linegame.view.draw.Givedots;
import extrogene.gamedev.linegame.view.draw.LindrawView;
import extrogene.gamedev.linegame.view.draw.enLine;
import extrogene.gamedev.linegame.view.multiplayer.challenge;
import extrogene.gamedev.linegame.view.multiplayer.userprofile;

public class level2_1 extends Activity{
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
							put(enLine.L1_2,Givedots.setall(1, 2, 1));
							put(enLine.L2_6, Givedots.setall(2, 6, 1));
							put(enLine.L6_10, Givedots.setall(6, 10, 1));
							put(enLine.L10_14,Givedots.setall(10, 14, 1));
							put(enLine.L14_15, Givedots.setall(14, 15, 1));
							put(enLine.L11_15,Givedots.setall(11, 15, 1));
							put(enLine.L7_11, Givedots.setall(7, 11, 1));
							put(enLine.L3_7,Givedots.setall(3, 7, 1));
							put(enLine.L3_4,Givedots.setall(3, 4, 1));
							put(enLine.L4_8, Givedots.setall(4, 8, 1));
							put(enLine.L8_12, Givedots.setall(8, 12, 1));
							put(enLine.L12_16,Givedots.setall(12, 16, 1));
							put(enLine.L7_16, Givedots.setall(7, 16, 1));
							put(enLine.L6_7,Givedots.setall(6, 7, 1));
							put(enLine.L6_13, Givedots.setall(6, 13, 1));
							put(enLine.L9_13,Givedots.setall(9, 13, 1));
							put(enLine.L5_9,Givedots.setall(5, 9, 1));
							put(enLine.L1_5, Givedots.setall(1, 5, 1));
							put(enLine.L13_14, Givedots.setall(13, 14, 1));
							put(enLine.L1_14,Givedots.setall(1, 14, 1));
							put(enLine.L1_6, Givedots.setall(1, 6, 1));
							put(enLine.L6_15,Givedots.setall(6, 15, 1));
							put(enLine.L4_15, Givedots.setall(4, 15, 1));
							put(enLine.L4_7,Givedots.setall(4, 7, 1));
							put(enLine.L7_14,Givedots.setall(7, 14, 1));
							put(enLine.L6_8,Givedots.setall(6, 8, 1));
						}
					};

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
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

					drawview = new LindrawView(level2_1.this, null, dots, Linemap,1);
					setContentView(drawview);
				}
	        });
			

		}

		
}
