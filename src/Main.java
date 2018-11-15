import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean runmachine = true;
        while (runmachine) {
            System.out.println("\n" + "Wil je eten of drinken?");
            System.out.println("Kies eten of drinken");

            Scanner scan = new Scanner(System.in);

            String eten = scan.nextLine();
            if (eten.equals("eten")) {
                System.out.println("Wil je gezond of ongezond");
                String gezond_eten = scan.nextLine();

                if (gezond_eten.equals("gezond")) {
                    System.out.println("Vis, Vlees, Salade");
                }

                String Vis = scan.nextLine();
                if (Vis.equals("Vis")) {
                    System.out.println("Dat is dan 4 euro - Type PAYH1 om te betalen");
                }

                String PAYH1 = scan.nextLine();
                if (PAYH1.equals("PAYH1")) {
                    System.out.println("Om te betalen deposit: 1 euro, 2 euro, 5 euro of 10 euro");
                    Scanner s = new Scanner(System.in);
                    float deposit = s.nextInt();
                    float price;
                    price = (float) 4.00;
                    float wallet = deposit - price;
                    if (wallet < 0) {
                        System.out.println("U heeft niet genoeg geld");
                    } else {
                        System.out.println("Je hebt nog " + wallet + " euro wisselgeld.");
                    }


                }
                String Vlees = scan.nextLine();
                if (Vlees.equals("Vlees")) {
                    System.out.println("Dat is dan 3 euro - Type PAYH2 om te betalen");
                }

                String PAYH2 = scan.nextLine();
                if (PAYH2.equals("PAYH2")) {
                    System.out.println("Om te betalen deposit: 1 euro, 2 euro, 5 euro of 10 euro");
                    Scanner s = new Scanner(System.in);
                    float deposit = s.nextInt();
                    float price;
                    price = (float) 3.00;
                    float wallet = deposit - price;
                    if (wallet < 0) {
                        System.out.println("U heeft niet genoeg geld");
                    } else {
                        System.out.println("Je hebt nog " + wallet + " euro wisselgeld.");
                    }
                }
                String Salade = scan.nextLine();
                if (Salade.equals("Salade")) {
                    System.out.println("Dat is dan 2 euro - Type PAYH3 om te betalen");
                }

                String PAYH3 = scan.nextLine();
                if (PAYH3.equals("PAYH3")) {
                    System.out.println("Om te betalen deposit: 1 euro, 2 euro, 5 euro of 10 euro");
                    Scanner s = new Scanner(System.in);
                    float deposit = s.nextInt();
                    float price;
                    price = (float) 2.00;
                    float wallet = deposit - price;
                    if (wallet < 0) {
                        System.out.println("U heeft niet genoeg geld");
                    } else {
                        System.out.println("Je hebt nog " + wallet + " euro wisselgeld.");
                    }

                }
                if (eten.equals("ongezond")) {
                    System.out.println("Options: 1 = Patat, 2 = Frikandel, 3 = Kroket");
                }

                String ongezond = scan.nextLine();
                if (ongezond.equals("1")) {
                    System.out.println("Dat is dan 2 euro - Type PAYC1 om te betalen");
                    String PAYC1 = scan.nextLine();
                    if (PAYC1.equals("PAYC1")) {
                        System.out.println("Om te betalen deposit: 1 euro, 2 euro, 5 euro of 10 euro");
                        Scanner s = new Scanner(System.in);
                        float deposit = s.nextInt();
                        float price;
                        price = (float) 3.00;
                        float wallet = deposit - price;
                        if (wallet < 0) {
                            System.out.println("Je hebt niet genoeg geld.");
                        } else {
                            System.out.println("Je hebt nog " + wallet + " euro wisselgeld.");
                        }
                    }

                }
                if (ongezond.equals("2")) {
                    System.out.println("Dat is dan 2 euro - Type PAYC2 om te betalen");
                    String PAYC2 = scan.nextLine();
                    if (PAYC2.equals("PAYC2")) {
                        System.out.println("Om te betalen deposit: 1 euro, 2 euro, 5 euro of 10 euro");
                        Scanner s = new Scanner(System.in);
                        float deposit = s.nextInt();
                        float price;
                        price = (float) 2.00;
                        float wallet = deposit - price;
                        if (wallet < 0) {
                            System.out.println("Je hebt niet genoeg geld.");
                        } else {
                            System.out.println("Je hebt nog " + wallet + " euro wisselgeld.");
                        }
                    }
                }
                if (ongezond.equals("3")) {
                    System.out.println("Dat is dan 1 euro - Type PAYC3 om te betalen");
                    String PAYC3 = scan.nextLine();
                    if (PAYC3.equals("PAYC3")) {
                        System.out.println("Om te betalen deposit: 1 euro, 2 euro, 5 euro of 10 euro");
                        Scanner s = new Scanner(System.in);
                        float deposit = s.nextInt();
                        float price;
                        price = (float) 2.00;
                        float wallet = deposit - price;
                        if (wallet < 0) {
                            System.out.println("Je hebt niet genoeg geld.");
                        } else {
                            System.out.println("Je hebt nog " + wallet + " euro wisselgeld.");
                        }
                    }
                }
                if (eten.equals("drinken")) {
                    System.out.println("Wat wil je drinken");

                    String drinken = scan.nextLine();

                    if (drinken.equals("drinken")) {
                        System.out.println("Options: 1 = Soda, 2 = Sap 3 = Water");
                    }
                    if (drinken.equals("1")) {
                        System.out.println("Dat is dan 2 euro - Type PAYV1 om te betalen");
                        String PAYV1 = scan.nextLine();
                        if (PAYV1.equals("PAYV1")) {
                            System.out.println("Om te betalen depost: 1 euro, 2 euro, 5 euro of 10 euro");
                            Scanner s = new Scanner(System.in);
                            float deposit = s.nextInt();
                            float price;
                            price = (float) 2.00;
                            float wallet = deposit - price;
                            if (wallet < 0) {
                                System.out.println("Je hebt niet genoeg geld.");
                            } else {
                                System.out.println("Je hebt nog " + wallet + " euro wisselgeld.");
                            }
                        }
                    }
                    if (drinken.equals("2")) {
                        System.out.println("Dat is dan 1 euro - Type PAYV2 om te betalen");
                        String PAYV2 = scan.nextLine();
                        if (PAYV2.equals("PAYV2")) {
                            System.out.println("Om te betalen depost: 1 euro, 2 euro, 5 euro of 10 euro");
                            Scanner s = new Scanner(System.in);
                            float deposit = s.nextInt();
                            float price;
                            price = (float) 1.00;
                            float wallet = deposit - price;
                            if (wallet < 0) {
                                System.out.println("Je hebt niet genoeg geld.");
                            } else {
                                System.out.println("Je hebt nog " + wallet + " euro wisselgeld.");
                            }
                        }
                    }
                    if (drinken.equals("3")) {
                        System.out.println("Dat is dan 0.50 euro - Type PAYV3 om te betalen");
                        String PAYV3 = scan.nextLine();
                        if (PAYV3.equals("PAYV3")) {
                            System.out.println("Om te betalen depost: 1 euro, 2 euro, 5 euro of 10 euro");
                            Scanner s = new Scanner(System.in);
                            float deposit = s.nextInt();
                            float price;
                            price = (float) 0.50;
                            float wallet = deposit - price;
                            if (wallet < 0) {
                                System.out.println("Je hebt niet genoeg geld.");
                            } else {
                                System.out.println("Je hebt nog " + wallet + " euro wisselgeld.");
                            }

                        }
                    }
                }
            }
        }
    }
}