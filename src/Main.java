import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //wyllsuj 10 liczb z zakresu od 1 do 20
        //tablica musi miec rozmiar, ktory nie moze

        int [] tablicaLiczbLosowych = new int[10];
        Random random = new Random();
        for (int i =0; i <tablicaLiczbLosowych.length; i++){
            tablicaLiczbLosowych[i] = random.nextInt(20) +1;

        }
        int [] tablicaLosowych1 = losujliczbydoTablicy((ileliczb));

        wypisz(tablicaLosowych1);
        //wypisz wylosowane liczny
        System.out.println("wypisywanie tablicy");
        for(int elementTablicy:tablicaLiczbLosowych){
            System.out.println(elementTablicy+ ", ");
        }
    }
    private static  int[] losujliczbydoTablicy(int ileLiczb){
        int [] tablicaLiczbLosowych = new int[10];
        Random random = new Random();
        for (int i =0; i <tablicaLiczbLosowych.length; i++){
            tablicaLiczbLosowych[i] = random.nextInt(20) +1;

        }
        return  tablicaLiczbLosowych;
    }

}