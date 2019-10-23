package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DataImportor {
    private String dataDir;

    public DataImportor(String dataDir) {
        this.dataDir = dataDir;
    }

    public List<String> importData(String fileName) throws Exception {
        String encoding = "UTF-8";
        File file = new File(dataDir+"\\"+fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];

        FileInputStream in = new FileInputStream(file);
        in.read(filecontent);
        in.close();

        String context = new String(filecontent, encoding);
        StringTokenizer st = new StringTokenizer(context, ",- $'.;\t\n\r");

        List<String> list = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        return list;
    }
}
