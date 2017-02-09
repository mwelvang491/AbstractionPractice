/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForceUsersAbstraction;

/**
 *
 * @author mitchell
 */
public class Jedi extends ForceUsers {
    String name;
    int midichlorianCount; 
    String forceAblities[];

    public Jedi(String name, int midichlorianCount) {
        this.name = name;
        this.midichlorianCount = midichlorianCount;
    }
    
    
    
     public void meditate(int lengthOfTime, String timeInterval){
     
         System.out.println("You Meditate For"+ lengthOfTime + timeInterval);
     };
     
  @Override
      public void praticeUsingForcePowers(String name, ForceAbility forceAbility, int lengthOfTime, String timeInterval){
    
        System.out.println( name + " Practiced Using " 
            + forceAbility.getName() + " For " + lengthOfTime + " " + timeInterval);
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMidichlorianCount() {
        return midichlorianCount;
    }

    public void setMidichlorianCount(int midichlorianCount) {
        this.midichlorianCount = midichlorianCount;
    }
 
    
}
