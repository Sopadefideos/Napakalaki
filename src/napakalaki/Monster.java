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
public class Monster {
    private String name;
    private int combatLevel;
    private Prize prize;
    private BadConsequence badconsequence;
    public Monster(String name, int level, BadConsequence bc, Prize prize){
    }
    
    

   int getcombatLevel(){
      return combatLevel;

  
   }
    Prize getprize(){
      return prize;
 
   }
    BadConsequence getbadconsequence(){
      return badconsequence;
}
    
    
 public String toString(){
       return "name="+(name) + "combatLevel="+Integer.toString(combatLevel)+ "prize="+(prize)+"badconnsequence="+(badconsequence);
                }
    
    
    
    
    
    
    
   }      
   
   
   
   
   
   
   
  
