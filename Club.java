import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Club here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // instance variables - replace the example below with your own
    private ArrayList<Miembro> listaMiembros;

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        listaMiembros = new ArrayList<Miembro>();
    }
    
    public void aniadir(Miembro miembro) {
        listaMiembros.add(miembro); //se añade al array el miembro pasado por parámetros
    }

    /**
     * Devuelve la cantidad de miembros que hay en el club
     */
    public void numeroMiembros()
    {        
        for(int i = 0; i < listaMiembros.size(); i++) { //recorre el tamaño del array
            System.out.println(listaMiembros.get(i).getNombre()); //imprime cuantos elementos hay hasta la ultima posicion
        }
    }
    
    public int incorporadoEnMes(int mes) {
        if (mes < 1 || mes > 12) { //si el mes indicado no es correcto da error
            System.out.println("Error: Mes fuera de rango.");
            return -1;
        }

        int contador = 0;   //creamos un contador

        //recorre la longitud de la lista de miembros
        for (int i = 0; i < listaMiembros.size(); i++) {
            Miembro miembro = listaMiembros.get(i); //se crea un objeto de la clase Miembro y se iguala a la posición del arrayList            
            if (miembro.getMes() == mes) { //verifica que el mes cohincida con el de parámetros
                contador++;
            }
        }
        
        return contador;
    }
    
    public ArrayList<Miembro> borrar(int mes, int anio) {
        if (mes < 1 || mes > 12) { //si el mes indicado no es correcto da error
            System.out.println("Error: Mes fuera de rango.");
            return new ArrayList<Miembro>(); //devuelve un array vacío
        }

        ArrayList<Miembro> miembrosBorrados = new ArrayList<>(); //se crea un nuevo arrayList par almacenar los miembors borrados
        Iterator<Miembro> iterador = listaMiembros.iterator(); //se crea un iterador
        
        while (iterador.hasNext()) { //mientras haya elementos en el arra
            Miembro miembro = iterador.next(); //se iguala el miembro a la siguiente posicion
            if (miembro.getMes() == mes && miembro.getAnio() == anio) { //si el mes y el año cohiciden 
                miembrosBorrados.add(miembro); //se añade un miembro al arrayt de borrados
                iterador.remove(); //se borra el elemento que se encuentra en la posicion que esta el iterador
            }
        }

        return miembrosBorrados;
    }
    
    public ArrayList<Miembro> borrar2(int mes, int anio) {
        if (mes < 1 || mes > 12) { //si el mes indicado no es correcto da error
            System.out.println("Error: Mes fuera de rango.");
            return new ArrayList<Miembro>(); //devuelve un array vacío
        }

        ArrayList<Miembro> miembrosBorrados = new ArrayList<>(); //se crea un nuevo arrayList par almacenar los miembors borrados
        Iterator<Miembro> iterador = listaMiembros.iterator(); //se crea un iterador
        
        for (int i = 0; iterador.hasNext(); i++) { //mientras haya elementos en el arra
            Miembro miembro = iterador.next(); //se iguala el miembro a la siguiente posicion
            if (miembro.getMes() == mes && miembro.getAnio() == anio) { //si el mes y el año cohiciden 
                miembrosBorrados.add(miembro); //se añade un miembro al arrayt de borrados
                iterador.remove(); //se borra el elemento que se encuentra en la posicion que esta el iterador
            }
        }

        return miembrosBorrados;
    }
    
    public ArrayList<Miembro> borrar3(int mes, int anio) {
        if (mes < 1 || mes > 12) { //si el mes indicado no es correcto da error
            System.out.println("Error: Mes fuera de rango.");
            return new ArrayList<Miembro>(); //devuelve un array vacío
        }

        ArrayList<Miembro> miembrosBorrados = new ArrayList<>(); //se crea un nuevo arrayList par almacenar los miembors borrados
        
        for (Miembro valor : listaMiembros) {
            if (valor.getMes() == mes && valor.getAnio() == anio) { //si el mes y el año cohiciden 
                miembrosBorrados.add(valor); //se añade un miembro al arrayt de borrados
                listaMiembros.remove(valor); //se borra el elemento que se encuentra en la posicion que esta el iterador
            }
        }

        return miembrosBorrados;
    }
    
    public void listarClub() {
        for(Miembro listaMiembros : listaMiembros) { //recorre el tamaño del array
             System.out.println(listaMiembros.getNombre()); //imprime cuantos elementos hay hasta la ultima posicion
        }
    }
}
