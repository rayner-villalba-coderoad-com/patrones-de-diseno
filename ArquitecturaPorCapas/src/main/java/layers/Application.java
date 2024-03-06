package layers;

import java.sql.*;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {

        int option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operaciones del sistema");


        do {
            System.out.println("1. Listar propiedades.");
            System.out.println("2. Ver si es posible cancelar reserva.");
            System.out.println("3. Salir.");

            option = scanner.nextInt();

            switch (option) {

                case 1: //Listar propiedades.

                    final String querySQL = "SELECT PropertyId, Name, Type, MaxGuests FROM Property";

                    //Pedir a la base de datos la lista de propiedades registradas
                    try(Statement statement = connection.createStatement();
                        ResultSet results = statement.executeQuery(querySQL)) {

                        final String format = "Nombre: %s, Tipo: %s, Huéspedes: %d\n";

                        //Recorrer resultados
                        while(results.next()) {

                            String typeAsString = "";
                            switch(results.getInt("Type")) {
                                case 1:
                                    typeAsString = "Apartamento";
                                    break;
                                case 2:
                                    typeAsString = "Habitación";
                                    break;
                                case 3:
                                    typeAsString = "Cama";
                                    break;
                            }

                            System.out.format(format, results.getString("Name"),
                                    typeAsString,
                                    results.getInt("MaxGuests"));
                        }
                        System.out.println();

                    } catch (SQLException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;

                case 2: //Ver si es posible cancelar reserva.
                    System.out.println("¿Cuántos días faltan para el inicio de la reserva?");
                    int days = scanner.nextInt();

                    System.out.println("¿Qué tipo de propiedad es? (1 = Apartamento, 2 = Habitación, 3 = Cama)");
                    int propertyType = scanner.nextInt();

                    boolean cancel = true;
                    if(days < 3) {
                        cancel = false;
                    } else {
                        //La reserva no se puede cancelar si es un apartamento.
                        if(propertyType == 1) {
                            cancel = false;
                        }
                    }

                    if(cancel) {
                        System.out.println("Se puede cancelar la reserva\n");
                    } else {
                        System.out.println("No se puede cancelar la reserva\n");
                    }
                    break;

            }

        } while (option != 3);

        closeConnection();
        System.out.println("Aplicación terminada");

    }





    private static void closeConnection(){
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
