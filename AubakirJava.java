import java.util.Scanner;

public class AubakirJava {
    public static void main(String[] args) {

        //Первое задание
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num>7){
            System.out.println("Привет");
        }

        //Второе задание
        Scanner in2 = new Scanner(System.in);
        String name = in2.nextLine();
        if (name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }
        else{
            System.out.println("Нет такого имени");
        }

        //Третье задание
        int myArray[] = new int []{5,7,134,45,43,6,76,123,345};
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] % 3 == 0) System.out.println(myArray[i]);
        }

    }
}
