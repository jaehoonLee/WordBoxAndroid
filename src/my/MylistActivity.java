	package my;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.Gravity;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

import com.example.wordboxnew.R;

public class MylistActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mylist);
	
		String[] arraylist = {"TOEIC" + "\n" + "기초단어100개","TOEIC" + "\n" + "기초단어100개","TOEIC" + "\n" + "기초단어100개","TOEIC" + "\n" + "기초단어100개"};
		String[] arraylist1 = {"1.Tofle기초" +"\n" + "현재 진행률 : ","2.Tofle기초"+"\n" +"현재 진행률","3.Tofle기초" +"\n" +"현재 진행률","4.Tofle기초" + "\n" + "현재 진행률"};
		
		TableLayout tableLayout = (TableLayout)findViewById(R.id.tablelayout);
		
		
		
		for(int i=0;i<arraylist.length;i++){
			
			TableRow tablerow = new TableRow(this);
			TextView tv1 = new TextView(this);
			TextView tv2 = new TextView(this);
			
			
				tv1.setText(arraylist[i]);
				tv2.setText(arraylist1[i]);
				//글자 크기 키우는 방법
				SpannableStringBuilder sp1 = new SpannableStringBuilder(tv1.getText());
				sp1.setSpan(new  AbsoluteSizeSpan(50), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
				sp1.setSpan(new  ForegroundColorSpan(Color.rgb(41, 172, 198)), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
			    tv1.setText(sp1);//41,172,198
			    
			    SpannableStringBuilder sp2 = new SpannableStringBuilder(tv2.getText());
			    sp2.setSpan(new  AbsoluteSizeSpan(10), 10, 16, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
			    tv2.setText(sp2);
			    
			    LayoutParams param1 = new LayoutParams();
			    param1.width=200;
			    param1.gravity=Gravity.CENTER;
			    tv1.setLayoutParams(param1); 
			    tv1.setGravity(Gravity.CENTER);
			   
			    
			    LayoutParams param2 = new LayoutParams();
			    
			    param2.leftMargin=60;
			    param2.gravity=Gravity.CENTER_VERTICAL;
			    tv2.setLayoutParams(param2); 
			
			    
			    TableLayout.LayoutParams tablerowParam = new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
			    		ViewGroup.LayoutParams.MATCH_PARENT,
			    		1);
			    //tablerowParam.width=680;
			    tablerowParam.topMargin=20;
			    
			    
			    
			    tablerow.setLayoutParams(tablerowParam); 
			    tablerow.setBackgroundColor(Color.WHITE);
			   
			    
			    tablerow.addView(tv1);
			    tablerow.addView(tv2);
			    tableLayout.addView(tablerow);
		}
		
		
	    
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mylist, menu);
		return true;
	}

}
