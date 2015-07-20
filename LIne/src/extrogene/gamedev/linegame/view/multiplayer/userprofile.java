package extrogene.gamedev.linegame.view.multiplayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.example.line.R;

import extrogene.gamedev.linegame.view.level.level2_1;
import android.app.Activity;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class userprofile extends Activity {
	private Spinner spinner2;
	EditText username;
	TextView tvIsConnected;
	TextView resut;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.userprofile);
		tvIsConnected = (TextView) findViewById(R.id.tvIsConnected);
        resut = (TextView) findViewById(R.id.checkusertxt);
		username = (EditText) findViewById(R.id.txtusername);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
        // check if you are connected or not
        if(isConnected()){
            tvIsConnected.setBackgroundColor(0xFF00CC00);
            tvIsConnected.setText("You are conncted");
        }
        else{
            tvIsConnected.setText("please activate your data");
        }
        addItemsOnSpinner2();
	}

	public void addItemsOnSpinner2() {

		List<String> list = new ArrayList<String>();
		list.add("Srilanka");
		list.add("China");
		list.add("UK");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list);
		dataAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		 Button help = (Button) findViewById(R.id.nextlevel);
	        help.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	            	String usname =username.getText().toString();
	            	 new HttpAsyncTask().execute("http://10.0.2.2:8080/checkuser?username="+usname);
	       
	            }
	        });
		return super.onCreateOptionsMenu(menu);
	}

    public static String GET(String url){
        InputStream inputStream = null;
        String result = "";
        String con="";
        try {
 
            // create HttpClient
            HttpClient httpclient = new DefaultHttpClient();
 
            // make GET request to the given URL
            HttpResponse httpResponse = httpclient.execute(new HttpGet(url));
 
            // receive response as inputStream
            inputStream = httpResponse.getEntity().getContent();
 
            // convert inputstream to string
            if(inputStream != null){
                result = convertInputStreamToString(inputStream);

            
            }else{
                result = "Did not work!";
            }
        } catch (Exception e) {
            Log.d("InputStream", e.getLocalizedMessage());
        }
 
        
		return result;
    }
    
    private static String convertInputStreamToString(InputStream inputStream) throws IOException{
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while((line = bufferedReader.readLine()) != null)
            result += line;
 
        inputStream.close();
        return result;
 
    }
    
    
 
    public boolean isConnected(){
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Activity.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isConnected()) 
                return true;
            else
                return false;   
    }
    
    private class HttpAsyncTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
 
            return GET(urls[0]);
        }
        // onPostExecute displays the results of the AsyncTask.
        
        
        
        @Override
        protected void onPostExecute(String result) {
            Toast.makeText(getBaseContext(), "Received!", Toast.LENGTH_LONG).show();
           // etResponse.setText(result);
            resut.setText(result);
            /*
            if(!result.equals("ok")){

            	resut.setVisibility(View.VISIBLE);

            	resut.setText(result);

                //usercheck.setText("heshan");

                }else{
*/
                	Intent myIntent = new Intent(getBaseContext(), listclass.class);
                    startActivityForResult(myIntent, 0);

          //      }

        //        System.out.print("result is :"+result);

          }

        
       
    }

}
