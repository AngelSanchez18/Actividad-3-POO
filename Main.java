import java.util.Scanner;

void opciones(){
    System.out.println("1.Encender\n2.Apagar\n3.Subir volumen\n4.Bajar volumen");
    System.out.println("5.Subir canal\n6.Bajar canal\n7.Agregar Canal\n8.Lista de canales");
    System.out.print("Elija su opcion: ");
}

void main() {
    Scanner scanner = new Scanner(System.in);
    Tv tv = new Tv();
    tv.setChannel(1, "Tv azteca");
    tv.setChannel(2, "Televisa");
    tv.setChannel(11, "Canal once");
    tv.setChannel(12, "Canal doce");
    int opt = 0;
    do{
        if(!tv.getState()){
            System.out.println("Television apagada");
            opciones();
        }else{
            System.out.println("Usted se encuentra viendo: " + tv.getChannel());
            System.out.println("Volumen: " + tv.getVolumeLevel());
            opciones();
        }

        opt = scanner.nextInt();

        if(opt == 1){
            tv.turnOn();
        }else if(opt == 2){
            tv.turnOff();
        }else if(opt == 3){
            tv.volumeUp();
        } else if (opt == 4) {
            tv.volumeDown();
        }else if(opt == 5){
            tv.channelUp();
        } else if (opt == 6) {
            tv.channelDown();
        } else if (opt == 7) {
            System.out.print("Escriba el nombre: ");
            String newName = scanner.next();
            System.out.print("Escriba el numero de canal: ");
            int newChannel = scanner.nextInt();
            tv.setChannel(newChannel, newName);
        } else if (opt == 8) {
            tv.listChannels();
        }

    }while(opt != 0);
}
