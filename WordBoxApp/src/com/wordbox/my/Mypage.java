package com.wordbox.my;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.wordboxapp.R;

public class Mypage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mypage);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mypage, menu);
		return true;
	}

}
