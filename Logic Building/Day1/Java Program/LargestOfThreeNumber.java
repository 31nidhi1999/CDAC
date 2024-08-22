// Write a Java program that finds and prints the largest of three predefined numbers using if-else statements. h.   
class LargestOfThreeNumber {
    public static void main(String[] args) {
        
        int first = 5;
        int second = 4;
        int third=10;
        
        if(first > second && first > third){
            System.out.println(first + " is the largest of all three");
        }
        else if(second > first && second > first){
            System.out.println(second + " is the largest of all three");
        }
        else {
            System.out.println(third + " is the largest of all three");
        }
    }
}