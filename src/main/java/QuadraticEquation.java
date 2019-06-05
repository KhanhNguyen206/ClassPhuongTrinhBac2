import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }

    public double getDiscriminant(){
        return (this.b*this.b)-4*this.a*this.c;
    }
    public double getRoot1(){
        return (-this.b+ Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
    }
    public double getRoot2() {
        return (-this.b - Math.pow(this.getDiscriminant(),0.5)) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("ax2 + bx + x = 0");
        System.out.println("Enter a: ");
        double a=scanner.nextDouble();
        System.out.println("Enter b: ");
        double b=scanner.nextDouble();
        System.out.println("Enter c: ");
        double c=scanner.nextDouble();

        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant()<0){
            System.out.println("The equation has no roots");
        }
        if (quadraticEquation.getDiscriminant()== 0){
            System.out.println("The equation has one root " + quadraticEquation.getRoot1());
        }
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("The equation has two roots" + quadraticEquation.getRoot1()
                    +" & "+ quadraticEquation.getRoot2());
        }
    }
}
