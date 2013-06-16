package com.wordbox.market;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

import com.example.wordboxapp.R;

public class MarketActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        
        
        String MarketTitle[] = {"1.WordBox  100개단어" + "\n" + "wordbox","1.WordBox  100개단어" 
        + "\n" + "wordbox","1.WordBox  100개단어" + "\n" + "wordbox", "......"};
        
        TableLayout tableLayout1 = (TableLayout)findViewById(R.id.tablelayout1);
        
      
        for(int i=0;i<MarketTitle.length;i++){
        	
        	TableRow tablerow1 = new TableRow(this);

           
        	Button imgbutton = new Button(this);
        	TextView tv1 = new TextView(this);
            
        
                 LayoutParams param = new LayoutParams();
                 	param.width=200;
                 	param.height=200;
                 	param.gravity=Gravity.CENTER_VERTICAL;
                 	param.topMargin=20;
                 	param.leftMargin=20;
                 	param.bottomMargin=20;
                 	imgbutton.setLayoutParams(param); 
                 	imgbutton.setBackgroundResource(R.drawable.wordlist);
                 	//imgbutton.setScaleType(ScaleType.CENTER_CROP);
                 	imgbutton.setPadding(0, 10, 0, 0);
            		imgbutton.setMaxHeight(100);
            		imgbutton.setMaxWidth(100);
            		imgbutton.setText("tofle"+"\n"+"기초단어");
//            		SpannableStringBuilder sp = new SpannableStringBuilder(textView.getText());
//            	    sp.setSpan(new ForegroundColorSpan(Color.BLUE), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            	 
//            	    textView.setText(sp);
            	
            		
            		   
            	LayoutParams param2 = new LayoutParams();
            		param2.gravity = Gravity.CENTER_VERTICAL;
            		tv1.setLayoutParams(param); 
                 	tv1.setText(MarketTitle[i]);
                 	tv1.setGravity(Gravity.CENTER_VERTICAL);
                
              
                TableLayout.LayoutParams buttonParams1 = new TableLayout.LayoutParams();
             		buttonParams1.width=680;
             		buttonParams1.topMargin=50;
             		tablerow1.setLayoutParams(buttonParams1);
             	
                 
            	tablerow1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						
						AlertDialog.Builder alert = new AlertDialog.Builder(getParent());
						alert.setMessage("단어를 구입하시겠습니까???")
						
						.setCancelable(false)		
						.setNegativeButton("구입합니다",
								new DialogInterface.OnClickListener() {
								    @Override
								    public void onClick(DialogInterface dialog, int which) {
								        // 'YES'
								    }
								})
						.setPositiveButton("구입안합니다",
								new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// 'No'
										return;
									}
								}).show();
						
					}
				});//onclicklistener 끝나는 부분
                
            tablerow1.addView(imgbutton);    
        	tablerow1.addView(tv1);
        	tablerow1.setBackgroundResource(R.drawable.marketlist);
            tableLayout1.addView(tablerow1);
            
        }
    
        
	}

	

}
