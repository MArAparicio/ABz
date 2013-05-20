package com.example.abz;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WordView extends LinearLayout{
	private TextView tOneNameWord;
	public WordView(Context context){
		super(context);
		inflate(context, R.layout.one_word, this);
		tOneNameWord= (TextView) findViewById(R.id.tOneWordName);
	}
	public void setWord(Word word){
		tOneNameWord.setText(word.getNameWord());
		
	}
}
