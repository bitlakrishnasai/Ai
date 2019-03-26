import  java.sql.*;
public class jdbc1 {
    public static void main(String[] args) throws Exception{

        String url="jdbc:mysql://localhost:3306/jdbc1";
        String user="krishna";
        String password="krishna23";
        String query="select sname from student where rollNumber=2";


        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection(url,user,password);
        Statement st= connect.createStatement();
        ResultSet result = st.executeQuery(query);

        result.next();
        String name=result.getString("sname");

        System.out.println(name);

        st.close();
        connect.close();
    }
}
