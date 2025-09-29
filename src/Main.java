import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //wyllsuj 10 liczb z zakresu od 1 do 20
        //tablica musi miec rozmiar, ktory nie moze

        int [] tablicaLosowych1 = losujliczbydoTablicy(10);
        wypisz(tablicaLosowych1);
        //wypisz wylosowane liczny
        ArrayList<Integer> wylosowane = wylosujLiczbeDoListy(10);
        wypisz(wylosowane);


    }
    private static ArrayList<Integer> wylosujLiczbeDoListy(int ileLiczb){
        //kolekcje -> listy, zbiory, map
        //list - > ARRAYLISST
        //w kazdej kolekcji nie musimy deklarowac rozmiary na poczatku pracy z kolekcja
        //rozmiar moze bys zmieniony -> dodawanie i usuwanie elementów
        int liczba1 = 0;//typ prosty z mojej listy nie ma metody
        Integer liczba2 = 0;//ma metode typ zlozony pisany z wielkiej litery

        ArrayList<Integer> listaLiczbLosowych = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < ileLiczb; i++) {

            listaLiczbLosowych.add(random.nextInt(20)+1);
        }
        return listaLiczbLosowych;

    }

    private  static  void  wypisz (ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)+ ", ");

        }
    }
    private static  int[] losujliczbydoTablicy(int ileLiczb){
        int [] tablicaLiczbLosowych = new int[ileLiczb];
        Random random = new Random();
        for (int i =0; i <tablicaLiczbLosowych.length; i++){
            tablicaLiczbLosowych[i] = random.nextInt(20) +1;

        }
        return  tablicaLiczbLosowych;
    }

    private static void wypisz(int[] tablica) {
        System.out.println("wypisywanie tablicy");
        for (int elementTablicy : tablica) {
            System.out.println(elementTablicy + ", ");
        }
    }



}