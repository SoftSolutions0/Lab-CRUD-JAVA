import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateRecord {
    File file1 = new File("Labs.dat");
    FileWriter labsData = new FileWriter(file1, true);

    public CreateRecord() throws IOException {

    }

    public void createLab(String labName, String labAttendant, int pcNumbers) throws IOException {
        labsData.write("Lab-Name: "+labName+"\n");
        labsData.write("Attendant-Name: "+labAttendant+"\n");
        labsData.write("No-of-Computers: "+pcNumbers+"\n");
        labsData.close();
        System.out.println("Lab-Created");
    }
}
