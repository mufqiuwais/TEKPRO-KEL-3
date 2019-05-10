/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttest123github;
import java.util.Scanner;
/**
 *
 * @author Fadhil
 */
public class ProjectTest123GitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Bisakah kalian melihat source code ku\n\n1.ya\n2.Tidak\n\nJawaban : ");
        int masukkan = scan.nextInt();
        switch(masukkan)
        {
            case 1:
                System.out.println("Wah Pinter Euy");
                break;
            case 2:
                System.out.println("GitHub na Error Euy!!");
                break;
            default:
                break;
        }
        
        
    }
    
}
