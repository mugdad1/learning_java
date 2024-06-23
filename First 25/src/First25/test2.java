//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package First25;

import java.util.Scanner;

/**
 *
 * @author mugdad
 *
 */

/*import java.util.Scanner;
*/
public class test2 {

    public static void main(String[] args) {
         int data[] = {3, 12, 4, 78, 4, 56, 8, 92, 5, 45, 6, 32, 0, 15, 7, 100, 0, 56, 2, 48, 0, 51, 0, 0, 25, 1, 86, 30, -1};
        int ctr = 0, even = 0, odd = 0, zero = 0;
        while(data[ctr] != -1){
            if(data[ctr]==0){
                zero++;
            }else if (data[ctr]%2 == 0){
                even++;
            }else{
                odd++;
            }
            ctr++;
        }
        System.out.println(even);
        System.out.println(odd);
        System.out.println(zero);
        System.out.println("all the numbers are "+ctr);
        
    }
 
}
/*
   
         float bmi, kilo , meters;
         System.out.println("enter weight in kilograms");
         Scanner scanner = new Scanner(System.in);
         kilo = scanner.nextFloat();
         System.out.println("enter hight in meters");
         meters = scanner.nextFloat();
         bmi = getbmi(kilo,meters);
         System.out.println("your body index is "+bmi);
    }         
         
public static  float getbmi(float kl , float met){
    float bmi;
    bmi = kl / (met * met);
    return bmi;
}

 */

 /*
        int n , sum=1;
        System.out.println("enter a positive number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("even nums from 1  to "+n+"\n");
        for (int counter = 0 ; 100 >counter; counter++){
            if(counter %2 ==0){
                System.out.print(counter+" ");
                sum+= counter;
                
            }
        }
        System.out.println("\n sum of all even nums is "+sum);
        
        
 */
 
 
