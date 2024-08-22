// Write a Java program that checks if a predefined number is odd or even. Use an if-else statement and the modulus operator (%) to determine whether the number is divisible by 2 or not. 
class OddEvenNumber {
    public static void main(String[] args) {
        
        int b = 29;
        
        if(b % 2 ==0){
            System.out.println(b + " is even number");
        }
        else{
            System.out.println(b + " is odd number");
        }
    }
}