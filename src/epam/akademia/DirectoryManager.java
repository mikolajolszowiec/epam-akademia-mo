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
public class DirectoryManager {
    
    public String getStartingPath(){
        String returnString = System.getProperty("user.dir").replace("\\","/");
        return returnString;
    }
    
    public boolean ifFolderExists(String folder){
        
        return true;
    }
    
    public String goToFolder(String folder){
        
        return folder;
    }
    
    public String goUp(String folder){
        String[] newArrayPath = folder.split("/");
        String returnPath = newArrayPath[0];
        
        for(int i=1; i<newArrayPath.length-2; i++){
            returnPath ="/"+ newArrayPath[i];
        }
        return returnPath;
    }
}
