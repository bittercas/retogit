package objetos;

public class Entrada {
    public static void main(String[] args) {
        Coche auto1 = new Coche();
        Coche auto2 = new Coche("Nissan", "SDQ403", 500);
        Coche autoGanador = null;

        System.out.println("***Información de los autos a competir***");
        System.out.println("Auto número 1: ");
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Matrícula: " + auto1.getMatricula());
        System.out.println("CV: " + auto1.getCv());
        System.out.println("Velocidad: " + auto1.getVelocidad());
        System.out.println("KM: " + auto1.getKm());

        System.out.println("************************************");

        System.out.println("Auto número 2: ");
        System.out.println("Modelo: " + auto2.getModelo());
        System.out.println("Matrícula: " + auto2.getMatricula());
        System.out.println("CV: " + auto2.getCv());
        System.out.println("Velocidad: " + auto2.getVelocidad());
        System.out.println("KM: " + auto2.getKm());

        auto1.setModelo("Ferrari");
        auto1.setMatricula("KJP761");
        auto1.setCv(500);

        auto2.setModelo("Toyota");
        auto2.setMatricula("ZMW125");
        auto1.setCv(500);

        System.out.println("\n*****Información Actualizada*****");

        System.out.println("Auto número 1: ");
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Matrícula: " + auto1.getMatricula());
        System.out.println("CV: " + auto1.getCv());
        System.out.println("Velocidad: " + auto1.getVelocidad());
        System.out.println("KM: " + auto1.getKm());

        System.out.println("************************************");

        System.out.println("Auto número 2: ");
        System.out.println("Modelo: " + auto2.getModelo());
        System.out.println("Matrícula: " + auto2.getMatricula());
        System.out.println("CV: " + auto2.getCv());
        System.out.println("Velocidad: " + auto2.getVelocidad());
        System.out.println("KM: " + auto2.getKm());

        System.out.println("\n*****Prueba de Aceleración*****");

        byte velocidadAcelerar = (byte) ((Math.random() * 20));
        auto1.acelerar(velocidadAcelerar);

        System.out.println("Auto número 1: ");
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Matrícula: " + auto1.getMatricula());
        System.out.println("CV: " + auto1.getCv());
        System.out.println("Velocidad: " + auto1.getVelocidad());
        System.out.println("KM: " + auto1.getKm());

        System.out.println("************************************");

        auto2.acelerar(velocidadAcelerar);
        System.out.println("Auto número 2: ");
        System.out.println("Modelo: " + auto2.getModelo());
        System.out.println("Matrícula: " + auto2.getMatricula());
        System.out.println("CV: " + auto2.getCv());
        System.out.println("Velocidad: " + auto2.getVelocidad());
        System.out.println("KM: " + auto2.getKm());

        System.out.println("\n*****Entrada a la carrera*****");

        int kmCarrera = 100000;
        do {
            byte velocidadAuto1 = (byte) (Math.random() * 20);
            byte velocidadAuto2 = (byte) (Math.random() * 20);
            auto1.acelerar(velocidadAuto1);
            auto2.acelerar(velocidadAuto2);
        }
        while (auto1.getKm()<=kmCarrera && auto2.getKm()<=kmCarrera );

        if (auto1.getKm() > kmCarrera && auto2.getKm() > kmCarrera) {
            auto1.setKm(kmCarrera);
            auto2.setKm(kmCarrera);
        } else if (auto1.getKm() > kmCarrera) {
            auto1.setKm(kmCarrera);
        } else {
            auto2.setKm(kmCarrera);
        }

        System.out.println("Auto número 1: ");
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Matrícula: " + auto1.getMatricula());
        System.out.println("CV: " + auto1.getCv());
        System.out.println("Velocidad: " + auto1.getVelocidad());
        System.out.println("KM: " + auto1.getKm());

        System.out.println("************************************");

        System.out.println("Auto número 2: ");
        System.out.println("Modelo: " + auto2.getModelo());
        System.out.println("Matrícula: " + auto2.getMatricula());
        System.out.println("CV: " + auto2.getCv());
        System.out.println("Velocidad: " + auto2.getVelocidad());
        System.out.println("KM: " + auto2.getKm());

        if(auto1.getKm()>=100000 && auto2.getKm()<100000){
            autoGanador = auto1;
            autoGanador.setModelo(auto1.getModelo());
            System.out.println("El auto ganador es el " + autoGanador.getModelo() + ".");
        }
        else if (auto2.getKm()>=100000 && auto1.getKm()<100000) {
            autoGanador = auto2;
            autoGanador.setModelo(auto2.getModelo());
            System.out.println("El auto ganador es el " + autoGanador.getModelo() + ".");
        }
        else {
            System.out.println("Los dos autos llegaron a la meta al mismo tiempo. La carrera termina en empate.");
        }
    }
}
