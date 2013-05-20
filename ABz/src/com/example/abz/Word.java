package com.example.abz;

public class Word {

	private String nameWord;
	private String soundSpanish;
	private String soundEnglish;
	private String soundAymara;
	private String image;
	
	

	public Word(String nameWord) {
		super();
		this.nameWord = "  "+nameWord;
		nameWord = nameWord.toLowerCase();
		soundAymara = nameWord+"_aymara";
		soundEnglish=nameWord+"_english";
		soundSpanish= nameWord;
		image ="ic_"+nameWord;
		
	}

	public String getNameWord() {
		return nameWord;
	}

	public void setNameWord(String nameWord) {
		this.nameWord = nameWord;
	}

	public String getSoundSpanish() {
		return soundSpanish;
	}

	public void setSoundSpanish(String soundSpanish) {
		this.soundSpanish = soundSpanish;
	}

	public String getSoundEnglish() {
		return soundEnglish;
	}

	public void setSoundEnglish(String soundEnglish) {
		this.soundEnglish = soundEnglish;
	}

	public String getSoundAymara() {
		return soundAymara;
	}

	public void setSoundAymara(String soundAymara) {
		this.soundAymara = soundAymara;
	}
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
