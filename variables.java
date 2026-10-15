import java.util.Scanner;
public class variables {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value b: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.print("a greater than b");

        }
        else{
            System.out.print("b greater than a");
        }

    }
    
}
// import java.util.Scanner;
// public class variables {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the value b: ");
//         int b = sc.nextInt();
// if (a>b) {
//  System.out.print("a greater than b");
// }
// else if(a<b){
// System.out.print("a less than b");
// }
//     else{
//    System.out.print(" a is equal than b");
// }
//     }
// }

// import java.util.Scanner;
// public class conditions{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int a = sc.nextInt();
//         if(a>0){
//             System.out.print("Enter the positive value");
//         }
//         else if(a<0){
//             System.out.print("Enter the negative value");
//         }
//         else{
//             System.out.print("Enter the zero value");
//         }
//     }
// }