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

//	 Force User
//	      |
//       _______|__________
//      |                 |	
//    Jedi 	       Sith
//      |                 |
// _____|______	        |________________	
// |   	    |           |                |
//Padawon   Knight        Apprentice      Master



public class ForceUsers {
    String name;
    int midichlorianCount; 
    String forceAblities[];
    
    public void praticeUsingForcePowers(){};
    
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
