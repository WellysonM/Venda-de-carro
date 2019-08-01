/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Carro;

public class CarroDAO {

    Connection connection = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;

    public CarroDAO() {

    }

    private Connection getConnection() throws SQLException {
        Connection conn;
        conn = ConnectionFactory.getInstance().getConnection();
        return conn;
    }

    public boolean add(Carro carro) throws Exception {
        try {
            String queryString = "INSERT INTO carro(modelo, marca, preco)"
                    + " VALUES(?,?,?)";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setString(1, carro.getModelo());
            ptmt.setString(2, carro.getMarca());
            ptmt.setDouble(3, carro.getPreco());
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public boolean update(Carro carro) throws Exception {
        try {
            String queryString = "UPDATE carro SET modelo = ?, marca = ?, preco = ? WHERE id = ?";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setString(1, carro.getModelo());
            ptmt.setString(2, carro.getMarca());
            ptmt.setDouble(3, carro.getPreco());
            ptmt.setInt(4, carro.getId());
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public int delete(int id) throws Exception {
        try {
            String queryString = "DELETE FROM carro WHERE id=?";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, id);
            int val = ptmt.executeUpdate();

            return val;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public boolean delete1(int id) throws Exception {
        try {
            String queryString = "DELETE FROM carro WHERE id='" + id + "'";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            // ptmt.setInt(1, id);
            resultSet = ptmt.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
        return false;
    }

    public List<Carro> findAll() throws Exception {
        List<Carro> carros = new ArrayList<>();

        String asc = "select *\n"
                + "from carro\n"
                + "order by preco asc;";
        try {
            String queryString = asc;
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                carros.add(new Carro(resultSet.getInt("id"),
                        resultSet.getString("modelo"),
                        resultSet.getString("marca"),
                        resultSet.getDouble("preco")));
            }
            return carros;
        } catch (SQLException e) {
            e.printStackTrace();
            return carros;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public List<Carro> findAlll() throws Exception {
        List<Carro> carros = new ArrayList<>();
        String desc = "select *\n"
                + "from carro\n"
                + "order by id asc;";
        try {
            String queryString = desc;
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                carros.add(new Carro(resultSet.getInt("id"),
                        resultSet.getString("modelo"),
                        resultSet.getString("marca"),
                        resultSet.getDouble("preco")));
            }
            return carros;
        } catch (SQLException e) {
            e.printStackTrace();
            return carros;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public Carro find(int id) throws Exception {
        Carro carros = new Carro();
        try {
            String queryString = "SELECT * FROM carro WHERE id= ?";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, id);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                carros = new Carro(resultSet.getInt("id"), resultSet.getString("modelo"),
                        resultSet.getString("marca"), resultSet.getDouble("preco"));
            }
            return carros;
        } catch (SQLException e) {
            e.printStackTrace();
            return carros;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public void closeConnection(Connection conn, Statement st,
            ResultSet rs) throws Exception {
        close(conn, st, rs);
    }

    public void closeConnection(Connection conn, Statement st)
            throws Exception {
        close(conn, st, null);
    }

    public void closeConnection(Connection conn) throws Exception {
        close(conn, null, null);
    }

    public void close(Connection conn, Statement st, ResultSet rs)
            throws Exception {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
