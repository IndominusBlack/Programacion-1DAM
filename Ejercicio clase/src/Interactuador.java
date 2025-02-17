public interface Interactuador {
    String URL = "jdbc:mariadb://localhost:3306/baloncesto";
    String USUARIO = "root";
    String CONTRASENYA = "";

    ConnectionPool pool = new ConnectionPool(URL, USUARIO, CONTRASENYA);

    //TODO muchas cosas.
}
