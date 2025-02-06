import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorCoches implements CRUD<Coche> {
    private File file;
    private ArrayList<Coche> misCoches = new ArrayList<>();

    public GestorCoches(File fichero) {
        file = this.file;
    }

    @Override
    public ArrayList<Coche> recuperarTodos() {
        try {
            BufferedReader br = new GestorCoches(new FileReader("coches.txt"));
            String linea = "";
                while((linea = br.readLine()) != null) {
                Coche coche = new Coche(linea);
                misCoches.add(coche);
            }
            br.close();
            return misCoches;
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return null;
        
    }

    @Override
    public Coche recuperarUno(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public Coche añadir(Coche añad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'añadir'");
    }

    @Override
    public Coche eliminar(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public Coche modificar(Coche modif) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'añadir'");
    }
}
