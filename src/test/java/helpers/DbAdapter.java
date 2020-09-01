package helpers;

import models.Playlist;

import java.sql.*;

public class DbAdapter {
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://104.237.9.33/dbkoel";
    private static final String USER = "dbuser04";
    private static final String PASSWORD = "pa$$04";

    private static Connection connection = null;
    private static Statement statement = null;

    public static Playlist getPlaylistById(int id){
        Playlist playlist=null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            statement = connection.createStatement();
            String sqlExpression = "select * from playlists p where id = "+id;

            ResultSet resultSet = statement.executeQuery(sqlExpression);

            while (resultSet.next()){
                String name = resultSet.getString("name");
                int playlistId = resultSet.getInt("id");
                playlist = new Playlist(playlistId,name);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found "+e.getMessage());
        } catch (SQLException e) {
            System.out.println("Problems with DB call "+e.getMessage());
        } finally {
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return playlist;
    }

}
