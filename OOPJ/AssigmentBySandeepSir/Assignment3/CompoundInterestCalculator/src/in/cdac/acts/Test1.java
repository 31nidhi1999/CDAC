import java.io.*;
import java.util.*;

class Fibonacci{
    
    static int n1  =0;
    static int n2 = 1;
    static int sum = 0;
    static int temp = 0;
    
    public void evailution(int n){
        for(int i = 2;i<=n;i++){
            sum = n1 + n2;
            temp = n1;
            n1=n2;
            n2=sum;
        }
        
    }
    
    public void display(){
        System.out.println(sum);
    }
    
    
}

 class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibonacci fb = new Fibonacci();
        fb.evailution(n);
        fb.display();
        
    }
}