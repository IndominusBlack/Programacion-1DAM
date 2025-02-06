import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestorPersona {
    public static void main(String[] args) {
        private HashMap<String, ArrayList<Persona>> miHashMap = new HashMap<>();

    public boolean añadirPersona(String colorPelo, Persona persona) {
        if (!miHashMap.containsKey(colorPelo)) {
            ArrayList<Persona> miArrayList = new ArrayList<>();
            miArrayList.add(persona);
            miHashMap.put(colorPelo, miArrayList);
            return true;
        } else {
            ArrayList<Persona> miArrayList = miHashMap.get(colorPelo);
            // Recorro el arrayList para buscar una persona con los mismos datos
            int i = 0;
            boolean encontradaPersona = false;
            while (!encontradaPersona && i<miArrayList.size()) {
                Persona personaEnLista = miArrayList.get(i);
                if (personaEnLista.equals(persona)) encontradaPersona = true;
                // if (personaEnLista.toString().equals(persona.toString())) encontradaPersona = true;
                i++;
            }
            // Si no la he encontrado, la añado
            if (!encontradaPersona) {
                miArrayList.add(persona);
                return true;
            }
            return false;
        }
    }

    public boolean borrarColorPelo (String colorPelo) {
        if (miHashMap.containsKey(colorPelo)) {
            miHashMap.remove(colorPelo);
            return true;
        }
        return false;
    }

    // Borra una persona si coinciden sus datos (lo devuelto por toString())
    public boolean borrarPersona(String colorPelo, Persona persona) {
        if (miHashMap.containsKey(colorPelo)) {
            ArrayList<Persona> miArrayList = miHashMap.get(colorPelo);
            miArrayList.removeIf(personaEnLista -> personaEnLista.equals(persona));  // personaEnLista.toString().equals(persona.toString()));
            return true;
        }
        return false;
    }

    public void mostrarPersonasMismoPelo(String colorPelo) {
        if (miHashMap.containsKey(colorPelo)) {
            ArrayList<Persona> miArrayList = miHashMap.get(colorPelo);
            System.out.println("Personas " + colorPelo + ": ");
            for(Persona persona: miArrayList) System.out.println(persona);
        } else {
            System.out.println("No hay personas con ese color de pelo");
        }
    }

    public void mostrarTodasPersonas() {
        for(Map.Entry<String, ArrayList<Persona>> parejaCV: miHashMap.entrySet()) {            
            ArrayList<Persona> miArrayList = parejaCV.getValue();
            System.out.println("Personas " + parejaCV.getKey() + ": ");
            for(Persona persona: miArrayList) System.out.println(persona);
            System.out.println();            
        }
    }

    public HashMap<String, ArrayList<Persona>> getMiHashMap() {
        return miHashMap;
    }

    public void setMiHashMap(HashMap<String, ArrayList<Persona>> miHashMap) {
        this.miHashMap = miHashMap;
    }
}