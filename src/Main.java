import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        CreateRecord record = new CreateRecord();

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println(
                    "===============\n"+
                    "Enter Options:\n" +
                    "1-Create Lab\n" +
                    "2-Search Lab\n" +
                    "3-Update Lab\n" +
                    "4-List Labs\n" +
                    "5-Delete Lab\n" +
                    "6-Exit Program"
            );
            int userInput = input.nextInt();

            switch (userInput){
                case 1:
                    record.createLab("Ahmed","Hassan",50);
                    break;
                case 2:
                    RUDRecord.RUD(false,true,false,false);
                    break;
                case 3:
                    RUDRecord.RUD(false,true,true,false);
                    break;
                case 4:
                    RUDRecord.RUD(true,false,false,false);
                    break;
                case 5:
                    RUDRecord.RUD(false,true,false,true);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid Value");
            }
        }


    }
}
