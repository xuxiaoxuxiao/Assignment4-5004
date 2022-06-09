import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PassProtector {
    public static int [] ranNum = new int[10];
    public static int [] passEncrypt = new int[5];
    public static String realPass;

    public static void setRealPass(){
        System.out.println("Please enter your five-digit Pin number: ");
        Scanner input = new Scanner(System.in);
        realPass = String.valueOf(input.nextLine());
    }

    public static void randomGenerator(){
        Random number = new Random();
        for(int i =0; i < ranNum.length; i++){
            ranNum[i] = number.nextInt(3)+1;
        }
        System.out.println("Nums:   " + Arrays.toString(ranNum));
    }
    public static void getNum(){
        int [] array = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = i;
        }
        System.out.println("Digits: " + Arrays.toString(array));
    }
    public static void encrypt(String attempt){
        String [] attemptedPass = attempt.split("");
        for (int i = 0; i < attemptedPass.length;i++){
            int index = Integer.parseInt(attemptedPass[i]);
            passEncrypt[i] = ranNum[index];
        }
    }

    public static String getInput(){
        System.out.println("Please enter your five-digit encrypted code: ");
        Scanner randomCode = new Scanner(System.in);
        String inputPass = String.valueOf(randomCode.nextLine());
        return inputPass;

    }

    public static boolean verification(String inputPass){
        String [] userInput = inputPass.split("");
        if (userInput.length != 5)
            return false;
        for (int i = 0; i < 5; i++){
            if (Integer.parseInt(userInput[i]) != passEncrypt[i]){
                return false;
            }
        }
        System.out.println("Pass!");
        return true;
    }

    public static void main(String[] args) {
        boolean res = false;
        setRealPass();
        while(res == false){
            getNum();
            randomGenerator();
            encrypt(realPass);
            String inputPass = getInput();
            if (verification(inputPass)){
                res = true;
                break;
            }
            System.out.println("Wrong pass. Try again!");
        }
    }
}





