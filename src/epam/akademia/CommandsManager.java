/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam.akademia;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class CommandsManager {
    
    private ArrayList<Command> commands;
    
    
    public CommandsManager() {
        commands.add(new InputCommand_dir());
        
    }
    
    public void inputCommand(String inputString){
        for(Command commands : commands)
        {
        
        }
    }
    
}
