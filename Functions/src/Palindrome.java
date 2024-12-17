public class Palindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Value of n :");
//        int n = sc.nextInt();
//        System.out.print("Enter the value of r :");
//        int r = sc.nextInt();
//        System.out.println("Binomial coefficient is :" + bc(n,r));
//    }
//
//    public static double bc(int n, int r) {
//        int a=factn(n);
//        int b=factn(r);
//        int c=factn(n-r);
//        double bc=a/(b*c);
//        return bc;
//
//    }
//
//    public static int factn(int n) {
//        int fn = 1;
//        for (int i = 1; i <= n; i++) {
//            fn = fn * i;
//        }
//        return fn;
//    }
//
////    public static int factr(int r) {
////        int fr = 1;
////        for (int i = 1; i <= r; i++) {
////            fr = fr * i;
////        }
////        return fr;
////    }
////
////    public static int factnr(int n, int r)
////
////    {
////        int fnr = 1;
////        for (int i = 1; i <= (n - r); i++) {
////            fnr = fnr * i;
////        }
////        return fnr;
////    }
//    public static int sum(int a, int b) {
//        return a + b;
//    }
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//    public static float sum(float a,float b,float c){
//        return a + b + c;
//    }
//    public static float sum(float a,float b){
//        return a + b;
//    }
//    public static void main(String[] args) {
//        System.out.println(sum(5,6));
//        System.out.println(sum(5,6,7));
//        System.out.println();
//        System.out.println(sum( 2, 2));
//    }
//    public static int prim(int n){
//       int x=1;
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                x=0;
//            }
//        }
//        if(x==0){
//            return 0;
//        }else {
//            return 1;
//        }
//    }
//    public static void printPrim(int n){
//        for(int i=2;i<=n;i++){
//            int a=prim(i);
//            if(a==1){
//                System.out.print(i+" ");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        printPrim(n);
//    }
    //Binary to dec
//    public static void dectoBinary(int n){
//        int pow=0;
//        int dec=0;
//        while(n>0){
//            int rem=n%10;
//            dec=dec+(rem*(int)Math.pow(2,pow));
//            n=n/10;
//            pow++;
//        }
//        System.out.println(dec);
//    }
//    public static void main(String[] args) {
//        dectoBinary(1010);
//    }
    // Dec to binary
//    public static void DecToBinary(int n){
//        int temp = n;
//        int binary = 0;
//        int pow=0;
//        while(n>0){
//            int rem=n%2;
//            binary=binary+(rem*(int)Math.pow(10,pow));
//            pow++;
//            n=n/2;
//        }
//        System.out.println("binary of "+temp+" is :"+binary);
//    }
//    public static void main(String[] args) {
//        DecToBinary(5);
//    }
    //Question 1 : Write a Java method to compute the average of three numbers..
//    public static void average(int a,int b,int c){
//        System.out.println("Average is :"+(float)(a+b+c)/3);
//    }
//    public static void main(String[] args){
//        average(3,5,8);
//    }

    //Question 2 : Write a method named isEven that accepts an int argument.
    // The method should return true if the argument is even, or false otherwise.
    // Also write a program to test your method.
//    public static boolean isEven(int n){
//        if(n%2==0){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int a=sc.nextInt();
//        boolean t=isEven(a);
//        if(t==true){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }
//    }
    public static void palindrome(int n){
        int rem=0;
        int rev=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args){
        palindrome(321);
    }
}
