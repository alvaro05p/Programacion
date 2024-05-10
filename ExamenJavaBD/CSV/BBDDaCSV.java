package CSV;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class BBDDaCSV {
    
    static final String URL = "jdbc:mysql://localhost:3306/aerolinea"; // Cambia por la URL de tu base de datos
    static final String USER = "root"; // Cambia por tu nombre de usuario
    static final String PASSWORD = "root"; // Cambia por tu contraseña
    public static void main(String[] args) {
        // Conectar a la base de datos
            
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                String sql = "SELECT id_vuelo, numero_vuelo, origen, destino, fecha, capacidad FROM Vuelos";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                ResultSet resultSet = statement.executeQuery();
        
                String rutaArchivo = "CSV/Ejemplo2.csv";
                FileWriter escritor = new FileWriter(rutaArchivo);
                    
                while (resultSet.next()) {
                        // Obtener los datos de cada fila del ResultSet
                        int idVuelo = resultSet.getInt("id_vuelo");
                        int numeroVuelo = resultSet.getInt("numero_vuelo");
                        String origen = resultSet.getString("origen");
                        String destino = resultSet.getString("destino");
                        String fecha = resultSet.getString("fecha");
                        int capacidad = resultSet.getInt("capacidad");
                        
                        // Aquí puedes hacer lo que necesites con los datos recuperados

                        
        
                        try {
                            // Crear un objeto FileWriter con la ruta del archivo
                            
                            
                            // Escribir en el archivo
                            escritor.write("ID Vuelo: " + idVuelo + ", Número de Vuelo: " + numeroVuelo + ", Origen: " + origen + ", Destino: " + destino + ", Fecha: " + fecha + ", Capacidad: " + capacidad+"\n");
                            
                            // Cerrar el FileWriter
                            
                            
                            
                        } catch (IOException e) {
                            System.out.println("Error al escribir en el archivo: " + e.getMessage());
                        }
                              
                }
                System.out.println("Se ha escrito en el archivo correctamente.");
                escritor.close();
            } catch (SQLException | IOException e) {
                System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            }
        } 
}
