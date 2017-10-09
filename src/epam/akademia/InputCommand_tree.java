/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam.akademia;

/**
 *
 * @author User
 */
public class InputCommand_tree extends Command {
    
    public InputCommand_tree(){
        super("tree");
        
    }
    
    public void executeCommand(){
        System.out.println("execute tree");
    }
}
