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
    //String name;
   // int midichlorianCount; 
   // String forceAblities[];
     
     public void meditate(int lengthOfTime, String timeInterval){
     
         System.out.println("You Meditate For"+ lengthOfTime + timeInterval);
     };
     
  @Override
     public void praticeUsingForcePowers(int lengthOfTime, ForceAbility forceAbility, String timeInterval ){
    
        System.out.println("You Practice Using " 
            + forceAbility.getName() + " For " + lengthOfTime + " " + timeInterval);
    };
 
    
}
