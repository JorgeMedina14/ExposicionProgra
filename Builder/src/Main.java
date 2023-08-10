class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    // Constructor privado para forzar la creación a través del builder
    private Persona() {
    }

    // Getters
    public String getName() {
        return nombre;
    }

    public int getAge() {
        return edad;
    }

    public String getAddress() {
        return direccion;
    }

    // Clase Builder interna
    static class Builder {
        private Persona persona = new Persona();

        public Builder setName(String nombre) {
            persona.nombre = nombre;
            return this;
        }

        public Builder setAge(int edad) {
            persona.edad = edad;
            return this;
        }

        public Builder setAddress(String direccion) {
            persona.direccion = direccion;
            return this;
        }

        public Persona build() {
            return persona;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Usando el builder para crear objetos Person
        Persona person1 = new Persona.Builder()
                .setName("Juan")
                .setAge(30)
                .setAddress("Calle 123")
                .build();

        Persona person2 = new Persona.Builder()
                .setName("Maria")
                .setAge(25)
                .build();

        // Imprimir información de las personas
        System.out.println("Persona 1:");
        System.out.println("Nombre: " + person1.getName());
        System.out.println("Edad: " + person1.getAge());
        System.out.println("Dirección: " + person1.getAddress());

        System.out.println("\nPersona 2:");
        System.out.println("Nombre: " + person2.getName());
        System.out.println("Edad: " + person2.getAge());
        System.out.println("Dirección: " + person2.getAddress());
    }
}