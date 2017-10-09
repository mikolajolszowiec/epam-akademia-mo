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
        commands = new ArrayList();
        commands.add(new InputCommand_dir());
        commands.add(new InputCommand_cd());
        commands.add(new InputCommand_exit());
        commands.add(new InputCommand_prompt());
        commands.add(new InputCommand_statistic());
        commands.add(new InputCommand_tree());
    }
    
    public void inputCommand(String inputString){
        boolean correctCommand = false;
        for(Command command : commands)
        {
            if(inputString.equals(command.getCommandString())){
                command.executeCommand();
                correctCommand = true;
                break;
            }
        }
        if(!correctCommand){System.out.println("wrong command");}
    }
    
}
