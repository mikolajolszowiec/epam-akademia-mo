/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam.akademia;
import java.io.File;
/**
 *
 * @author User
 */
public class DirectoryManager {
    
    public String getStartingPath(){
        String returnString = System.getProperty("user.dir").replace("\\","/");
        return returnString;
    }
    
    public boolean ifFolderExists(String path, String folder){
        
        if (new File(path+ "/" + folder).isDirectory())
        {
            return true;
        }
        return false;
    }
    
    public String goToFolder(String path, String folder){
        String returnPath = path + "/" + folder;
        return returnPath;
    }
    
    public String goUp(String path){
        String[] newArrayPath = path.split("/");
        String returnPath = newArrayPath[0];
        
        for(int i=1; i<newArrayPath.length-1; i++){
            returnPath +="/"+ newArrayPath[i];
        }
        return returnPath;
    }
    
    public String getDirectory(String path){
        File file = new File(path);
        String[] names = file.list();
        String returnString = "";
        for(String name : names)
        {
            if (new File(path + "/" + name).isDirectory())
            {
                returnString += "DIR   "+ name + "\n";
            }
            else 
            {
                returnString += "FILE  "+ name + "\n";
            }
            
        }
        return returnString;
    }
}
