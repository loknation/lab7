import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        for (int i = 0; i <6; i++){
            for(int j = 0; j <i; j++){
                System.out.printf("*");
            }
            System.out.println(" ");
        }
        for (int i = 6; i >0; i--){
            for(int j = 0; j <i; j++){
                System.out.printf("*");
            }
            System.out.println(" ");
        }
        for (int i = 0; i<6; i++){
            for (int j = 0; j<6; j++){
                System.out.printf("*");
            }
            System.out.println(" ");
        }
        //c to f and f to c\
        Scanner scanner = new Scanner(System.in);
        if (getCoF() == 'f'){
            System.out.println("enter your num");
            double celsius = 0.0;
            double fahrenheit;
            while (true){
                try{
                    fahrenheit = scanner.nextDouble();
                    break;
                }catch(Exception e){
                    scanner.nextLine();
                }
            }
            celsius = (fahrenheit - 32) / 1.8;
            System.out.println(celsius);
        }else{
            System.out.println("enter your num");
            double fahrenheit = 0.0;
            double celsius;
            while (true){
                try{
                    celsius = scanner.nextDouble();
                    break;
                }catch(Exception e){
                    scanner.nextLine();
                }
            }
            fahrenheit = (celsius * 1.8) + 32;
            System.out.println(fahrenheit);
        }

    }
    private static char getCoF(){
        Scanner scanner = new Scanner(System.in);
        char charechter = 'd';
        System.out.println("enter c or f");
        while (true) {
            try {
                charechter = scanner.nextLine().charAt(0);
                if (charechter == 'f'){
                    return 'f';
                }
            } catch (Exception e) {
                if (charechter == 'c'){
                    return 'c';
                }
            } finally {
                System.out.println("enter c or f");
            }
        }
    }
}
