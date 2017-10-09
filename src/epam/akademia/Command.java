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
    
    public Command(String name){
        commandString = name;
    }
    
    public String getCommandString(){
        return commandString;
    }
    
    public void executeCommand(){
        System.out.println("execute command");
    }
}
