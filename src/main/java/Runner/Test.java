package Runner;

import Utils.ExcelUtils;
import Utils.UiUtils;

import java.io.IOException;

public class Test {

    ExcelUtils utils= new ExcelUtils();
    public static void main(String args[]) throws IOException {
       // ExcelUtils u = new ExcelUtils();
        System.out.println(ExcelUtils.readExcel("Login").get("link_login").get(0));

        //String data = u.getProperties("url");
        //System.out.println(data);
    }
}
