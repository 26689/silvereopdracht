import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in );
        System.out.println("Wil je iets eten?");
        System.out.println("ja");
        System.out.println("nee");

        String in;
        in = scan.nextLine();

        if(in.equals("ja")){
            //in geval van ja
            in = scan.nextLine();
            System.out.println("Warm of koud");



        }else{
            //in geval van nee
        }

        if(in.equals("nee"));
else {
            System.out.println("Warm of koud?");
            System.out.println("warm");
            System.out.println("koud");

            in = scan.nextLine();


            System.out.println("Gezond of ongezond?");
            System.out.println("gezond");
            System.out.println("ongezond");

            in = scan.nextLine();

            System.out.println("Met of zonder groenten?");
            System.out.println("met");
            System.out.println("zonder");

            in = scan.nextLine();

            System.out.println("Mag het hebben gezwommen?");
            System.out.println("zeker");
            System.out.println("nee");

            in = scan.nextLine();

            System.out.println("Alstublieft hier heeft u uw tonijn sashimi dat is dan 7 euro");

        }

            in = scan.nextLine();

        {

            System.out.println("Wil je dan iets drinken?");
            System.out.println("met prik");
            System.out.println("zonder prik");

            in = scan.nextLine();

            System.out.println("Zoet of Neutraal?");
            System.out.println("zoet");
            System.out.println("neutraal");

            in = scan.nextLine();


            System.out.println("Gekleurd of helder?");
            System.out.println("gekleurd");
            System.out.println("helder");

            in = scan.nextLine();

            System.out.println("Cola of sinas?");
            System.out.println("cola");
            System.out.println("sinas");

            in = scan.nextLine();

            System.out.println("Coca Cola of Cola Zero?");
            System.out.println("Coca Cola");
            System.out.println("Cola Zero");

            in = scan.nextLine();

            System.out.println("Alstublieft hier heeft u uw Coca Cola dat is dan 2,50 euro");

        }





    }
}
