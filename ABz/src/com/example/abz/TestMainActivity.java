package com.example.abz;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class TestMainActivity extends Activity {
	ImageView[] imagenes = new ImageView[3];
	int numeroLetras = 3;
	char letraActual;
	char[] alternativasLetras = new char[numeroLetras];
	//int idSoundG = getResources().getIdentifier("good", "raw", getPackageName());

	MediaPlayer soundWord;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_main);
		imagenes[0] = (ImageView) findViewById(R.id.alternativa1);
		imagenes[1] = (ImageView) findViewById(R.id.alternativa2);
		imagenes[2] = (ImageView) findViewById(R.id.alternativa3);
		ActualizarAlternativas();
	}

	private void ActualizarAlternativas() {
		int letra = (int) (Math.random() * 26 + 97);
		while ((char) letra == 'n')
			letra = (int) (Math.random() * 26 + 97);
		letraActual = (char) letra;
		Log.v("LETRA","ES " +letra);
		String sLetra = "" + letraActual;

		alternativasLetras = generarLetras(letraActual);
		alternativasLetras[(int) (Math.random() * 3)] = letraActual;

		int idSound = getResources().getIdentifier(sLetra, "raw",
				getPackageName());
		soundWord = MediaPlayer.create(getApplicationContext(), idSound);
		soundWord.start();

		int idImage;
		for (int i = 0; i < numeroLetras; i++) {
			idImage = getResources()
					.getIdentifier("ic_" + alternativasLetras[i], "drawable",
							getPackageName());
			imagenes[i].setImageResource(idImage);
		}
	}

	private char[] generarLetras(char letra) {
		int pLetra;
		char[] letras = new char[numeroLetras];
		for (int i = 0; i < numeroLetras; i++) {
			pLetra = (int) (Math.random() * 26 + 97);
			Log.v("Random"," Prob "+pLetra);
			if ((char) pLetra == 'n' || (char) pLetra == letra) {
				i--;
			} else {
				letras[i] = (char) pLetra;
			}
		}
		return letras;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_test_main, menu);
		return true;
	}

	public void opcion1(View v) {
		if (alternativasLetras[0] == letraActual) {
			soundWord.stop();
//			soundWord = MediaPlayer.create(getApplicationContext(), idSoundG);
			ActualizarAlternativas();
		} else {
//			soundWord.stop();
//			soundWord = MediaPlayer.create(getApplicationContext(), idSoundB);
//			soundWord.start();
			Log.v("Alternativa Incorrecta", "Alternativa incorrecta");
		}
	}

	public void opcion2(View v) {
		if (alternativasLetras[1] == letraActual) {
			soundWord.stop();
			ActualizarAlternativas();
		} else {
			Log.v("Alternativa Incorrecta", "Alternativa incorrecta");
		}
	}

	public void opcion3(View v) {
		if (alternativasLetras[2] == letraActual) {
			soundWord.stop();
			ActualizarAlternativas();
		} else {
			Log.v("Alternativa Incorrecta", "Alternativa incorrecta");
		}
	}
}
