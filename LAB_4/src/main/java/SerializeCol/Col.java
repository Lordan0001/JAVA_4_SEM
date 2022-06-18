package SerializeCol;

import Student.Student;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Col {
    public void SerializeCollection(ArrayList<Student> ar) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        for (int i = 0; i < ar.size(); i++) {
            File xmlOutput = new File("Newserialized.xml");
            FileWriter fileWriter = new FileWriter(xmlOutput,true);
            String str =xmlMapper.writeValueAsString(ar.get(i));
            fileWriter.write(str);
            fileWriter.close();

        }
    }

}
