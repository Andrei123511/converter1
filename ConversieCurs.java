import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConversieCurs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduceti suma : ");
        double suma = Double.parseDouble(reader.readLine());
        double sumainEUR = 0.2*suma;
        double sumacucomisionEUR = sumainEUR-(0.01*100);
        if (suma<=999){
            System.out.println("Suma in Euro este : "+sumainEUR);
        }
        else
            System.out.println("Suma in Euro este : "+sumacucomisionEUR);//1% comision la sumele de cel putin 1000lei

        double sumainUSD = 0.24*suma;
        double sumacucomisionUSD = sumainUSD-(0.01*100);
        if (suma<=999){
            System.out.println("Suma in Dolari este : "+sumainUSD);
        }
        else
            System.out.println("Suma in Dolari este : "+sumacucomisionUSD);

        double sumainGBP = 0.18*suma;
        double sumacucomisionGBP = sumainGBP-(0.01*100);
        if (suma<=999){
            System.out.println("Suma in Lire Sterline este : "+sumainGBP);
        }
        else
            System.out.println("Suma in Lire Sterline este : "+sumacucomisionGBP);

    }
}

