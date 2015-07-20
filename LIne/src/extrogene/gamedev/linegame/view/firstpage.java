package extrogene.gamedev.linegame.view;

import com.example.line.R;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class firstpage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(firstpage.this, Main.class);
                firstpage.this.startActivity(mainIntent);
                firstpage.this.finish();
            }
        }, 2000);
    }

  
    
   
    
    
}
