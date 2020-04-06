import java.util.Scanner;
class Ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 1){
            System.out.println("no army");
        }else if((n >= 1)||(n <= 19)){
            System.out.println("pack");
        }else if((n >= 20)||(n <= 249)){
            System.out.println("throng");
        }else if((n >= 250)||(n <= 999)){
            System.out.println("zounds");
        }else{
            System.out.println("legion");
        }
        // put your code here
    }
}
