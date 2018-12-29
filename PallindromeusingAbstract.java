import java.util.Scanner;

abstract class PallindromeusingAbstract {
    abstract String pallindrome();
}
class A extends PallindromeusingAbstract {
    String pallindrome() {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String rev = new StringBuffer(n).reverse().toString();
        if (String.valueOf(n).compareTo(String.valueOf(rev)) == 0) {
            System.out.println("Pallindrome");
        }return n;
    }

    static class Abstract {
        public static void main (String args[]){
            PallindromeusingAbstract A=new A();
            System.out.println(A.pallindrome());
            }
        }
    }
