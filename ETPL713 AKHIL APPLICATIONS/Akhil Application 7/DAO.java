package Application9;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class DAO {
	Connection con=null;
	PreparedStatement pstmt=null;
	Statement stmt=null;
	public int createAccount(Bean b) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DBConnection.getConnection();
			String s1="insert into DB values(?,?,?)";
			pstmt=con.prepareStatement(s1);
			pstmt.setString(1,b.getDname());
			pstmt.setString(2,b.getDconcept());
			pstmt.setInt(3,b.getDtime());
			int rs=pstmt.executeUpdate();
			con.close();
			return rs;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public String showC(String name)
	{
		
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			String concept="";
			con=DBConnection.getConnection();
			String ins_str="select concept from DB where name=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setString(1, name);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				{
					concept=rs.getString(1);
				}
			con.close();
			return concept;
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return null;
		}
		
	}
	public void ShowD() throws Exception {
		Connection con=DBConnection.getConnection();
		   Statement stmt=con.createStatement();
			ResultSet rs1=stmt.executeQuery("Select * from DB");
			while(rs1.next()){
	            System.out.print("\nDay Name :" + rs1.getString(1));
	        	System.out.print("\t\tDay Concept:" + rs1.getString(2));
	            System.out.print("\tDay Time :" + rs1.getInt(3));
			}
			con.close();
			System.out.println("\n\n");
	}
	public int with(String name,String concept)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DBConnection.getConnection();
			String ins_str="update DB set concept=? where name=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setString(2, name);
			pstmt.setString(1, concept);
			int rs=pstmt.executeUpdate();
			con.close();
			return rs;
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return 0;
		}
	}
}










//try {
//	Connection con=DBConnection.getConnection();
//	Statement stmt=con.createStatement();
//	
//	ResultSet rs1=stmt.executeQuery("select * from DB ");
//	while(rs1.next()) {
//		System.out.println("Day Name:"+ stmt.getString(1));
//		System.out.println("Day Concept:"+  stmt.getString(2));
//		System.out.println("Day Time:"+  stmt.getInt(3));
//	}
//}catch(SQLException sq) {
//	System.out.println(sq);
//}con.close();
//	
//}
