import java.util.Scanner;


public class Converter {  
public static void main(String[] args) {

    float n1;
    float n2;
    float n3;
    float cal;
    float fah;
    float newTemp;

    Scanner sc= new Scanner(System.in);
    
    System.out.println("Select Operations : ");
    System.out.println("1- celsius");
    System.out.println("2- Fahrenheit");

    System.out.println("select Number:");
    n1= sc.nextFloat();

    if(n1==1){
        System.out.println("Enter celsius:");
        Scanner r= new Scanner(System.in);
        n2=r.nextFloat();
        cal=(n2 * 9/5)+32;
        System.out.println("farhenheit Value:"+cal);
        r.close();

    }else if (n1==2) {
        System.out.println("Enter Farhenheit:");
        Scanner s=new Scanner(System.in);
        n3=s.nextFloat();
        fah=(n3-32)*5/9;
        System.out.print("Celsius value:- "+fah);
    }

    System.out.println("Conversion Successfull.!!");
    
}

}
