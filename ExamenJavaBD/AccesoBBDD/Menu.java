package AccesoBBDD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
        
    static final String URL = "jdbc:mysql://localhost:3306/aerolinea"; // Cambia por la URL de tu base de datos
    static final String USER = "root"; // Cambia por tu nombre de usuario
    static final String PASSWORD = "root"; // Cambia por tu contraseña
        
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Alta Vuelo");
        System.out.println("2. Alta Pasajero");
        System.out.println("3. Reserva Vuelo");
        System.out.println("4. Modificar reserva");
        System.out.println("5. Baja reserva");
        System.out.println("6. Salir");

        int opcion=sc.nextInt();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexión exitosa a la base de datos");

            // Query para insertar datos sin incluir la columna idUsuario
            switch (opcion) {
                case 1:
                    System.out.println("Rellene este formulario sobre su vuelo:");
                    System.out.print("Numero vuelo: ");
                    int nVuelo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Origen: ");
                    String origen = sc.nextLine();
                    System.out.print("Destino: ");
                    String destino = sc.nextLine();
                    System.out.print("Fecha: ");
                    String fecha = sc.nextLine();
                    System.out.print("Capacidad: ");
                    int capacidad = sc.nextInt();
                    
                    // Query para insertar datos sin incluir la columna id
                    String sql = "INSERT INTO Vuelos (numero_vuelo, origen, destino, fecha, capacidad) VALUES (?, ?, ?, ?, ?)";

                    // Crear una declaración preparada
                    PreparedStatement statement = connection.prepareStatement(sql);

                    // Asignar valores a los parámetros de la declaración preparada
                    statement.setInt(1, nVuelo); // Asigna una cadena para nombre
                    statement.setString(2, origen); // Asigna una cadena para descripcion
                    statement.setString(3, destino); // Asigna un entero para precio
                    statement.setString(4, fecha);
                    statement.setInt(5, capacidad);

                    // Ejecutar la consulta de inserción
                    int filasInsertadas = statement.executeUpdate();
                    System.out.println("Se insertaron " + filasInsertadas + " filas");

                    
                
                
                break;

                default:
                    
            }

            
            
            
            

            System.out.println("Se han creado las filas");

        } catch (SQLException e) {

            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        
            

        }
        
        
        
        


    }

            
}
