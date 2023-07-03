public class Coche {

    private static Coche coche;
    private boolean isRunning = false;

    private Coche(){}

    public static Coche getInstance(){
        if(coche == null){
            coche = new Coche();
            System.out.println("El objeto se creo");
        }else{
            System.out.println("Ya existe el objeto");
        }
        return coche;
    }

    public void Run(){
        if(!isRunning){
            isRunning = true;
        }else{
            System.out.println("Ya estaba en ejecucion");
        }
    }
}
