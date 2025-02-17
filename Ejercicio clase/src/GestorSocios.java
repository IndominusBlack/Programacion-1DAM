import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorSocios implements CRUD<Socio> {
    private Connection conn;

    public GestorSocios(ConnectionPool pool) {
        this.conn = pool.getConnection();
    }

    @Override
    public ArrayList<Socio> query(String column, String value) throws SQLException {
        List<String> validColumns = Arrays.asList("nombre", "localidad");
        if (!validColumns.contains(column)) throw new SQLException("Columna no válida");
    
        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + column + " = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, value);

            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }  
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }
    
    @Override
    public ArrayList query(String column, int value) throws SQLException {
        List<String> validColumns = Arrays.asList("nombre", "localidad");
        if (!validColumns.contains(column)) throw new SQLException("Columna no válida");
    
        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + column + " = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, value);

            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }  
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    /** requestAll
     * Obtiene todos los registros de un modelo de la base de datos
     * @param sortedBy columna(s) por la(s) que se ordenará la consulta; 
     * Esta cadena también puede incluir una dirección de ordenación (ASC, DESC)
     * @return una lista con los registros encontrados
     * @throws SQLException
     */
    @Override
    public ArrayList requestAll(String sortedBy) throws SQLException {
    
        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio ORDER BY " + sortedBy + " ASC";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, value);

            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }  
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Object requestById(int id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'requestById'");
    }

    @Override
    public boolean create(Socio socio) throws SQLException{              
        int socioID = socio.getId();
        String nombre = socio.getNombre();
        int estatura = socio.getEstatura();
        int edad = socio.getEdad();
        String localidad = socio.getLocalidad();

        String sqlQuery = "INSERT INTO socio (socioID, nombre, estatura, edad, localidad) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, socioID);
            stmt.setString(2, nombre);
            stmt.setInt(3, estatura);
            stmt.setInt(4, edad);
            stmt.setString(5, localidad);

            // Ejecución de la consulta
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) throw new SQLException("Falló la creación del nuevo socio.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean update(Socio model) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
    @Override
    public boolean delete(int id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}