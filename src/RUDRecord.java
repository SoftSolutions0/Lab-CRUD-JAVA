import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RUDRecord {

    public RUDRecord() throws FileNotFoundException {}


    public static void RUD(boolean read, boolean search, boolean update, boolean delete) throws IOException {
        File file1 = new File("Labs.dat");
        Scanner fileReader = new Scanner(file1);

        String data[] = new String[200];
        String line = null;
        int counter = 0;
        while(fileReader.hasNextLine()){
            line = fileReader.nextLine();
            data[counter] = line;
            counter++;
        }


            if(read || search || update || delete){
                Scanner input = new Scanner(System.in);
                String userString=null;

                if(search) {
                    System.out.printf("%nEnter Name of Lab:%n->");
                    userString = input.nextLine();
                }

                for (int i = 0;i<counter;i+=3) {

                    if(read){
                        for(int r=0;r<counter;r++) {
                            System.out.println(data[r]);
                            if(r%3==2){
                                System.out.println("======");
                            }
                        }
                        read = false;
                    }

                    if(search && data[i].split(" ")[1].equalsIgnoreCase(userString)){
                        System.out.println("Lab Found");
                    if(update){
                        System.out.printf("%nEnter New Name:%n->");
                        String labName = input.nextLine();
                        data[i] = "Lab-Name: "+labName;

                        FileWriter labsDataUpdate = new FileWriter(file1);
                        for(int j=0;j<counter;j++) {
                            labsDataUpdate.write(data[j]+"\n");
                        }
                        labsDataUpdate.close();
                        System.out.println("Lab-Name Updated");
                        break;
                    }
                    if(delete){
                            data[i]=null;
                            data[i+1]=null;
                            data[i+2]=null;
                            FileWriter labsDataDelete = new FileWriter(file1);
                            for(int j=0;j<counter;j++) {
                                if(data[j]!=null) {
                                    labsDataDelete.write(data[j] + "\n");
                                }
                            }
                            labsDataDelete.close();
                            System.out.println("Lab Deleted");
                            break;
                        }
                    break;
                    }


                    }
            }

    }

}
