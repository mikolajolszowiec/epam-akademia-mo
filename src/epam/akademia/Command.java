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
abstract public class Command{
    
    private String commandString;
    protected StateManager stateManager;
    
    public Command(String name, StateManager sm){
        commandString = name;
        stateManager = sm;
    }
    
    public String getCommandString(){
        return commandString;
    }
    
    public boolean isCommandEqual(String command){
        if(command.equals(commandString)){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void executeCommand(String inputString){
        System.out.println("execute "+ inputString);
    }
}
