import java.util.Scanner;

public class ArrayProcessing {

        public static void main(String[] args) {

            int[] arrInt = new int[10];


            System.out.println("Default value of an array");
            for(int i=0;i<arrInt.length;i++) {
                System.out.print(arrInt[i]);
                System.out.print(",");
            }



            arrInt[0]=10;
            arrInt[1]=200;
            arrInt[2]=108;
            arrInt[3]=40;
            arrInt[4]=104;
            arrInt[5]=150;
            arrInt[7]=100;
            arrInt[8]=108;
            arrInt[9]=105;
            System.out.println();

            System.out.println("array value in static");
            for(int i=0;i<arrInt.length;i++) {
                System.out.print(arrInt[i]);
                System.out.print(", ");
            }



            for(int i=0;i<args.length && i<arrInt.length;i++){
                arrInt[i]=Integer.parseInt(args[i]);
            }
            System.out.println();
            System.out.println("command line value");
            for(int i=0;i<arrInt.length;i++) {
                System.out.print(arrInt[i]);
                System.out.print(", ");
            }





            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter the 10 number");
            for (int i = 0; i < arrInt.length; i++) {
                arrInt[i]=sc.nextInt();

            }
           // System.out.println("Array using Scanner Array");
            System.out.println("Array  with user input");
            for(int i=0;i<arrInt.length;i++) {
                System.out.print(arrInt[i]);
                System.out.print(",");
            }
            System.out.println();



            double sum=0;
            for (int i = 0; i < arrInt.length; i++) {
                sum=sum+arrInt[i];

            }

            System.out.println("The Sum of the  array"+sum);

            double avg = (double)sum/10;
            System.out.println("The average values " + "" +avg);
        }
    }

