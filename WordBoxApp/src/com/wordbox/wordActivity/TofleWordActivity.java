package com.wordbox.wordActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.wordboxapp.R;

public class TofleWordActivity extends Activity {

	String [] words;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tofle_word);
		
		String WordTitle[] = {"apple - 사과","banana -  바나나","strawberry - 딸기", "watermelon - 수박"};

		
		TableLayout tableLayout = (TableLayout)findViewById(R.id.tablelayout1);
		
		 Bundle b = getIntent().getExtras();
	      String [] Words = b.getStringArray("words");
	      String [] Means = b.getStringArray("means");
		
	      	
	      for(int i=0;i<Words.length;i++){
	    	  
	    	  	TableRow tablerow1 = new TableRow(this);
	            TextView tv1 = new TextView(this);
	            TextView tv2 = new TextView(this);
	          
           
	            TableRow.LayoutParams buttonParams1 = new TableRow.LayoutParams(
	                    ViewGroup.LayoutParams.WRAP_CONTENT,
	                    ViewGroup.LayoutParams.WRAP_CONTENT);
	            	
	            	buttonParams1.width=360;
	            	//buttonParams1.gravity=Gravity.CENTER_HORIZONTAL;
	           
	            	
	            	//button 꾸밈
	            	tv1.setWidth(100);
	            	tv1.setHeight(100);
	            	tv1.setText(Words[i]);
	            	tv1.setGravity(Gravity.CENTER);
	            	
	            	tv2.setWidth(300);
	            	tv2.setHeight(100);
	            	tv2.setText(Means[i]);
	            	tv2.setGravity(Gravity.CENTER);
	            	
	            	
	            	tv1.setLayoutParams(buttonParams1);
	            	tv2.setLayoutParams(buttonParams1);
	            	
	      
	          	
	              
	            	  tablerow1.addView(tv1);
	                  tablerow1.addView(tv2);
	                  tablerow1.setBackgroundResource(R.layout.buttonshape);
	                  tablerow1.setGravity(Gravity.CENTER_HORIZONTAL);
	                  
	           	   
	                  tableLayout.addView(tablerow1);
	        	     
	                
	  	
	        }
	      
	   
	}
	      

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tofle_word, menu);
		return true;
	}
	
	public TofleWordActivity() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	public void setWords(String[] words) {
		this.words = words;
	}
	
	public String[] getWords() {
		return words;
	}
}	
