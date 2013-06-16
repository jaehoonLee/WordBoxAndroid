package wordActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.wordboxnew.R;

public class WordActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_word);

		//Get From Server
		String WordTitle[] = {"Toefl","Toeic","Teps", "....."};
		int WordIDs[] = {1,2,3,4};
		
		//DB
		final String Words[] = {"apple", "bear", "pear", "jelly"};
		final String Means[] = {"»ç°ú", "°õ", "¹è", "Á©¸®"};

		TableLayout tableLayout1 = (TableLayout)findViewById(R.id.wordtablelayout);

		TableRow tablerow1 = new TableRow(this);
		TableRow tablerow2 = new TableRow(this);

		for(int i=0;i<WordTitle.length;i++){

			Button btn1 = new Button(this);
			TextView tv1 = new TextView(this);
			
			tv1.setText(WordTitle[i]);
			
			
			TableRow.LayoutParams buttonParams1 = new TableRow.LayoutParams(
					ViewGroup.LayoutParams.WRAP_CONTENT,
					ViewGroup.LayoutParams.WRAP_CONTENT);
			buttonParams1.topMargin=80;
			buttonParams1.leftMargin=40;
			

			//button ²Ù¹Ò
			btn1.setWidth(300);
			btn1.setHeight(300);
			btn1.setPadding(0, 0, 0, 50);
			btn1.setText(WordTitle[i]);
			btn1.setLayoutParams(buttonParams1);	
			btn1.setBackgroundResource(R.drawable.wordlist);
	
			

			btn1.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(WordActivity.this, TofleWordActivity.class);
					Bundle b = new Bundle();
					b.putStringArray("words", Words);
					b.putStringArray("means", Means);
					intent.putExtras(b);
					startActivity(intent);
				}
			});

			tablerow1.addView(btn1);
		}//for¹®ÀÇ ³¡




		for(int i=0;i<WordTitle.length;i++){

			Button btn1 = new Button(this);

			TableRow.LayoutParams buttonParams1 = new TableRow.LayoutParams(
					ViewGroup.LayoutParams.WRAP_CONTENT,
					ViewGroup.LayoutParams.WRAP_CONTENT);
			buttonParams1.topMargin=100;
			buttonParams1.leftMargin=40;

			//button ²Ù¹Ò
			btn1.setWidth(300);
			btn1.setHeight(300);
			btn1.setText(WordTitle[i]);
			btn1.setPadding(0, 0, 0, 50);
			btn1.setBackgroundResource(R.drawable.wordlist);
			btn1.setLayoutParams(buttonParams1);
			
			
			
			tablerow2.addView(btn1);
		}//for¹®ÀÇ ³¡

		tableLayout1.addView(tablerow1);//tablelayout¿¡ ³ÖÀ½
		tableLayout1.addView(tablerow2);
	}
}
