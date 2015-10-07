/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverhdt8;

/**
 *
 * @author joserivera
 */
import java.util.ArrayList;

class SimpleSet implements WordSet
{
	private ArrayList<Word> base;
	
	public SimpleSet()
	{
		base = new ArrayList<Word>();
	}
	
	public Word get(Word word)
	{
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}