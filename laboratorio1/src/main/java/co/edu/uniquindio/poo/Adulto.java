package co.edu.uniquindio.poo;

public class Adulto extends Miembro {

    public Adulto(String nombre, String email, String id) {
        super(nombre, email, id);
        
    }

        @Override
        public boolean PuedeInscribirse(Deporte deporte) {
            return true;
        
    }
    
}
