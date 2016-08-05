
package dz1;

import java.util.Scanner;

public class DZ1 {
  
    public static void main(String[] args) {
        
        int nVar1 = 0, nVar2 = 0, nVar3 = 0;
        float fVar4 = 0, fVar5 = 0, fVar6 = 0;
        byte bVar8 = 0, bVar9 = 0;
        String s1, s2;
        Boolean bool1, bool2;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter integer variable nVar1: ");
        nVar1 = scn.nextInt();
        System.out.print("Enter integer variable nVar2: ");
        nVar2 = scn.nextInt();
        
        nVar3 = nVar1 / nVar2;
        System.out.println("Integer result nVar1 / nVar2: nVar3 = " + nVar3);
        nVar3 = nVar1 + nVar2;
        System.out.println("Integer result nVar1 + nVar2: nVar3 = " + nVar3);
        nVar3 = nVar1 - nVar2;
        System.out.println("Integer result nVar1 - nVar2: nVar3 = " + nVar3);
        nVar3 = nVar1 * nVar2;
        System.out.println("Integer result nVar1 * nVar2: nVar3 = " + nVar3);
        nVar3 = nVar1 % nVar2;
        System.out.println("Integer result nVar1 % nVar2: nVar3 = " + nVar3);
        nVar3 = nVar1 = nVar2;
        System.out.println("Integer result nVar1 = nVar2: nVar3 = " + nVar3);
        
        fVar4 = (float)nVar1 / nVar2;
        System.out.println("Float result nVar1 / nVar2: fVar4 = " + fVar4);
        fVar4 = nVar1 % nVar2;
        System.out.println("Float result nVar1 % nVar2: fVar4 = " + fVar4);
        
        indent();
        
        System.out.print("Enter float variable fVar5: ");
        if (scn.hasNextFloat()){
            fVar5 = scn.nextFloat(); 
            System.out.println("Float variable: fVar5 = " + fVar5);
        } else {
           System.out.println("You have entered not float variable: ");
        }
        
        System.out.print("Enter float variable fVar6: ");
        if (scn.hasNextFloat()){
            fVar6 = scn.nextFloat();
            System.out.println("Float variable: fVar6 = " + fVar6);
        } else {
            System.out.println("You have entered not float variable: ");
        }
        
        fVar4 = fVar5 % fVar6;
        System.out.println("Float result fVar5 % fVar6: fVar4 = " + fVar4);
        
        indent();
             
        Scanner scn1 = new Scanner(System.in);
        
        System.out.print("Enter byte variable bVar8: ");
        if (scn1.hasNextByte()){
            bVar8 = scn1.nextByte();
            System.out.println("Byte bVar8 = " + bVar8);
        } else {
            System.out.println("You have entered not byte variable: ");
        }
        
        System.out.print("Enter byte variable bVar9: ");
         if (scn1.hasNextByte()){
            bVar9 = scn1.nextByte();
            System.out.println("Byte bVar9 = " + bVar9);
        } else {
            System.out.println("You have entered not byte variable: ");           
        }
         
        indent();
         
        Scanner scnStr = new Scanner(System.in);
        
        System.out.print("Enter String s1: ");
        s1 = scnStr.nextLine();
        System.out.print("Enter String s2: ");
        s2 = scnStr.nextLine();
        System.out.printf("String s1 %s & String s2 %s \n", s1, s2);
        System.out.println("String + String: " + s1 + " " + s2);
        System.out.println("String s1 + Int nVar1 : " + s1 + nVar1);
        
        indent();
        
        Scanner scnBool = new Scanner(System.in);
     
        
        System.out.println("Enter Boolean variable bool1 True or False");
        bool1 = scnBool.nextBoolean();
        System.out.println("Enter Boolean variable bool2 True or False");
        bool2 = scnBool.nextBoolean();
        
        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        
        
    }
    
    public static void indent (){
            System.out.println("");
            System.out.println("````````````````");
            System.out.println("");
        }
    
}
