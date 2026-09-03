import java.util.ArrayList;

public class Tv {
    int channel;
    ArrayList<Channels> listChannels = new ArrayList<>();
    private int volumeLevel;
    private boolean state;


    Tv(){
        channel = 0;
        volumeLevel = 0;
        state = false;
    }

     String getChannel() {
        if(listChannels.contains(channel)){
            return ("Canal no existente");
        }
        return listChannels.get(channel).name;
    }

    boolean getState(){
        return state;
    }

    int getVolumeLevel(){
        return volumeLevel;
    }

    void turnOn(){
        if(state){
            System.out.println("Tv ya encendida");
            return;
        }
        state = true;
        System.out.println("Tv encendida!");
    }

    void turnOff(){
        if(!state){
            System.out.println("Tv ya apagada");
            return;
        }
        state = false;
        System.out.println("Tv apagada!");
    }

    void setChannel(int channel, String name){
        listChannels.add(new Channels(channel, name));
        System.out.println("Canal agregado!");
    }

    void channelUp(){
        if(channel + 1 > listChannels.size()){
            System.out.println("No se puede subir!");
            return;
        }
        channel++;
    }

    void channelDown(){
        if(channel < 0){
            System.out.println("No se puede bajar!");
            return;
        }
        channel--;
    }

    void volumeUp(){
        volumeLevel++;
    }

    void volumeDown(){
        if(volumeLevel < 0){
            System.out.println("No se puede bajar!");
            return;
        }
        channel--;
    }

    void listChannels(){
        for(int i = 0; i < listChannels.size(); i++){
            System.out.print(listChannels.get(i).name + " ");
            System.out.print(listChannels.get(i).channel + "\n");
        }
    }
}
