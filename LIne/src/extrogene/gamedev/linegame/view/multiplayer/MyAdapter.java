package extrogene.gamedev.linegame.view.multiplayer;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class MyAdapter extends FragmentPagerAdapter {

	public MyAdapter(FragmentManager fm) {
		super(fm);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public android.support.v4.app.Fragment getItem(int arg0) {
		
		Fragment fragment = null;
		if (arg0 == 0) {
		
			fragment = new FragmentA();
		}
		if (arg0 == 1) {

			fragment = new FragmentC();
		}
		return fragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}

}
