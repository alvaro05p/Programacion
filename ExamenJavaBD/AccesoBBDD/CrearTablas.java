package AccesoBBDD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrearTablas {
    // Configuración de la conexión
    static final String URL = "jdbc:mysql://localhost:3306/aerolinea"; // Cambia por la URL de tu base de datos
    static final String USER = "root"; // Cambia por tu nombre de usuario
    static final String PASSWORD = "root"; // Cambia por tu contraseña

    public static void main(String[] args) throws SQLException {
        // Intentar establecer la conexión
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexión exitosa a la base de datos");

            // Query para insertar datos sin incluir la columna idUsuario
            String vuelos = "CREATE TABLE `aerolinea`.`Vuelos` (`id_vuelo` INT NOT NULL AUTO_INCREMENT,`numero_vuelo` INT NULL,`origen` VARCHAR(45) NULL,`destino` VARCHAR(45) NULL,`fecha` VARCHAR(45) NULL,`capacidad` INT NULL,PRIMARY KEY (`id_vuelo`),UNIQUE INDEX `numero_vuelo_UNIQUE` (`numero_vuelo` ASC) VISIBLE)";

            String pasajeros = "CREATE TABLE `aerolinea`.`Pasajeros` (`id_pasajero` INT NOT NULL,`numero_pasaporte` INT NULL,`nombre_pasajero` VARCHAR(45) NULL,PRIMARY KEY (`id_pasajero`),UNIQUE INDEX `numero_pasaporte_UNIQUE` (`numero_pasaporte` ASC) VISIBLE)";

            String vuelos_pasajeros = "CREATE TABLE `aerolinea`.`Vuelos_pasajeros` (`id_vuelo` INT NULL,`id_pasajero` INT NULL,`id_asiento` INT NOT NULL,UNIQUE INDEX `id_pasajero_UNIQUE` (`id_pasajero` ASC) VISIBLE,UNIQUE INDEX `id_vuelo_UNIQUE` (`id_vuelo` ASC) VISIBLE,PRIMARY KEY (`id_asiento`))";


            PreparedStatement statement = connection.prepareStatement(vuelos);
            PreparedStatement statement2 = connection.prepareStatement(pasajeros);
            PreparedStatement statement3 = connection.prepareStatement(vuelos_pasajeros);
            
            statement.executeUpdate();
            statement2.executeUpdate();
            statement3.executeUpdate();

            System.out.println("Se han creado las tablas");

        } catch (SQLException e) {

            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
    
        }

        

    }
}