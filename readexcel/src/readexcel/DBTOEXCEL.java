package readexcel;

import java.io.*;
import java.sql.*;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DBTOEXCEL 
{
	public static void main(String[] args) 
	{
		try 
		{
			String filename="data.xls";
			 XSSFWorkbook workbook = new XSSFWorkbook();
			 XSSFSheet sheet = workbook.createSheet(filename);

			Row rowhead = sheet.createRow((short) 0);
			rowhead.createCell((short) 0).setCellValue("ID");
			rowhead.createCell((short) 1).setCellValue("Name");
			rowhead.createCell((short) 2).setCellValue("SALARY");
			rowhead.createCell((short) 3).setCellValue("DEPARTMENT");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from employee");
			int i = 1;
			while (rs.next()) 
			{
				Row row = sheet.createRow((short) i);
				row.createCell((short) 0).setCellValue(Integer.toString(rs.getInt(1)));
				row.createCell((short) 1).setCellValue(rs.getString(2));
				row.createCell((short) 2).setCellValue(rs.getString(3));
				row.createCell((short) 3).setCellValue(rs.getString(4));
				
				i++;
			}
			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			fileOut.close();
			System.out.println("Your excel file has been generated!");

		} catch (Exception ex) {
			System.out.println(ex);

		}
	}
}