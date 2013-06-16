package com.wordbox.market;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TabHost;

import com.example.wordboxapp.R;
import com.wordbox.BlankActivity;
import com.wordbox.my.MyActivity;

public class MarketTabberActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_market_tabber);
		
		
		Resources res = getResources();
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;

		// 탭엑티비티 무조건 0번째 탭이 선택되어지는 버그를 회피하기 위한 코드
		intent = new Intent(this, BlankActivity.class);
		spec = tabHost.newTabSpec("").setIndicator("").setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildTabViewAt(0).setVisibility(View.GONE);

		// 첫번째 탭(1)
		intent = new Intent(this, MarketActivity.class);
		spec = tabHost.newTabSpec("artists").setIndicator("마켓보기",
				res.getDrawable(R.drawable.icon))
				.setContent(intent);
		tabHost.addTab(spec);

		// 두번째 탭(2)
		intent = new Intent(this, MyActivity.class);
		spec = tabHost.newTabSpec("albums").setIndicator("구매내역",
				res.getDrawable(R.drawable.icon))
				.setContent(intent);
		tabHost.addTab(spec);



	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.market_tabber, menu);
		return true;
	}

}
