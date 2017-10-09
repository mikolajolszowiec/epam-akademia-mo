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
public class InputCommand_prompt extends Command {
    
    public InputCommand_prompt(StateManager sm){
        super("prompt", sm);
        
    }
    
    public boolean isCommandEqual(String command){
        String[] arrayString = command.split(" ");
        if(arrayString[0].equals(this.getCommandString()) && arrayString.length==2){return true;}
        return false;
    }
    
    public void executeCommand(String command){
        System.out.println("execute "+command);
    }
}
