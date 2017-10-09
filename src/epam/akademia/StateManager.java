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
public class StateManager {
    
    private String actualPath; 
    private DirectoryManager directoryManager;
    
    public StateManager(){
        directoryManager = new DirectoryManager();
        actualPath = directoryManager.getStartingPath();
    }
    
    public void setPath(String newPath){
        actualPath = newPath;
    }
    
    public String getPath(){
        return actualPath;
    }
    
    public boolean goUp(){
        actualPath = directoryManager.goUp();
    }
    
    public boolean goTo(String folder){
        if(directoryManager.ifFolderExists(folder))
        {
            directoryManager.goToFolder(folder);
            //actualPath = directoryManager.
        }
        else
        {
            System.out.println("Wrong path.");
        }
    }
    
}
