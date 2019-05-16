package Utils;

import cucumber.api.DataTable;
import cucumber.api.Transformer;
import cucumber.runtime.ParameterInfo;
import cucumber.runtime.table.TableConverter;
import cucumber.runtime.xstream.LocalizedXStreams;
import gherkin.formatter.model.Comment;
import gherkin.formatter.model.DataTableRow;
import org.omg.Dynamic.Parameter;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class ExcelDataToDataTable extends Transformer<DataTable> {

    @Override
    public DataTable transform(String value)
    {
        ExcelUtils reader = new ExcelUtils();
        List<List<String>> excelData = getExcelData(reader);
        List<DataTableRow> dataTableRows = getDataTableRows(excelData);
        DataTable table = getDataTable(dataTableRows);
        return table;

    }

    private DataTable getDataTable(List<DataTableRow> dataTableRows) {
        ParameterInfo parameterInfo = new ParameterInfo(null,null,null,null);
        TableConverter tableConverter = new TableConverter(new LocalizedXStreams(Thread.currentThread().getContextClassLoader()).get(Locale.getDefault()),parameterInfo);
        return new DataTable(dataTableRows,tableConverter);
    }

    private List<DataTableRow> getDataTableRows(List<List<String>> excelData) {
        List<DataTableRow> dataTableRows = new LinkedList<DataTableRow>();
        int line=1;
        for (List<String> list: excelData){
            Comment comment = new Comment("",line);
             DataTableRow tableRow = new DataTableRow(Arrays.asList(comment),list,line++);
             dataTableRows.add(tableRow);
         }
        return dataTableRows;
    }

    private List<List<String>> getExcelData(ExcelUtils reader) {
        List<List<String>> excelData = new LinkedList<List<String>>();
        try {
            excelData=reader.excelAsListOfList("addCompany");
        }
        catch(Exception e){
            e.printStackTrace();
             throw new RuntimeException(e.getMessage());
        }
        return excelData;
    }

}
