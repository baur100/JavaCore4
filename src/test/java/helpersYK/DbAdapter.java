package helpersYK;

import ModelsYK.Albums;
import ModelsYK.Playlists;
import ModelsYK.Songs;
import models.Playlist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://104.237.9.33/dbkoel";
    private static final String USER = "dbuser04";
    private static final String PASSWORD = "pa$$04";

    private static Connection connection = null;
    private static Statement statement = null;

    public static Playlists getPlaylistById(int id){
        Playlists playlist1 = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM playlists p where id = "+id;
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()){
                String name = resultSet.getString("name");
                int playlistId = resultSet.getInt("id");
                playlist1 = new Playlists(playlistId, name);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e.getMessage());
        } catch (SQLException e){
            System.out.println("Error in call " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return playlist1;
    }

    public static List<Playlists> getAllPlaylist(int userId){
        List<Playlists> playlists = new ArrayList<>();
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM playlists p where user_id = "+userId;

            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()){
                String name = resultSet.getString("name");
                int playlistId = resultSet.getInt("id");
                Playlists playlist2 = new Playlists(playlistId, name);
                playlists.add(playlist2);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e.getMessage());
        } catch (SQLException e){
            System.out.println("Error in call " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return playlists;
    }

    public static List<Albums> getAllAlbums(){
        List<Albums> albums = new ArrayList<>();
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM albums a2";

            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()){
                String name = resultSet.getString("name");
                int albumId = resultSet.getInt("id");
                int artistId = resultSet.getInt("artist_id");
                Albums album = new Albums(albumId, artistId, name);
                albums.add(album);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e.getMessage());
        } catch (SQLException e){
            System.out.println("Error in call " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return albums;
    }

    public static List<Songs> getAllPlaylistSongs(int id){
        List<Songs> songsOfPlaylist = new ArrayList<>();
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            String sqlQuery = "select * from playlist_song ps JOIN songs s on ps.song_id = s.id where playlist_id = " + id;

            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()){
                String songId = resultSet.getString("song_id");
                String title = resultSet.getString("title");
                double length = resultSet.getDouble("length");
                String createdAt = resultSet.getString("created_at");
                Songs songInList = new Songs(songId, title, createdAt, length);
                songsOfPlaylist.add(songInList);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e.getMessage());
        } catch (SQLException e){
            System.out.println("Error in call " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return songsOfPlaylist;
    }
}
