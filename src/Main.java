import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        Random random = new Random();

        System.out.println("Массивтин узундугу канча болуш керек");
        int length = scanner.nextInt();

        System.out.println("Массивтин канйсы элементин тандайсыз");
        int choose = scanner.nextInt();


        int[] array = new int[choose];

        for (int i = 0; i < array.length ; i++) {
          array[i]= random.nextInt(10);
            System.out.print(array[i] +" ");
        }
        try {
            System.out.println("\n_________________");
            System.out.println(array[choose]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("I've done");
        }

//        if (choose > array.length){
//            MyException myException = new MyException("Массивде кандай индексте элементи жок");
//            throw myException;
//        }else {
//            System.out.println("\n_____________________");
//            System.out.println([choose]);
//        }
    }
}