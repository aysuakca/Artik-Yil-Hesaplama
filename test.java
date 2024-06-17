import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int date;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Bir Yil Giriniz :");
        date = input.nextInt();

        if ((date % 4 == 0 && date % 100 != 0) || (date % 400 == 0)) {
            System.out.println(date + " bir artık yıldır.");
        } else {
            System.out.println(date + " bir artık yıl değildir.");
        }
    }
}
