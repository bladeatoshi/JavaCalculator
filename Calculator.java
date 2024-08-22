import java.util.Scanner;

class Calculator {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char defineMethod;
        System.out.println("Let's do the math!");

        num1 = sc.nextDouble();
        defineMethod = sc.next().charAt(0);
        double finalNum = 0;
        num2 = sc.nextDouble();

        switch(defineMethod){
            case '+':
            finalNum = num1 + num2;
            System.out.println(finalNum);
            break;
            case '-':
            finalNum = num1 - num2;
            System.out.println(finalNum);
            break;
            case '*':
            finalNum = num1 * num2;
            System.out.println(finalNum);
            break;
            case '/':
            finalNum = num1 / num2;
            System.out.println(finalNum);
            break;
            default:
            System.out.println("error");

        }
    }
}