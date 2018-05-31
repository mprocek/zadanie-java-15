import java.util.Scanner;

public class SumaLiczb {
    public static void main(String[] args) {
        int[][] tab = new int[3][3];
        int[] suma = new int[3];
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int j = 0;


        while (i != tab.length) {
            while (j != tab.length) {
                System.out.printf("Podaj liczbę %d, %d tablicy: ", (i+1),(j+1));
                tab[i][j]=scan.nextInt();
                suma[i]+= tab[i][j];
                j++;
            }
            j=0;
            i++;
        }

        int ii=0;
        int max = suma[0];
        int indeks=0;
        while (ii != suma.length){
           if (suma[ii]>max){
               max=suma[ii];
               indeks = ii;
           }
           ii++;
        }

        System.out.printf("Największa suma liczba jest w wierszu %d i wynosi %d", indeks+1, max);
    }
}

