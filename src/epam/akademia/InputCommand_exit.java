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
public class InputCommand_exit extends Command {
    
    public InputCommand_exit(StateManager sm){
        super("exit", sm);
    }
    
    public void executeCommand(String command){
        System.out.println("Bye.");
        System.exit(0);
    }
}
