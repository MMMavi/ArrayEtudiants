/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayetudiants;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArrayEtudiants {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // initialiser tableaux
        String[] noms = new String[5];
        String[] prenoms = new String[5];
        double[] note1 = new double[5];
        double[] note2 = new double[5];

        int i = 0;
        while (i < 5) {
            System.out.println("entrer nom");
            noms[i] = sc.next();
            System.out.println("entrer prenom");
            prenoms[i] = sc.next();
            System.out.println("entrer note 1");
            note1[i] = sc.nextDouble();
            System.out.println("entrer note 2");
            note2[i] = sc.nextDouble();
           i++;

        }
        
/*
        // afficher tableau 
        for (i = 0; i < noms.length; i++) {
            System.out.println(" noms = " + noms[i]);
        }
        for (i = 0; i < prenoms.length; i++) {
            System.out.println(" prenoms = " + prenoms[i]);
        }
        for (i = 0; i < note1.length; i++) {
            System.out.println(" notes 1 = " + note1[i]);
        }
        for (i = 0; i < note2.length; i++) {
            System.out.println(" notes 2 = " + note2[i]);
        }
*/
      

       double[] moyenne = cMoyenne( note1 , note2);
       //System.out.println(Arrays.toString(moyenne));
        
       String [] grade = calculGrade(moyenne);
       
       afficher(noms, prenoms, grade);

    }

    static double[] cMoyenne(double[] x, double[] y)
    {
        
        int i = 0;
        
    // initialiser tableaux
        double[] moyenne = new double[5];
        
        while (i < 5)
        {
        moyenne [i]= (x[i] + y[i])/2;
        i++;
        }
        
        return moyenne;
    }
    
    static String[] calculGrade(double[] x) {
        String[] grade = new String[5];
        int i = 0;

        while (i < x.length) {
            if (x [i] > 60) {
                grade[i]= "succes";
            } else {
                grade[i] = "echec";
            }
            i++;

        }
        return grade;
    }

    static void afficher(String[] x, String[] y, String[] z) {

        for (int i = 0; i < x.length; i++) {
            System.out.println("NOM : " + x[i] + "\t" +  "PRENOM : " + y[i] + "\t" +  "GRADE : " + z[i]);
            
        }
    }
    
    
}
