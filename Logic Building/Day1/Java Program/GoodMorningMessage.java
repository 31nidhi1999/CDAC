// Write a Java program that displays a "Good Morning" message if the predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic.   
class GoodMorningMessage {
    public static void main(String[] args) {
        
        int time = 20;
        
        if(time >=5  & time <=12){
            System.out.println("Good Morning");
        }
        else if(time >12  & time <=16){
            System.out.println("Good Afternoon");
        }
        else if (time >16 & time <=24) {
            System.out.println("Good Evening");
        }
    }
}