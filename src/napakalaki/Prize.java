/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Rafa Alvarez
 */
public class Prize {
 private int    treasures, level;
 
 
 Prize(int treasures,int level){
 }
 
 int getTreasures(){
     return treasures;
 
 }
 int getLevel(){
     return level;
 
 }
 
 public String toString(){
       return "Treasures="+Integer.toString(treasures) + "levels="+Integer.toString(level);
                }
  
    }
 
 
 
 
 
 
 
 

