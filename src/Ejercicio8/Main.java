package Ejercicio8;

public class Main {

        public static void main(String[] args) {
            Persona persona = new Persona();

            persona.setEdad(30);
            persona.setNombre("Juan");
            persona.setTelefono("+543517473121");

            System.out.println("Hola! Soy " + persona.getNombre() + " tengo " + persona.getEdad() + " años y mi número de teléfono es " + persona.getTelefono());
        }
    }
    class Persona {
        private int edad;
        private String nombre;
        private String telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }

