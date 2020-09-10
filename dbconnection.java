import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class dbconnection {
    Connection con;
    Statement stmt;
 
    dbconnection(){
        try
        {
        	String s = "jdbc:mysql://localhost:3306/seriousstats?serverTimezone=UTC";
            con=DriverManager.getConnection(s,"root","");
            stmt = con.createStatement();  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
  boolean  Login(String username,String pass){
    try
    {
        boolean flag=false;
        String s=("select * from users");
        ResultSet rs=stmt.executeQuery(s);
        while(rs.next())
        {       	
            if(username.equals(rs.getString(3)) && pass.equals(rs.getString(4)) ){               
                   flag=true;
                   Login.name=rs.getString(2);
                   Login.points=rs.getString(5);
                   Login.charid=rs.getString(6);
                   Login.userid=rs.getString(1);
            }
       }
        return flag;
    }
    catch(Exception e)
    {
      System.out.println(e);
      return false;
    }
} 
  boolean signUp(String name,String username,String password){
	    try
	    {
	        boolean flag=false;
	        String s="insert into users(name, username,password, points, charid) values('"+name+"','"+username+"' , '"+password+"', '0','1')";
	        int rs=stmt.executeUpdate(s);
	        if (rs!=0)
	            flag=true;
	        return flag;
	    }
	    catch(Exception e)
	    {
	      System.out.println(e);
	      return false;
	    }
	} 
  boolean InsertResult(String userid,String rightans,String wrongans,String gameName,String userName,String gamepoints){
	    try
	    {
	        boolean flag=false;
	        String s1="INSERT INTO `result`(`UserId`, `Right`, `Wrong`, `Game`, `Name`, `Points`) VALUES ('"+userid+"','"+rightans+"' , '"+wrongans+"', '"+gameName+"','"+userName+"','"+gamepoints+"')";
	        
	        int rs=stmt.executeUpdate(s1);
	        if (rs!=0)
	            flag=true;
	        return flag;
	    }
	    catch(Exception e)
	    {
	      System.out.println(e);
	      return false;
	    }
	} 
  
  boolean  updatePoints(String points, String userid){
	  try
	  {
	      boolean flag=false;

	      String s="UPDATE users SET points='"+points+"' WHERE id ='"+userid+"'";
	      int rs=stmt.executeUpdate(s);
	      if (rs!=0)
	          flag=true;
	      return flag;
	  }
	  catch(Exception e)
	  {
	    System.out.println(e);
	    return false;
	  }
	 } 
  boolean  updateChar(String charid, String userid){
	  try
	  {
	      boolean flag=false;

	      String s="UPDATE users SET charid='"+charid+"' WHERE id ='"+userid+"'";
	      int rs=stmt.executeUpdate(s);
	      if (rs!=0)
	          flag=true;
	      return flag;
	  }
	  catch(Exception e)
	  {
	    System.out.println(e);
	    return false;
	  }
	 } 
  
String getPoints(String userid) throws SQLException{
	
	        String s=("select * from users where id='"+userid+"'");
	        ResultSet rs=stmt.executeQuery(s);
	        String points="0";
	        while(rs.next())
	        {
	            points=rs.getString(5);
	        	
	       }
	        return points;
	       
	    }
	   
ResultSet getResultsforUser(String userid) throws SQLException{
	
    String s=("select * from result where userid='"+userid+"'");
    ResultSet rs=stmt.executeQuery(s);
    return rs;
   
	}

boolean  TeacherLogin(String username,String pass){
	    try
	    {
	        boolean flag=false;
	        String s=("select * from teacher");
	        ResultSet rs=stmt.executeQuery(s);
	        while(rs.next())
	        {	        	
	            if(username.equals(rs.getString(3)) && pass.equals(rs.getString(4)) ){               
	                   flag=true;
	                   Login.Tname=rs.getString(2);     
	            }
	       }
	        return flag;
	    }
	    catch(Exception e)
	    {
	      System.out.println(e);
	      return false;
	    }
	} 
ResultSet getResultsforTeacher() throws SQLException{
	
    String s=("select * from result");
    ResultSet rs=stmt.executeQuery(s);
    return rs;
   
	}
}    