//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package First25;

import java.util.Scanner;

/**
 *
 * @author mugdad
 * //Source Code
*/
 public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 15};
        
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("The largest number in the array is: " + max);
    }
}
/*
#include <iostream>
using namespace std;

int main()
{
  int n, i,  c, a = 1;
  
  cout << "Enter the number of rows of Floyd's triangle to print: ";
  cin >> n;

  for (i = 1; i <= n; i++)		//outer loop
  {
	 for (c = 1; c <= i; c++)	//inner loop
	 {
		cout << a << " ";
		a++;
	 }	//end of inner loop
	 cout << "\n";
  }	//end of outer loop

return 0;
}





public class test {
    public static void main(String[] args) {
        int i,c,a=1;
        System.out.println("\"Enter the number of rows of Floyd's triangle to print: \";");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int n = scanner.nextInt();
        for (i = 1 ; i<=n ; i++){
            for (c=1;c<=i ; c++){
                System.out.print(a+" ");
                a++;
            }
            System.out.print("\n");
        }
        
        
        
        
        
        
    }
    
}
*/