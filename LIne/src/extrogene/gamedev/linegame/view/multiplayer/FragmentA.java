package extrogene.gamedev.linegame.view.multiplayer;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.line.R;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class FragmentA extends Fragment {
	 ListView listView ;
	public FragmentA() {
		super();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_a, container, false);

		} 

	
	

}
