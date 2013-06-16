package com.wordbox.setting;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wordboxapp.R;

public class SettingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		 
		RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.relativelayout);
		LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.linearlayout1); 
		LinearLayout linearLayout  = (LinearLayout)findViewById(R.id.linearlayout);
		
		
		
        TextView textview1 = new TextView(this);
        TextView textview2 = new TextView(this);
       
       
       
        textview1.setTextSize(25);
        textview1.setText("만든 사람들");
        textview1.setBackgroundResource(R.layout.textviewshapes);
        
      
        textview2.setTextSize(25);
        textview2.setText("이재홍 : 안드로이드"+"\n"+"이재훈 : 서버"+"\n"+"안명희 : 디자인");
        textview2.setBackgroundResource(R.layout.textviewshapesss);
       
        linearLayout1.addView(textview1);
        linearLayout1.addView(textview2);
        
        RelativeLayout.LayoutParams buttonParams1 = new RelativeLayout.LayoutParams(
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.MATCH_PARENT);
        	
        textview1.setPadding(20, 10, 0, 10);
        textview2.setPadding(20, 10, 0, 10);
        linearLayout1.setLayoutParams(buttonParams1);   

//-----------------------------------------------------------
        
      
        
        TextView tv1 = new TextView(this);
        TextView tv2 = new TextView(this);
        TextView tv3 = new TextView(this);
        TextView tv4 = new TextView(this);
        TextView tv5 = new TextView(this);
        TextView tv6 = new TextView(this);
        TextView tv7 = new TextView(this);
        
     
        tv1.setText("알림");  
        tv3.setText("도움말");
        tv5.setText("업데이트");   
        tv7.setText("고객문의");
      
        tv1.setTextSize(25);  
        tv3.setTextSize(25);
        tv5.setTextSize(25);
        tv7.setTextSize(25);
       
        tv1.setBackgroundResource(R.layout.textviewshapes);
        tv3.setBackgroundResource(R.layout.textviewshapess);
        tv5.setBackgroundResource(R.layout.textviewshapess);
        tv7.setBackgroundResource(R.layout.textviewshapesss);
        
        linearLayout.addView(tv1);
        linearLayout.addView(tv3);
        linearLayout.addView(tv5);
        linearLayout.addView(tv7);
        
        RelativeLayout.LayoutParams buttonParams2 = new RelativeLayout.LayoutParams(
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
        	buttonParams2.topMargin=360;
        tv1.setPadding(20, 15, 0, 0);
        tv3.setPadding(20, 5, 0, 5);  	
        tv5.setPadding(20, 5, 0, 5);
        tv7.setPadding(20, 5, 0, 10);
        
        linearLayout.setBackgroundResource(R.layout.textviewshape);		
        linearLayout.setPadding(0, 0, 0, 0);
        linearLayout.setLayoutParams(buttonParams2);   
       
       
        
//-----------------------------------------------------------------------------------------        

        TextView textview3 = new TextView(this);
        RelativeLayout.LayoutParams buttonParams3 = new RelativeLayout.LayoutParams(
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
        	buttonParams3.topMargin=770;
       
        	textview3.setTextSize(25);
        	textview3.setLayoutParams(buttonParams3);
        	textview3.setPadding(20, 10, 0, 10);
        	textview3.setText("로그인");	        
        	textview3.setBackgroundResource(R.layout.textviewshape);
        

        relativeLayout.addView(textview3);
        
	}
}
