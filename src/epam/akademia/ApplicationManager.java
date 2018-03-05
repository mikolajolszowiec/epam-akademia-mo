package epam.akademia;


import epam.akademia.CommandsManager;
import epam.akademia.InputManager;
import epam.akademia.OutputManager;
import epam.akademia.StateManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ApplicationManager {
    
    public ApplicationManager()
    {
    
    }
    
    public void runShell()
    {
        
        StateManager stateManager = new StateManager();
        CommandsManager commandsManager = new CommandsManager(stateManager);
        InputManager inputManager = new InputManager();
        OutputManager outputManager = new OutputManager();
        
        while(true){
            System.out.println(stateManager.getPath());
            System.out.println("$>");
            //String userInput = scanner.nextLine();
            //System.out.println("User said: " + userInput);
            commandsManager.inputCommand(inputManager.readString());
            //System.out.println("User said: " + userInput);
            
            
        }
    }
    
}
