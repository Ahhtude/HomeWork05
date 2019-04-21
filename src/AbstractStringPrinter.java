import java.util.Scanner;

public abstract class AbstractStringPrinter {

    static void print(String str) {
        System.out.println(str);
    }

    static void UpperStringPrinter(String str){
        System.out.println(str.toUpperCase());
    }
    static void LowerStringPrinter(String str){
        System.out.println(str.toLowerCase());
    }

}


class StringPrinterDemo extends AbstractStringPrinter{
    public static void main(String[] args) {
        print("Please enter some stringForProcess: ");
        Scanner scanner = new Scanner(System.in);
        String stringForProcess = scanner.nextLine();
        print("Please enter stringForProcess printer type (U - upper, L - lower)");
        String choise = scanner.nextLine();
        if (choise.equals("U")){
            UpperStringPrinter(stringForProcess);
        }
        else if (choise.equals("L")){
            LowerStringPrinter(stringForProcess);
        }
        else {
            System.out.println("Error");
        }


    }
}
