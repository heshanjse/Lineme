package extrogene.gamedev.linegame.view.draw;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.line.R;

import extrogene.gamedev.linegame.view.lost;
import extrogene.gamedev.linegame.view.win;
import extrogene.gamedev.linegame.view.dailychallenge.lostdaily;
import extrogene.gamedev.linegame.view.dailychallenge.windaily;

public class LindrawView extends View {
	Context context;
	private Bitmap bmp = BitmapFactory.decodeResource(getResources(),
			R.drawable.dot);

	private Bitmap bmp2 = BitmapFactory.decodeResource(getResources(),
			R.drawable.dotcome);
	static int numberofdots;
	int dwidth, dheight, lastpastdot, drawingmode;

	float distancex = 0, distancey = 0;
	ArrayList<Float> point_x = new ArrayList<Float>();
	ArrayList<Float> point_y = new ArrayList<Float>();
	public static Map<enLine, Givedots> enLineMap;
	static HashMap<enLine, Givedots> LineMap;
	int touch_point;
	Paint paint = new Paint();
	ArrayList<Line> lines = new ArrayList<Line>();
	ArrayList<Line> firstlines = new ArrayList<Line>();

	public LindrawView(Context context, AttributeSet attrs, int dots,
			HashMap<enLine, Givedots> linemap, int drawingmode) {
		super(context, attrs);
		enLineMap = linemap;
		LineMap = linemap;
		numberofdots = dots;
		caldots(context);
		this.drawingmode = drawingmode;
		leveldrawline(linemap);

		paint.setAntiAlias(true);
		paint.setStrokeWidth(3f);
		paint.setColor(Color.BLACK);
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeJoin(Paint.Join.ROUND);
		this.context = context;
		paint.setStrokeCap(Paint.Cap.ROUND);

		
		
		// end
	}

	public LindrawView(Context context, AttributeSet attrs, int dots) {
		super(context, attrs);

		enLineMap = LineMap;
		firstlines.clear();
		numberofdots = dots;
		caldots(context);
		leveldrawline(LineMap);
		paint.setAntiAlias(true);
		paint.setStrokeWidth(3f);
		paint.setColor(Color.BLACK);
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeJoin(Paint.Join.ROUND);
		this.context = context;
		paint.setStrokeCap(Paint.Cap.ROUND);
	}

	private void leveldrawline(HashMap<enLine, Givedots> linemap) {
		for (enLine line : linemap.keySet()) {
			firstlines.add(new Line(point_x.get(linemap.get(line).getFirst()),
					point_y.get(linemap.get(line).getFirst()), point_x
							.get(linemap.get(line).getSecond()), point_y
							.get(linemap.get(line).getSecond()), linemap.get(
							line).getRepnum()));
		}

	}

