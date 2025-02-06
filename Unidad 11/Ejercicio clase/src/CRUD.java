import java.util.ArrayList;

public interface CRUD<T> {
    public ArrayList<T> recuperarTodos();
    public T recuperarUno(String id);
    public T añadir(T añad);
    public T eliminar(String id);
    public T modificar(T modif);
}
