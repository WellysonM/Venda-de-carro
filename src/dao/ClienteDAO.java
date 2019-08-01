/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

wellyson
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteDAO {

    Connection connection = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;

    public ClienteDAO() {

    }

    private Connection getConnection() throws SQLException {
        Connection conn;
        conn = ConnectionFactory.getInstance().getConnection();
        return conn;
    }

    public boolean add(Cliente cliente) throws Exception {
        try {
            String queryString = "INSERT INTO cliente(nome, cpf, telefone)"
                    + " VALUES(?,?,?)";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setString(1, cliente.getNome());
            ptmt.setString(2, cliente.getCpf());
            ptmt.setString(3, cliente.getTelefone());
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public boolean update(Cliente cliente) throws Exception {
        try {
            String queryString = "UPDATE cliente SET nome=?, cpf=?, telefone=? WHERE id=?";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setString(1, cliente.getNome());
            ptmt.setString(2, cliente.getCpf());
            ptmt.setString(3, cliente.getTelefone());
            ptmt.setInt(4, cliente.getId());
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
            String queryString = "DELETE FROM cliente WHERE id=?";
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
            String queryString = "DELETE FROM cliente WHERE id='" + id + "'";
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

    public List<Cliente> findAll() throws Exception {
        List<Cliente> clientes = new ArrayList<>();

        String asc = "select *\n"
                + "from cliente\n"
                + "order by telefone asc;";
        try {
            String queryString = asc;
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                clientes.add(new Cliente(resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("cpf"),
                        resultSet.getString("telefone")));
            }
            return clientes;
        } catch (SQLException e) {
            e.printStackTrace();
            return clientes;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public List<Cliente> findAlll() throws Exception {
        List<Cliente> clientes = new ArrayList<>();
        String desc = "select *\n"
                + "from cliente\n"
                + "order by id asc;";
        try {
            String queryString = desc;
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                clientes.add(new Cliente(resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("cpf"),
                        resultSet.getString("telefone")));
            }
            return clientes;
        } catch (SQLException e) {
            e.printStackTrace();
            return clientes;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public Cliente find(int id) throws Exception {
        Cliente clientes = new Cliente();
        try {
            String queryString = "SELECT * FROM cliente WHERE id= ?";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, id);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                clientes = new Cliente(resultSet.getInt("id"), resultSet.getString("nome"),
                        resultSet.getString("cpf"), resultSet.getString("telefone"));
            }
            return clientes;
        } catch (SQLException e) {
            e.printStackTrace();
            return clientes;
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
