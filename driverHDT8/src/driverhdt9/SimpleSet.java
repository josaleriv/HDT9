/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverhdt9;

/**
 *
 * @author Jose Alejandro Rivera, 14213; Marcos Benedict, 14368; Gabriel Martinez, 14070; Arturo Garcia, 14186.
 */
import java.util.ArrayList;

class SimpleSet implements WordSet
{
	private ArrayList<Word> base;
	
	public SimpleSet(){
		base = new ArrayList<Word>();
	}
	
	public Word get(Word word){
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject){
		base.add(wordObject);
	}
}