import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int[][] arregloMagico= {
                {16,3,2,13},
                {5,10,11,8},
                {9,6,7,12},
                {4,15,14,1} };


        int sumaHor1=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaHor1=sumaHor1+arregloMagico[0][x];
        }
        System.out.println(sumaHor1);

        int sumaHor2=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaHor2=sumaHor2+arregloMagico[1][x];
        }
        System.out.println(sumaHor2);

        int sumaHor3=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaHor3=sumaHor3+arregloMagico[2][x];
        }
        System.out.println(sumaHor3);

        int sumaHor4=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaHor4=sumaHor4+arregloMagico[3][x];
        }
        System.out.println(sumaHor4);


        int sumaVer1=0;

        for(int x=0;x<arregloMagico.length;x++){
            sumaVer1=sumaVer1+arregloMagico[x][0];
        }
        System.out.println(sumaVer1);

        int sumaVer2=0;

        for(int x=0;x<arregloMagico.length;x++){
            sumaVer2=sumaVer2+arregloMagico[x][1];
        }
        System.out.println(sumaVer2);

        int sumaVer3=0;

        for(int x=0;x<arregloMagico.length;x++){
            sumaVer3=sumaVer3+arregloMagico[x][2];
        }
        System.out.println(sumaVer3);

        int sumaVer4=0;

        for(int x=0;x<arregloMagico.length;x++){
            sumaVer4=sumaVer4+arregloMagico[x][3];
        }
        System.out.println(sumaVer4);

        int sumaDiagonal1=0;
        for(int x =0;x<arregloMagico.length;x++){
            sumaDiagonal1=sumaDiagonal1+arregloMagico[x][x];
        }
        System.out.println(sumaDiagonal1);

        int sumaDiagonal2=0;
        int y=3;
        for(int x =0;x<arregloMagico.length;x++){

            sumaDiagonal2=sumaDiagonal2+arregloMagico[y][x];
            y=y-1;
        }
        System.out.println(sumaDiagonal2);









    }

        }






