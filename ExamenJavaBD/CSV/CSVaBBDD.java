package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CSVaBBDD {

    static final String URL = "jdbc:mysql://localhost:3306/aerolinea"; // Cambia por la URL de tu base de datos
    static final String USER = "root"; // Cambia por tu nombre de usuario
    static final String PASSWORD = "root"; // Cambia por tu contraseña
    
    public static void main(String[] args) {
        System.out.println("Elige una opcion:");
        System.out.println("1.Pasar CSV a la BBDD");
        System.out.println("2.Pasar datos a un CSV");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                // Establecer la conexión a la base de datos
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                    System.out.println("Conexión exitosa a la base de datos");

                    // Leer el archivo CSV
                    String csvFile = "CSV/Ejemplo.csv";
                    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                        String line;
                        // Leer el archivo línea por línea
                        while ((line = br.readLine()) != null) {
                            // Dividir la línea en campos usando la coma como delimitador
                            String[] campos = line.split(",");
                            // Acceder a cada campo por separado
                            String nVueloStr = campos[0];
                            int nVuelo = Integer.parseInt(nVueloStr);
                            String origen = campos[1];
                            String destino = campos[2];
                            String fecha = campos[3];
                            String capacidadStr = campos[4];
                            int capacidad = Integer.parseInt(capacidadStr);

                            // Query para insertar datos
                            String sql = "INSERT INTO Vuelos (numero_vuelo, origen, destino, fecha, capacidad) VALUES (?, ?, ?, ?, ?)";

                            // Crear una declaración preparada
                            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                                // Asignar valores a los parámetros de la declaración preparada
                                statement.setInt(1, nVuelo);
                                statement.setString(2, origen);
                                statement.setString(3, destino);
                                statement.setString(4, fecha);
                                statement.setInt(5, capacidad);

                                // Ejecutar la consulta de inserción
                                int filasInsertadas = statement.executeUpdate();
                                System.out.println("Se insertaron " + filasInsertadas + " filas");
                            }
                        }
                    }
                } catch (IOException | SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }
}
