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
import android.widget.Button;

public class level1_1 extends Activity {
	LindrawView drawview;
	challenge dc;
	static int dots = 9;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level1);

		Button next = (Button) findViewById(R.id.buttonnext);
		next.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				// Intent myIntent = new Intent(view.getContext(),
				// userprofile.class);
				// startActivityForResult(myIntent, 0);

				dc = new challenge(level1_1.this, null, dots);
				dc.setText("Draw default challenge");
				setContentView(dc);
			}
		});

		Button play1 = (Button) findViewById(R.id.nextlevel);
		play1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L2_3, Givedots.setall(2, 3, 1));
						put(enLine.L3_5, Givedots.setall(3, 5, 1));
						put(enLine.L5_6, Givedots.setall(5, 6, 1));
						put(enLine.L6_8, Givedots.setall(6, 8, 1));
						put(enLine.L4_8, Givedots.setall(4, 8, 1));
						put(enLine.L4_5, Givedots.setall(4, 5, 1));
						put(enLine.L1_5, Givedots.setall(1, 5, 1));
						put(enLine.L1_2, Givedots.setall(1, 2, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play2 = (Button) findViewById(R.id.level2_1);
		play2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L2_3,Givedots.setall(2, 3, 1));
						put(enLine.L2_5,Givedots.setall(2, 5, 1));
						put(enLine.L4_5, Givedots.setall(4, 5, 1));
						put(enLine.L3_6, Givedots.setall(3, 6, 1));
						put(enLine.L4_7,Givedots.setall(4, 7, 1));
						put(enLine.L1_6, Givedots.setall(1, 6, 1));
						put(enLine.L1_8,Givedots.setall(1, 8, 1));
						put(enLine.L5_7, Givedots.setall(5, 7, 1));
						put(enLine.L6_8,Givedots.setall(6, 8, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play3 = (Button) findViewById(R.id.level3_1);
		play3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

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

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play4 = (Button) findViewById(R.id.level1_2);
		play4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L1_2, Givedots.setall(1, 2, 1));
						put(enLine.L2_3,Givedots.setall(2, 3, 1));
						put(enLine.L1_5, Givedots.setall(1, 5, 1));
						put(enLine.L1_6, Givedots.setall(1, 6, 1));
						put(enLine.L6_7,Givedots.setall(6, 7, 1));
						put(enLine.L5_7, Givedots.setall(5, 7, 1));
						put(enLine.L1_8,Givedots.setall(1, 8, 1));
						put(enLine.L3_8,Givedots.setall(3, 8, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play5 = (Button) findViewById(R.id.level2_3);
		play5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L4_5, Givedots.setall(4, 5, 1));
						put(enLine.L5_6,Givedots.setall(5, 6, 1));
						put(enLine.L4_7,Givedots.setall(4, 7, 1));
						put(enLine.L6_9,Givedots.setall(6, 9, 1));
						put(enLine.L1_5, Givedots.setall(1, 5, 1));
						put(enLine.L5_9,Givedots.setall(5, 9, 1));
						put(enLine.L3_5,Givedots.setall(3, 5, 1));
						put(enLine.L5_7, Givedots.setall(5, 7, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play6 = (Button) findViewById(R.id.level3_2);
		play6.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L1_2, Givedots.setall(1, 2, 1));
						put(enLine.L2_3,Givedots.setall(2, 3, 1));
						put(enLine.L3_5, Givedots.setall(3, 5, 1));
						put(enLine.L4_5,Givedots.setall(4, 5, 1));
						put(enLine.L1_4, Givedots.setall(1, 4, 1));
						put(enLine.L5_6,Givedots.setall(5, 6, 1));
						put(enLine.L5_7, Givedots.setall(5, 7, 1));
						put(enLine.L7_8,Givedots.setall(7, 8, 1));
						put(enLine.L8_9, Givedots.setall(8, 9, 1));
						put(enLine.L6_9,Givedots.setall(6, 9, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play7 = (Button) findViewById(R.id.level3_3);
		play7.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L2_3,Givedots.setall(2, 3, 1));
						put(enLine.L4_5, Givedots.setall(4, 5, 1));
						put(enLine.L5_6,Givedots.setall(5, 6, 1));
						put(enLine.L7_8, Givedots.setall(7, 8, 1));
						put(enLine.L1_4, Givedots.setall(1, 4, 1));
						put(enLine.L2_5,Givedots.setall(2, 5, 1));
						put(enLine.L3_6, Givedots.setall(3, 6, 1));
						put(enLine.L4_7,Givedots.setall(4, 7, 1));
						put(enLine.L5_8, Givedots.setall(5, 8, 1));
						put(enLine.L1_5, Givedots.setall(1, 5, 1));
						put(enLine.L4_9,Givedots.setall(4, 9, 1));
						put(enLine.L5_9,Givedots.setall(5, 9, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play8 = (Button) findViewById(R.id.button8);
		play8.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L1_2, Givedots.setall(1, 2, 1));
						put(enLine.L2_3,Givedots.setall(2, 3, 1));
						put(enLine.L4_5, Givedots.setall(4, 5, 1));
						put(enLine.L5_6,Givedots.setall(5, 6, 1));
						put(enLine.L7_8, Givedots.setall(7, 8, 1));
						put(enLine.L8_9,Givedots.setall(8, 9, 1));
						put(enLine.L1_4, Givedots.setall(1, 4, 1));
						put(enLine.L3_6, Givedots.setall(3, 6, 1));
						put(enLine.L4_7,Givedots.setall(4, 7, 1));
						put(enLine.L6_9,Givedots.setall(6, 9, 1));
						put(enLine.L2_6,Givedots.setall(2, 6, 1));
						put(enLine.L2_4, Givedots.setall(2, 4, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play9 = (Button) findViewById(R.id.button9);
		play9.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L1_2, Givedots.setall(1, 2, 1));
						put(enLine.L7_8, Givedots.setall(7, 8, 1));
						put(enLine.L1_4, Givedots.setall(1, 4, 1));
						put(enLine.L2_5,Givedots.setall(2, 5, 1));
						put(enLine.L3_6, Givedots.setall(3, 6, 1));
						put(enLine.L4_7,Givedots.setall(4, 7, 1));
						put(enLine.L5_8, Givedots.setall(5, 8, 1));
						put(enLine.L6_9,Givedots.setall(6, 9, 1));
						put(enLine.L2_6,Givedots.setall(2, 6, 1));
						put(enLine.L4_8, Givedots.setall(4, 8, 1));
						put(enLine.L5_9,Givedots.setall(5, 9, 1));
						put(enLine.L2_4, Givedots.setall(2, 4, 1));
						put(enLine.L3_5,Givedots.setall(3, 5, 1));
						put(enLine.L6_8,Givedots.setall(6, 8, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play10 = (Button) findViewById(R.id.button10);
		play10.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L1_2, Givedots.setall(1, 2, 1));
						put(enLine.L7_8, Givedots.setall(7, 8, 1));
						put(enLine.L1_4, Givedots.setall(1, 4, 1));
						put(enLine.L3_6, Givedots.setall(3, 6, 1));
						put(enLine.L4_7,Givedots.setall(4, 7, 1));
						put(enLine.L6_9,Givedots.setall(6, 9, 1));
						put(enLine.L1_5, Givedots.setall(1, 5, 1));
						put(enLine.L2_6,Givedots.setall(2, 6, 1));
						put(enLine.L5_9,Givedots.setall(5, 9, 1));
						put(enLine.L3_5,Givedots.setall(3, 5, 1));
						put(enLine.L5_7, Givedots.setall(5, 7, 1));
						put(enLine.L6_8,Givedots.setall(6, 8, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play11 = (Button) findViewById(R.id.button11);
		play11.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L1_2, Givedots.setall(1, 2, 1));
						put(enLine.L2_3,Givedots.setall(2, 3, 1));
						put(enLine.L4_5, Givedots.setall(4, 5, 1));
						put(enLine.L5_6,Givedots.setall(5, 6, 1));
						put(enLine.L8_9,Givedots.setall(8, 9, 1));
						put(enLine.L1_4, Givedots.setall(1, 4, 1));
						put(enLine.L2_5,Givedots.setall(2, 5, 1));
						put(enLine.L3_6, Givedots.setall(3, 6, 1));
						put(enLine.L4_7,Givedots.setall(4, 7, 1));
						put(enLine.L6_9,Givedots.setall(6, 9, 1));
						put(enLine.L2_6,Givedots.setall(2, 6, 1));
						put(enLine.L4_8, Givedots.setall(4, 8, 1));
						put(enLine.L6_8,Givedots.setall(6, 8, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play12 = (Button) findViewById(R.id.button12);
		play12.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L1_2, Givedots.setall(1, 2, 1));
						put(enLine.L2_5, Givedots.setall(2, 5, 1));
						put(enLine.L4_5, Givedots.setall(4, 5, 1));
						put(enLine.L1_4, Givedots.setall(1, 4, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play13 = (Button) findViewById(R.id.button13);
		play13.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L1_2, Givedots.setall(1, 2, 1));
						put(enLine.L2_5, Givedots.setall(2, 5, 1));
						put(enLine.L4_5, Givedots.setall(4, 5, 1));
						put(enLine.L1_4, Givedots.setall(1, 4, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play14 = (Button) findViewById(R.id.button14);
		play14.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L1_2, Givedots.setall(1, 2, 1));
						put(enLine.L2_5, Givedots.setall(2, 5, 1));
						put(enLine.L4_5, Givedots.setall(4, 5, 1));
						put(enLine.L1_4, Givedots.setall(1, 4, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});

		Button play15 = (Button) findViewById(R.id.button15);
		play15.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				HashMap<enLine, Givedots> Linemap = new HashMap<enLine, Givedots>() {
					{
						put(enLine.L1_2, Givedots.setall(1, 2, 1));
						put(enLine.L2_5, Givedots.setall(2, 5, 1));
						put(enLine.L4_5, Givedots.setall(4, 5, 1));
						put(enLine.L1_4, Givedots.setall(1, 4, 1));
					}
				};

				drawview = new LindrawView(level1_1.this, null, dots, Linemap,1);
				setContentView(drawview);
			}
		});
	}

	
}
