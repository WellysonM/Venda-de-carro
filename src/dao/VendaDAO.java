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
import model.Venda;

/**
 *
 * @author Wellyson
 */
public class VendaDAO {

    Connection connection = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;

    public VendaDAO() {
    }

    private Connection getConnection() throws SQLException {
        Connection conn;
        conn = ConnectionFactory.getInstance().getConnection();
        return conn;
    }

    public boolean add(Venda venda) throws Exception {
        try {
            String queryString = "INSERT INTO venda(cliente_id, data, id_movel, tipo, status)"
                    + "VALUES(?,?,?,?,?)";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, venda.getCliente_id());
            ptmt.setString(2, data(venda.getData()));
            ptmt.setInt(3, venda.getId_movel());
            ptmt.setString(4, venda.getTipo());
            ptmt.setString(5, venda.getStatus());
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public String data(String data) {

        String dia;
        dia = data.substring(0, 2);
        String mes;
        mes = data.substring(3, 5);
        String ano;
        ano = data.substring(6);
        data = ano + "-" + mes + "-" + dia;
        return data;
    }

    public boolean update(Venda venda) throws Exception {
        try {
            String queryString = "UPDATE venda SET data = ? WHERE id = ?";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setString(1,  data(venda.getData()));
            ptmt.setInt(2, venda.getId());
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public boolean status(Venda venda) throws Exception {
        try {
            String queryString = "UPDATE venda SET status = ? WHERE id=?";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setString(1, venda.getStatus());
            ptmt.setInt(2, venda.getId());
            ptmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public List<Venda> findAll() throws Exception {
        List<Venda> vendas = new ArrayList<>();
        try {
            String queryString = "select *\n"
                    + "from venda\n"
                    + "order by data asc;";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                vendas.add(new Venda(resultSet.getInt("id"),
                        resultSet.getString("data"),
                        resultSet.getInt("cliente_id"),
                        resultSet.getInt("id_movel"),
                        resultSet.getString("tipo"),
                        resultSet.getString("status")));
            }
            return vendas;
        } catch (SQLException e) {
            e.printStackTrace();
            return vendas;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public List<Venda> findAlll() throws Exception {
        List<Venda> vendas = new ArrayList<>();
        try {
            String queryString = "select *\n"
                    + "from venda\n"
                    + "order by data desc;";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                vendas.add(new Venda(resultSet.getInt("id"),
                        resultSet.getString("data"),
                        resultSet.getInt("cliente_id"),
                        resultSet.getInt("id_movel"),
                        resultSet.getString("tipo"),
                        resultSet.getString("status")));
            }
            return vendas;
        } catch (SQLException e) {
            e.printStackTrace();
            return vendas;
        } finally {
            closeConnection(connection, ptmt, resultSet);
        }
    }

    public List<Venda> findAllDate() throws Exception {
        List<Venda> vendas = new ArrayList<>();
        try {
            String queryString = "SELECT * FROM venda WHERE status='Efetuada'";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                vendas.add(new Venda(resultSet.getInt("id"),
                        resultSet.getString("data"),
                        resultSet.getInt("cliente_id"),
                        resultSet.getInt("id_movel"),
                        resultSet.getString("tipo"),
                        resultSet.getString("status")));
            }
            return vendas;
        } catch (SQLException e) {
            e.printStackTrace();
            return vendas;
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
