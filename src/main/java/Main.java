import java.sql.*;

/**
 * Created by darthMilash on 16.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null; //defend data
        ResultSet resultSet = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "darthmilash", "OracleEmptypass1992");
                if (!connection.isClosed()) {
                    System.out.println("Connect");
                }

                preparedStatement = connection.prepareStatement("INSERT INTO STUDENTS (STUDENT_ID, STUDENT_NAME, STUDENT_GROUP, STUDENT_MAIL) VALUES (NULL, ?, ?, ?)");
                preparedStatement.setString(1, "Onegin");
                preparedStatement.setString(2, "in-22");
                preparedStatement.setString(3, "sdadadfdsd@mail.ru");
                preparedStatement.execute();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
