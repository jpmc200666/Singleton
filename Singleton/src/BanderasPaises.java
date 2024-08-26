import java.util.ArrayList;
import java.util.List;

public class BanderasPaises {
    private static BanderasPaises instanciaunica;
    List <String> banderasLatam = new ArrayList<>();
    private BanderasPaises(){
        this.banderasLatam.add("Colombia");
        this.banderasLatam.add("Chile");
        this.banderasLatam.add("Peru");
        this.banderasLatam.add("Brazil");
    }
    public static BanderasPaises getInstancia(){
        if(instanciaunica == null){
            instanciaunica = new BanderasPaises();
        }
        return instanciaunica;
    }
    public void getBanderas(){
        banderasLatam.forEach(System.out::println);
    }
}


    