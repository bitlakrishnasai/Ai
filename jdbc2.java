import java.sql.*;


public class jdbc2 {
    public static void main(String[] args)throws Exception {
        String url="jdbc:mysql://localhost:3306/jdbc1";
        String user = "krishna";
        String password = "krishna23";
        String query = "insert into student values(19,'akhil')";

//        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection(url,user,password);
        Statement st= connect.createStatement();
        int result = st.executeUpdate(query);

        System.out.println(result+" affected");


        connect.close();
        st.close();

    }
}
