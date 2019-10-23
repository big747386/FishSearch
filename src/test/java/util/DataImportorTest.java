package util;

import org.junit.Test;

import java.util.List;

public class DataImportorTest {
    @Test
    public void testImportData() {
        DataImportor importor = new DataImportor("D:\\学校乱七八糟\\算法程序设计\\给学生\\题目B4的数据集");
        List<String> list = null;
        try {
             list = importor.importData("36.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (String item : list) {
            System.out.println(item);
        }
    }
}
