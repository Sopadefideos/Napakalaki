/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Rafa Alvarez
 */
public class BadConsequence {
  private String text;
  private int levels, nVisibleTreasures, nHiddenTreasures;
  private boolean death;

  private ArrayList<TreasureKind> specificHiddenTreasures= new ArrayList();
  private ArrayList<TreasureKind> specificVisibleTreasures= new ArrayList();
  

  public BadConsequence(String text, int levels, int nVisible, int nHidden){
  }
  public BadConsequence(String text, boolean death){
  }
  public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
  }
 
  
  
  String gettext(){
  return text;
  } 
  int getlevels(){
  return levels;
  }
  int getnVisibleTreasures(){
  return nVisibleTreasures;
  } 
  int getnHiddenTreasures(){
  return nHiddenTreasures;
  } 
  boolean getdeath(){
  return death;
  }
  
  
  
  
  public String toString(){
       return "text="+(text) + "levels="+Integer.toString(levels)+ "nVisibleTreasures="+Integer.toString(nVisibleTreasures)+"nHiddenTreasures="+(nHiddenTreasures)+"death="+(death);
                }
  
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
