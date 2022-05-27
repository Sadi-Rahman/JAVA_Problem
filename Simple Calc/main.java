import java.util.Scanner;
class main{ 
    public static void main(String[] args) {
    char type;
    double num1, num2, res;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your type: + - * / ");
    type =input.next().charAt(0);

    System.out.println("Enter your First Number: ");
    num1=input.nextDouble();
    System.out.println("Enter your Second Number: ");
    num2=input.nextDouble();
    
    switch(type){

        case '+' :
        res=num1+num2;
        System.out.println(num1 + "+" + num2 + "=" + res);
        break;

        case '-' :
        res=num1-num2;
        System.out.println(num1 + "-" + num2 + "=" + res);
        break;

        case '*' :
        res=num1*num2;
        System.out.println(num1 + "*" + num2 + "=" + res);
        break;

        case '/' :
        res=num1/num2;
        System.out.println(num1 + "/" + num2 + "=" + res);
        break;
    }

input.close();
    }
}