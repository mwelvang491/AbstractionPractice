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
public class Startup {
    
    public static void main(String[] args) {
        
        Jedi jedi = new Jedi("Luke", 15000);
        ForceAbility fAbility = new ForceAbility("Force Push", "You Push");
        
        jedi.praticeUsingForcePowers(jedi.getName(), fAbility, 2 ,"Hours");
        
    }
}
