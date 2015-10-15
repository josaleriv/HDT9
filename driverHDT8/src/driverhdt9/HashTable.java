/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverhdt9;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Jose Alejandro Rivera, 14213; Marcos Benedict, 14368; Gabriel Martinez, 14070; Arturo Garcia, 14186.
 */
class HashTable implements WordSet   
{
    Hashtable<String, String> hush = new Hashtable<String, String>();
    public void add(Word wordObject) {
        hush.put(wordObject.getWord(),wordObject.getType());
    }

    @Override
    public Word get(Word word) {
        hush.containsValue(word.getWord());
        if(hush.containsKey(word.getWord())==true){
            Word verdad=new Word();
            verdad.setWord(word.getWord());
            verdad.setType(hush.get(word.getWord()));
            return verdad;
        }else{
            return null;
        }
    }
}
