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
public class InputManager {
    
    public String readString(){
        
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
}
