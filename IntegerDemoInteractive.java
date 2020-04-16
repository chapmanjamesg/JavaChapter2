import java.util.Scanner;

public class IntegerDemoInteractive{
    public static void main(String[] args) {
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer>> ");
        anInt = input.nextInt();
        System.out.println("Please enter an byte>> ");
        aByte = input.nextByte();
        System.out.println("Please enter an short>> ");
        aShort = input.nextShort();
        System.out.println("Please enter an long>> ");
        aLong = input.nextLong();

        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);
    }
}