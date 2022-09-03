
import java.lang.* ;
import java.util.Scanner;

class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1 ; i <=num ; i ++){

            String repeated = new String(new char[2*(num-i)]).replace("\0", "  ");
            String str = new String(new char[i]).replace("\0", "* ");
            System.out.print(str);
            System.out.print(repeated);
            System.out.println(str);
        }
        for(int i = num ; i >=1; i --){

            String repeated = new String(new char[2*(num-i)]).replace("\0", "  ");
            String str = new String(new char[i]).replace("\0", "* ");
            System.out.print(str);
            System.out.print(repeated);
            System.out.println(str);
        }
    }
}
