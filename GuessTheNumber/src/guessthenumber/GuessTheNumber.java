package guessthenumber;

/**
 *
 * @author cuauhtlahuac
 */
public class GuessTheNumber {

    public static void howBigIsMyNumber(int x) {  // Static basically means that you don't need an instance to use this method
        if(x >= 0 && x <= 10){
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100){
            System.out.println("Our number is pretty Big");
        } else {
            System.out.println("Our number is out of range");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        howBigIsMyNumber(0);
        howBigIsMyNumber(11);
        howBigIsMyNumber(-1);
        howBigIsMyNumber(101);
        howBigIsMyNumber(05);
        howBigIsMyNumber(75);
        
    }
    
}
