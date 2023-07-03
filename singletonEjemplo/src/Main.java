public class Main {
    public static void main(String[] args) {

        // con este for vemos como se crea una sola instancia de la clase coche
        // y se crean copias
        for(int i = 0; i < 5; i++){
            Coche.getInstance();
        }

        Coche coche1 = Coche.getInstance();
        Coche coche2 = Coche.getInstance();

        coche1.Run();
        coche2.Run();

        // mostramos la direccion de memoria y es la misma
        // pero la instancia es solo una, la otra es una copia
        System.out.println("Dirección de memoria coche1 "+coche1);
        System.out.println("Dirección de memoria coche2 "+coche2);
    }
}