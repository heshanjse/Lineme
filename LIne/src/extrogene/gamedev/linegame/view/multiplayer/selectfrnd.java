package extrogene.gamedev.linegame.view.multiplayer;

import com.example.line.R;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

public class selectfrnd extends FragmentActivity implements TabListener {
	ViewPager viewPager;
	ActionBar actionbar;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.selectfriend);
		viewPager = (ViewPager) findViewById(R.id.pager);
	
		viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
	
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
			
				actionbar.setSelectedNavigationItem(arg0);
				
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});
		actionbar = getActionBar();
		actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		ActionBar.Tab tab1 = actionbar.newTab();
		tab1.setText("Contact");
		tab1.setTabListener(this);

		ActionBar.Tab tab2 = actionbar.newTab();
		tab2.setText("Online");
		tab2.setTabListener(this);

		actionbar.addTab(tab1);
		actionbar.addTab(tab2);
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {

		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {

	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {

	}

}
