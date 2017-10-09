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
    
    
    public CommandsManager(StateManager sM) {
        commands = new ArrayList();
        commands.add(new InputCommand_dir(sM));
        commands.add(new InputCommand_cd(sM));
        commands.add(new InputCommand_exit(sM));
        commands.add(new InputCommand_prompt(sM));
        commands.add(new InputCommand_statistic(sM));
        commands.add(new InputCommand_tree(sM));
    }
    
    public void inputCommand(String inputString){
        boolean correctCommand = false;
        for(Command command : commands)
        {
            //if(inputString.equals(command.getCommandString())){
            if(command.isCommandEqual(inputString)){
                command.executeCommand(inputString);
                correctCommand = true;
                break;
            }
        }
        if(!correctCommand){System.out.println("wrong command");}
    }
    
}
