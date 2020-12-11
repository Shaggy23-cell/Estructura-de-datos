public class Principal {
    public static void main(String[] args) {
        int n = 26;
        String[][] labResult = resu(n);
        System.out.println(labResult);
    }

    public static String[][] resu(int j) {
        String[][] laberinto = {

                {"*", "*", "*", "" , "*"},
                {" ", " ", " ", " ", "*"},
                {"*", "*", " ", " ", " "},
                {"*", "*", " ", " ", "*"},
                {"*", "*", "S", "*", "*"},
        };
        int cont = 0;
        int cont2 = 0;
        if (laberinto[cont][cont2]=="") {
            if(laberinto[cont+1][cont2]==""){
    laberinto[cont][cont2]=".";
    cont++;
            }else{
                laberinto[cont][cont2]="x";
            }
            }else{
            cont2++;
        }


return laberinto;
    }
}

