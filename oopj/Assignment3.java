import java.util.Scanner;

class Assignment3{

    void question1(){
        System.out.print("Enter integer value: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        double b=a;
        System.out.println("Integer: "+a);
        System.out.println("Double: "+b);
        sc.close();
    }

    void question2(){
        System.out.print("Enter double value: ");
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        int b=(int)a;
        System.out.println("Double: "+a);
        System.out.println("Integer: "+b);
        sc.close();
    }

    void question3(){
        int i = 123;
        double d = 123.456789;
        float f = 123.456f;
        System.out.println("int="+i+"; double="+d+"; float="+f);
        System.out.println("int + float= "+(i+f));
        System.out.println("int + double= "+(i+d));
        System.out.println("int - float: "+(i+f));
        System.out.println("int - double: "+(i-d));
        System.out.println("int * float: "+(i*f));
        System.out.println("int * double: "+(i*d));
        System.out.println("int / float: "+(i/f));
        System.out.println("int / double: "+(i/d));
    }

    void question4(){
        System.out.print("Enter integer value: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        double b=a;
        float f=a;
        System.out.println("Integer: "+a);
        System.out.println("Integer to Double: "+b);
        System.out.println("Integer to Float: "+f);
        sc.close();
    }

    public static void main(String[] args){
        Assignment3 ans=new Assignment3();
        ans.question1();
        ans.question2();
        ans.question3();
        ans.question4();
    }
}