/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam.akademia;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class EpamAkademia {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        CommandsManager commandsManager = new CommandsManager();
        
        while(true){
            System.out.print("$>");
            //String userInput = scanner.nextLine();
            //System.out.println("User said: " + userInput);
            String userInput = scanner.nextLine();
            System.out.println("User said: " + userInput);
            
            
        }
    }
    
}
