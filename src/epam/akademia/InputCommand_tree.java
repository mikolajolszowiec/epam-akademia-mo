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
public class InputCommand_tree extends Command {
    
    public InputCommand_tree(StateManager sm){
        super("tree", sm);
        
    }
    
    public void executeCommand(String command){
        //System.out.println("execute "+command);
        //String returnString = stateManager.getPath();
        
        File file = new File(stateManager.getPath());
        this.getChild(file, 0);
        /*while(file.list().length){
        }*/
        
    }
    
    public void getChild (File inputFile, int i){
        
        String returnString = "";
                for(int j=0; j<i; j++){
                    returnString+="-";
                }
                System.out.println(returnString+inputFile.getName());
                
        File[] files = inputFile.listFiles();
        for(File file : files){
            if(file.isDirectory()){
                getChild(file, i+1);
                
            }
        }
    }
}
