package objetos;

public class Moto {
    private String modelo, matricula;
    private int cv;
    private int velocidad;
    private double kilometros;

    public Moto(){
        this.modelo = "Sin especificar";
        this.matricula = "0000AAA";
        this.cv = 0;
        this.velocidad = 0;
        this.kilometros = 0;
    }

    public Moto(String modelo, String matricula, int cv){
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.velocidad = 0;
        this.kilometros = 0;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public int getCv(){
        return cv;
    }

    public void setCv(int cv){

        this.cv = cv;
    }
    public int getVelocidad(){

        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getkilometros(){
        return kilometros;
    }

    public void setkilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public void acelerar(int velocidadPasada) {
        byte numero = (byte) (Math.random() * 10);
        if (velocidadPasada > 180) {
            velocidad = 180;
            kilometros = velocidad * (cv * numero);
            System.out.println("Velocidad máxima de 180 km/h alcanzada.");
        } else if (velocidadPasada <= 180) {        // la velocidad pasada siempre será maypr que 0
            velocidad += velocidadPasada;
            kilometros = velocidad * (cv * numero);
        }
    }

    public void frenar(int velocidadFrenar){
        int velocidadActual = velocidad - velocidadFrenar;
        if(velocidadActual < 0){
            velocidad = 0;
            System.out.println("La velocidad actual es de 0 km/h");
        }
        else {
            velocidad = velocidadActual;
            System.out.println("La velocidad actual es de "+velocidadActual+".");
        }
    }

    public void resetearVelocidad(){
        velocidad = 0;
    }

    public void resetearTodo() {
        velocidad = 0;
        kilometros = 0;
    }

    public void mostrarDatos(String modelo, String marca, int cv, int velocidad, double km){
        System.out.println("El modelo del auto es "+modelo+".");
        System.out.println("La marca del auto es "+marca+".");
        System.out.println("Los CVs del auto son "+cv+".");
        System.out.println("La velocidad del auto es "+velocidad+".");
        System.out.println("Los kms del auto sn "+kilometros+".");
    }
}

