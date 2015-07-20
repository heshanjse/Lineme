package extrogene.gamedev.linegame.view.multiplayer;



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
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import com.example.line.R;
import extrogene.gamedev.linegame.view.draw.Enumsend;
import extrogene.gamedev.linegame.view.draw.Givedots;
import extrogene.gamedev.linegame.view.draw.enLine;


	 
	 public class challenge extends View {
			String mText;
			public static Map<enLine, Givedots> enLineMap_defaultchallange ;
			Context context;
			private Bitmap bmp = BitmapFactory.decodeResource(getResources(),R.drawable.dot);
			static int numberofdots;
			int dwidth,dheight,lastpastdot,touch_point;
			float distancex = 0, distancey = 0;
			ArrayList<Float> point_x = new ArrayList<Float>();
			ArrayList<Float> point_y = new ArrayList<Float>();
		//	ArrayList<Integer> fixedLinedots = new ArrayList<Integer>();
		//	ArrayList<Integer> drawLinedots = new ArrayList<Integer>();
			

			Paint paint = new Paint();
			ArrayList<Line> Lines = new ArrayList<Line>();
			
			public challenge(Context context, AttributeSet attrs, int dots) {
				super(context, attrs);
				
				numberofdots = dots;
				caldots(context);
				
				paint.setAntiAlias(true);
				paint.setStrokeWidth(3f);
				paint.setColor(Color.BLACK);
				paint.setStyle(Paint.Style.STROKE);
				paint.setStrokeJoin(Paint.Join.ROUND);
				this.context = context;
				paint.setStrokeCap(Paint.Cap.ROUND);
			}

			

			public void caldots(Context context) {
				WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
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
								Lines.add(new Line(point_x.get(i), point_y.get(i)));
								lastpastdot = i;
								touch_point = i;
								return true;
							} else {
								touch_point = 0;
							}

						}
						return true;
				} else if (event.getAction() == MotionEvent.ACTION_MOVE
						&& Lines.size() > 0) {
					Line current = Lines.get(Lines.size() - 1);

					for (int i = 1; i <= numberofdots; i++) {
						if (point_x.get(i) - 35 < event.getX()
								&& event.getX() < point_x.get(i) + 35
								&& point_y.get(i) - 35 < event.getY()
								&& event.getY() < point_y.get(i) + 35) {
							current.stopX = point_x.get(i);
							current.stopY = point_y.get(i);
							Lines.add(new Line(point_x.get(i), point_y.get(i)));
							touch_point = i;
							invalidate();
							if (lastpastdot != i) {
								Enumsend.SetLinesend(lastpastdot, i);
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
					Line current = Lines.get(Lines.size() - 1);
				//	for (int i = 1; i <= numberofdots; i++) {
					/*	if (point_x.get(i) - 35 < event.getX()
								&& event.getX() < point_x.get(i) + 35
								&& point_y.get(i) - 35 < event.getY()
								&& event.getY() < point_y.get(i) + 35) {*/
					touch_point = 0;
							try{
								if(mText.equals("Draw your challenge")){
									Intent intent = new Intent(context, send.class);
									context.startActivity(intent);
								}else if(mText.equals("Draw default challenge")){
									Intent intent = new Intent(context, userprofile.class);
									context.startActivity(intent);
								}
							
							}catch(Exception e){
								Log.d("intent error", e.toString());
							}
							return true;
					//	}else{
							
					//	}	
				//	}
				}
				//	resultcalculate();
				} catch (Exception e) {
					Log.d("exceptions", e + "");
				}
				return false;
			}
				
			
		/*	private void resultcalculate(){
				fixedLinedots.remove(fixedLinedots.size() - 1);
				Collections.sort(fixedLinedots);
				Collections.sort(drawLinedots);
				
				
				for (int i=0;i<fixedLinedots.size();i++) {
					System.out.println("fix i ="+fixedLinedots.get(i));
					

				}
				for (int j=1;j<=drawLinedots.size();j++) {
					System.out.println("draw i ="+drawLinedots.get(j));
					

				}

				if(fixedLinedots.equals(drawLinedots)){
					
				}else{
				
				}
			}*/
			
			private void drawTextOnCanvas(Canvas canvas, String text) {
		        // maybe color the bacground..
		       // canvas.drawPaint(paint);

		        // Setup a textview like you normally would with your activity context
				TextView tv = new TextView(context);

		        // setup text
		        tv.setText(mText);
		        tv.setTextSize(21);
		        // maybe set textcolor
		        tv.setTextColor(Color.BLACK);

		        // you have to enable setDrawingCacheEnabled, or the getDrawingCache will return null
		        tv.setDrawingCacheEnabled(true);

		        // we need to setup how big the view should be..which is exactly as big as the canvas
		        tv.measure(MeasureSpec.makeMeasureSpec(canvas.getWidth(), MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(canvas.getHeight(), MeasureSpec.EXACTLY));

		        // assign the layout values to the textview
		        tv.layout(0, 0, tv.getMeasuredWidth(), tv.getMeasuredHeight());

		        // draw the bitmap from the drawingcache to the canvas
		        canvas.drawBitmap(tv.getDrawingCache(),dwidth/4, distancey/4, paint);

		        // disable drawing cache
		        tv.setDrawingCacheEnabled(false);
		}

		public void setText(String text) {
		        this.mText = text;
		}

			@Override
			protected void onDraw(Canvas canvas) {
				
				//canvas.drawPaint(paint); 
				//paint.setColor(Color.BLACK); 
				//paint.setTextSize(21); 
				//canvas.drawText("Default Challenge",dwidth/3, distancey/4, paint); 
				 drawTextOnCanvas(canvas, mText);

				for (int i = 1; i <= numberofdots; i++) {
					canvas.drawBitmap(bmp, point_x.get(i), point_y.get(i), null); // print
																					// points
				}
				

				for (Line l : Lines) {
					paint.setColor(Color.rgb(92, 161, 220));
					paint.setStrokeWidth(20);
					canvas.drawLine(l.startX, l.startY, l.stopX, l.stopY, paint);

				}

			}

		}
	 
	 class Line {

			public float startX, startY;
			public float stopX, stopY;

			public Line(float startX, float startY, float stopX, float stopY) {
				for (int i = 0; i < challenge.numberofdots; i++) {

					this.startX = startX;

					this.startY = startY;

					this.stopX = stopX;

					this.stopY = stopY;

				}
			}

			public Line(float startX, float startY) { // for convenience
				this(startX, startY, startX, startY);
			}

		}