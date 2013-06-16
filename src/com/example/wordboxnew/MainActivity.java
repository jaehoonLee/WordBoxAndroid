package com.example.wordboxnew;

import market.MarketActivity;
import my.MyActivity;
import setting.SettingActivity;
import wordActivity.WordTabbarActivity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;



public class MainActivity extends TabActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Resources res = getResources();
		final TabHost tabHost = getTabHost();
		TabSpec spec;
		Intent intent;
	
		tabHost.setBackgroundColor(Color.rgb(232, 232, 231));
		
		// 탭엑티비티 무조건 0번째 탭이 선택되어지는 버그를 회피하기 위한 코드
		intent = new Intent(this, BlankActivity.class);
		spec = tabHost.newTabSpec("").setIndicator("").setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildTabViewAt(0).setVisibility(View.GONE);

		// 첫번째 탭(1)
		intent = new Intent(this, MarketActivity.class);
		spec = tabHost.newTabSpec("tag1").setIndicator(""
				/*getResources().getDrawable(R.drawable.market)*/)
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.market1);

		// 두번째 탭(2)
		intent = new Intent(this, WordTabbarActivity.class);
		spec = tabHost.newTabSpec("tag2").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.word1);
		// 세번째 탭(3)
		intent = new Intent(this, MyActivity.class);
		spec = tabHost.newTabSpec("tag3").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.my1);
		// 세번째 탭(4)
		intent = new Intent(this, SettingActivity.class);
		spec = tabHost.newTabSpec("tag4").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		
		intent = new Intent(this, SettingActivity.class);
		spec = tabHost.newTabSpec("tag5").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		
		
		//----------------------------------------------------------------------------
		tabHost.getTabWidget().getChildTabViewAt(5).setVisibility(View.GONE);
		tabHost.getTabWidget().setBackgroundColor(Color.WHITE);
		//-----------------------------------------------------------------------
			tabHost.getTabWidget().getChildAt(1).setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO 자동 생성된 메소드 스텁
				tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.market);
				tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.word1);
				tabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.my1);
				tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
				return false;
				}
			});
			//--------------------------------
			tabHost.getTabWidget().getChildAt(2).setOnTouchListener(new OnTouchListener(){


				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO 자동 생성된 메소드 스텁
					tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.market1);
					tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.word);
					tabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.my1);
					tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
					return false;
					}
				});
			//--------------------------------------
			tabHost.getTabWidget().getChildAt(3).setOnTouchListener(new OnTouchListener(){


				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO 자동 생성된 메소드 스텁
					tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.market1);
					tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.word1);
					tabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.my);
					tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
					return false;
					}
				});
			//-----------------------------
			tabHost.getTabWidget().getChildAt(4).setOnTouchListener(new OnTouchListener(){


				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO 자동 생성된 메소드 스텁
					tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.market1);
					tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.word1);
					tabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.my1);
					tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting);
					return false;
					}
				});
		}
		
		
	}
	
/*
 for(int i=1;i<4; i++){
tabHost.getTabWidget().getChildAt(i).setOnTouchListener(new OnTouchListener(){


	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO 자동 생성된 메소드 스텁
		 * if(i=1){
		 * tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
			tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
			tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
			tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		 * 
		tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		return false;
		}
	});
	
}
*/