	public void caldots(Context context) {
		WindowManager wm = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE);
		Display display = wm.getDefaultDisplay();
		Point size = new Point();
		dwidth = display.getWidth(); // get screen width
		dheight = display.getHeight();// get screen height
		distancex = (float) (dwidth / Math.sqrt(numberofdots));
		distancey = (float) (dheight / Math.sqrt(numberofdots));
		float x = distancex / 2, y = distancey / 2;
		point_x.add(x);
		point_y.add(y);
		for (int i = 0; i < Math.sqrt(numberofdots); i++) { // add values to
															// arraylist
			for (int j = 0; j < Math.sqrt(numberofdots); j++) {
				point_x.add(x);
				point_y.add(y);
				x = x + distancex;
			}
			x = distancex / 2;
			y = y + distancex;// previous distancey
		}

	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		try {
			if (event.getAction() == MotionEvent.ACTION_DOWN) {
				for (int i = 1; i <= numberofdots; i++) {
					if (point_x.get(i) - 35 < event.getX()
							&& event.getX() < point_x.get(i) + 35
							&& point_y.get(i) - 35 < event.getY()
							&& event.getY() < point_y.get(i) + 35) {
						lines.add(new Line(point_x.get(i), point_y.get(i)));
						lastpastdot = i;
						touch_point = i;
						return true;
					} else {
						touch_point = 0;
					}

				}
				return true;
			} else if (event.getAction() == MotionEvent.ACTION_MOVE
					&& lines.size() > 0) {
				Line current = lines.get(lines.size() - 1);

				for (int i = 1; i <= numberofdots; i++) {
					if (point_x.get(i) - 35 < event.getX()
							&& event.getX() < point_x.get(i) + 35
							&& point_y.get(i) - 35 < event.getY()
							&& event.getY() < point_y.get(i) + 35) {
						current.stopX = point_x.get(i);
						current.stopY = point_y.get(i);
						lines.add(new Line(point_x.get(i), point_y.get(i)));
						touch_point = i;
						invalidate();
						if (lastpastdot != i) {
							Enumlines.SetLine(lastpastdot, i);
							lastpastdot = i;
						}
						invalidate();

						return true;

					} else {
						touch_point = 0;
						invalidate();
					}
				}
				current.stopX = event.getX();
				current.stopY = event.getY();
				invalidate();
				return true;
			} else if (event.getAction() == MotionEvent.ACTION_UP) {
				Line current = lines.get(lines.size() - 1);
				for (int i = 1; i <= numberofdots; i++) {
					if (point_x.get(i) - 35 < event.getX()
							&& event.getX() < point_x.get(i) + 35
							&& point_y.get(i) - 35 < event.getY()
							&& event.getY() < point_y.get(i) + 35) {
						if (lastpastdot != i) {
							Enumlines.SetLine(lastpastdot, i);
							lastpastdot = i;
						}
						if (enLineMap.isEmpty()) {
							if (drawingmode == 1) {
								Intent intent = new Intent(context, win.class);
						//		intent.putExtra("dots", numberofdots);
								context.startActivity(intent);
							} else {
								Intent intent = new Intent(context, windaily.class);
								context.startActivity(intent);
							}
						} else {
							if(drawingmode == 1){
							Intent intent = new Intent(context, lost.class);
							intent.putExtra("dots", numberofdots);
							context.startActivity(intent);
							}else{
								Intent intent = new Intent(context, lostdaily.class);
								context.startActivity(intent);
							}
						}
						return true;
					} else {
						touch_point = 0;
					}
				}
				if (enLineMap.isEmpty()) {
					Intent intent = new Intent(context, win.class);
					intent.putExtra("dots", numberofdots);
					context.startActivity(intent);
				} else {
					Intent intent = new Intent(context, lost.class);
					intent.putExtra("dots", numberofdots);
					context.startActivity(intent);
				}

			}

		} catch (Exception e) {
			Log.d("exceptions", e + "");
		}
		return false;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawColor(-1);
		for (Line l : firstlines) {

			if (l.nolines == 3) {
				paint.setColor(Color.rgb(126, 126, 126));
			} else if (l.nolines == 2) {
				paint.setColor(Color.rgb(178, 176, 176));
			} else {
				paint.setColor(Color.rgb(228, 221, 221));
			}

			paint.setStrokeWidth(15);
			canvas.drawLine(l.startX, l.startY, l.stopX, l.stopY, paint);

		}

		for (int i = 1; i <= numberofdots; i++) {
			canvas.drawBitmap(bmp, point_x.get(i), point_y.get(i), null); // print
																			// points
		}

		for (Line l : lines) {
			// paint.setColor(Color.rgb(41, 67, 120));
			// paint.setColor(Color.rgb(22, 120, 141));
			paint.setColor(Color.rgb(92, 161, 220));
			paint.setStrokeWidth(20);
			// paint.setStrokeCap(Paint.Cap.ROUND);
			canvas.drawLine(l.startX, l.startY, l.stopX, l.stopY, paint);

		}
		if (touch_point > 0) {
			canvas.drawBitmap(bmp2, (point_x.get(touch_point) - 45),
					(point_y.get(touch_point) - 45), null);
		}

	}

}
