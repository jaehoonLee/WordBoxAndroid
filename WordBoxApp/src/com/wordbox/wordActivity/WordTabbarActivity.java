 package com.wordbox.wordActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TabHost;

import com.example.wordboxapp.R;
import com.wordbox.BlankActivity;

public class WordTabbarActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_word_tabbar);
		
		Resources res = getResources();
		final TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;

		// 탭엑티비티 무조건 0번째 탭이 선택되어지는 버그를 회피하기 위한 코드
//		intent = new Intent(this, BlankActivity.class);
//		spec = tabHost.newTabSpec("").setIndicator("").setContent(intent);
//		tabHost.addTab(spec);
//		tabHost.getTabWidget().getChildTabViewAt(0).setVisibility(View.GONE);

		// 첫번째 탭(1)
		intent = new Intent(this, WordActivity.class);
		spec = tabHost.newTabSpec("artists").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);

		// 두번째 탭(2)
		intent = new Intent(this, BlankActivity.class);
		spec = tabHost.newTabSpec("albums").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);

		// 세번째 탭(3)
		intent = new Intent(this, BlankActivity.class);
		spec = tabHost.newTabSpec("songs").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);

		
		tabHost.getTabWidget().setBackgroundResource(R.drawable.wordword);
		

		tabHost.getTabWidget().getChildTabViewAt(0).setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				tabHost.getTabWidget().setBackgroundResource(R.drawable.wordword);			
				return false;
			}
		});
		
		tabHost.getTabWidget().getChildTabViewAt(1).setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				tabHost.getTabWidget().setBackgroundResource(R.drawable.progress);			
				return false;
			}
		});
		

		tabHost.getTabWidget().getChildTabViewAt(2).setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				tabHost.getTabWidget().setBackgroundResource(R.drawable.playgame);			
				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.word_tabbar, menu);
		return true;
	}

}
