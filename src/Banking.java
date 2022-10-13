//import java.util.Scanner;
//
//public class Banking {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        String input ="";
//        String name = "";
//        String ctrlz = name;
//        do {
//            ctrlz = name;
//            System.out.println(">>");
//            input = sc.nextLine().toUpperCase();
//
//            if (input.equals("U")) {
//                ;
//                name = name.toUpperCase();
//            } else if (input.equals("L")) {
//                name = name.toLowerCase();
//            } else if (input.startsWith("C")) {
//                String[] three = input.split(" ");
//                name = name.replace(three[1], three[2]);
//                System.out.println(name);
//            } else if (input.equals("Z")) {
//                name = ctrlz;
//            }
//            while (!input.equals("X")) ;
//        }
//    }
//    }
