// // import java.util.Scanner;
// // public class variables {
// //     public static void main(String[]args){
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter the value a: ");
// //         int a = sc.nextInt();
// //         System.out.print("Enter the value b: ");
// //         int b = sc.nextInt();
// //         if(a>b){
// //             System.out.print("a greater than b");

// //         }
// //         else{
// //             System.out.print("b greater than a");
// //         }

// //     }
    
// // }
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
//         System.out.print("Enter the value a:");
//         int a = sc.nextInt();
//         System.out.print("Enter the value b");
//         int b = sc.nextInt();
//         System.out.print("Enter the value c");
//          int c = sc.nextInt();
//         if(a>b&&a>c){
//         System.out.print("a is greater");

//         }

//         else if(b>a&&b>c){
//             System.out.print("b is greater");
//         }
//         else{
//             System.out.print("c is greater");
//         }
//     }
// }

import java.util.Scanner; 
public class conditions{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter mark 1");
        int m1=sc.nextInt();
        System.out.print("Enter mark 2");
        int m2 = sc.nextInt();
        System.out.print("Enter mark 3");
        int m3 = sc.nextInt();
        System.out.print("Enter mark 4");
        int m4 = sc.nextInt();
        System.out.print("Enter mark 5");
        int m5 = sc.nextInt();
        // int total = m1+m2+m3+m4+m5;
        // double average = total/5;

        double average = (m1 + m2 + m3 + m4 + m5)/5.0;
        // System.out.println("Total marks: " + average);
        System.out.println("Average marks is: "+average);
       if(average >= 90){
        System.out.println("Grade A");
       }
       else if(average >=80 && average <90){
        System.out.println("Grade B");
       }
       else if (average >=70 && average <80) {
        System.out.println("Grade C");
    } else if(average >=60 && average <70 ) {
        System.out.println("Grade D");
    } 
    else if(average >=50 && average <60){
        System.out.println("Grade E");
    }
    else{
        System.out.println("Grade F");
    }
    
    }
    }
