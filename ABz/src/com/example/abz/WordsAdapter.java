package com.example.abz;

import java.util.ArrayList;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class WordsAdapter extends BaseAdapter {

	private ArrayList<Word> words;
	
	public WordsAdapter (ArrayList<Word> words) {
		this.words = words;
		notifyDataSetChanged();
	}
	@Override
	public int getCount() {
		return words.size();
	}

	@Override
	public Object getItem(int position) {
		return words.get(position);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		WordView view;
		if (convertView == null) //NO existe, creamos uno
			view = new WordView(parent.getContext());
		else					//Existe, reutilizamos
			view = (WordView) convertView;
		
		view.setWord(words.get(position));
		
		return view;
	}
	
}
