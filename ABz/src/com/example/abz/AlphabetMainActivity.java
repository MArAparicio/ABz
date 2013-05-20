package com.example.abz;

import java.util.ArrayList;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class AlphabetMainActivity extends Activity {
	ImageView imageWord;
	ArrayList<Word> words = new ArrayList<Word>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alphabet_main);
		ListView list = (ListView) findViewById(R.id.listWords);
		
		imageWord = (ImageView) findViewById(R.id.imageWord);
		generateListWords();
		list.setAdapter(new WordsAdapter(words));
		list.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				int idSound = getResources().getIdentifier(
						words.get(position).getSoundSpanish(), "raw",
						getPackageName());
				MediaPlayer soundWord = MediaPlayer
						.create(getApplicationContext(), idSound);
				soundWord.start();
				int idImage = getResources().getIdentifier(
						words.get(position).getImage(), "drawable",
						getPackageName());
				imageWord.setImageResource(idImage);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alphabet_main, menu);
		return true;
	}
	private void generateListWords() {
		words.add(new Word("A"));
		words.add(new Word("B"));
		words.add(new Word("C"));
		words.add(new Word("D"));
		words.add(new Word("E"));
		words.add(new Word("F"));
		words.add(new Word("G"));
		words.add(new Word("H"));
		words.add(new Word("I"));
		words.add(new Word("J"));
		words.add(new Word("K"));
		words.add(new Word("L"));
		words.add(new Word("M"));
		//words.add(new Word("N"));
		words.add(new Word("O"));
		words.add(new Word("P"));
		words.add(new Word("Q"));
		words.add(new Word("R"));
		words.add(new Word("S"));
		words.add(new Word("T"));
		words.add(new Word("U"));
		words.add(new Word("V"));
		words.add(new Word("W"));
		words.add(new Word("X"));
		words.add(new Word("Y"));
		words.add(new Word("Z"));
	}
}
