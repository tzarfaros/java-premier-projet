package org.humanbboster.myproject;

import org.humanbboster.myproject.menu.Dessert;
import org.humanbboster.myproject.menu.Drink;
import org.humanbboster.myproject.menu.MainCourse;
import org.humanbboster.myproject.menu.Order;
import org.humanbboster.myproject.model.Bike;
import org.humanbboster.myproject.model.Car;
import org.humanbboster.myproject.model.Orc;
import org.humanbboster.myproject.model.Person;
import org.humanbboster.myproject.ordi.Computer;
import org.humanbboster.myproject.ordi.Printer;
import org.humanbboster.myproject.ordi.Repartitor;
import org.humanbboster.myproject.voiture.Voiture;

import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.Collectors;

public class Entry {

    public static void main(String[] args) {    //main
        exo11();
    }

    public static void exo11() {
        Order o1 = new Order("c1", Drink.BEER, MainCourse.BEEF, Dessert.CHOCOSNACK);
        System.out.println(o1.totalPrice());


        System.out.println(o1);
    }

    public static void exo10() {
        Printer p1 =new Printer("canon");
        Printer p2 =new Printer("epson");

        Repartitor.getInstance().getPrinters().add(p1);
        Repartitor.getInstance().getPrinters().add(p2);

        Computer c1 = new Computer("hp");
        Computer c2 = new Computer("hp");
        Computer c3 = new Computer("hp");

        c1.print();
        c2.print();
        c1.print();
        c1.print();
        c3.print();
        c3.print();
        c2.print();

    }

    public static void exo9() {
        List<Integer> numbers = Arrays.asList(10,20,30,40);
        List<Integer> doubleNumbers = numbers.stream().map(v -> v*2)
                .filter(v -> v >= 50)
                .collect(Collectors.toList());
        for (Integer doubleNumber : doubleNumbers) {
            System.out.println(doubleNumber);
        }
    }

    public static void exo8() {
        HashSet<Orc> teamBlue = new HashSet<>();
        HashSet<Orc> teamRed = new HashSet<>();

        Orc orc1 = new Orc("tauro", 150, 5);
        Orc orc2 = new Orc("toto", 150, 5);
        Orc orc3 = new Orc("tata", 150, 5);
        Orc orc4 = new Orc("pala", 150, 5);
        Orc orc5 = new Orc("poli", 150, 5);
        Orc orc6 = new Orc("pipi", 150, 5);

        teamBlue.add(orc1);
        teamBlue.add(orc2);
        teamBlue.add(orc3);

        teamRed.add(orc4);
        teamRed.add(orc5);
        teamRed.add(orc6);

        HashMap<Orc, HashSet<Orc>> team = new HashMap<>();

        team.put(orc1, teamBlue);
        team.put(orc4, teamRed);

        Set<Orc> keys = team.keySet();
        for (Orc key : keys) {
            System.out.println(key.name);
        }

        System.out.println("--------------------");

        Collection values = team.values();
        for (Object value : values) {
            System.out.println(value);
        }
    }

    public static void exo7() {
        HashMap<String, String> personnes = new HashMap<>();

        personnes.put("11", "tttt");

        Set<String> keys = personnes.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("--------------------");

        Collection values = personnes.values();
        for (Object value : values) {
            System.out.println(value);
        }

        //System.out.println(personnes.get("11"));
    }

    public static void exo6() {
        HashSet<Car> monSet = new HashSet<>();

        monSet.add(new Car("bleu", "toto", "allo"));
        monSet.add(new Car("bleu", "toto", "allo"));
        monSet.add(new Car("bleu", "tata", "y"));

        for (Car car : monSet) {
            System.out.println(car);
        }
        System.out.println(monSet.size());

    }

    public static void exo5() {
        // HashSet<> liste qui ne permet pas les doublons
        HashSet<String> monSet = new HashSet<>();


        Orc orc1 = new Orc("Grugct", 150, 5);
        Orc orc2 = new Orc("Grugct", 150, 5);

        // equals définit dans la class Orc compare des propriétés des objets.
        System.out.println(orc1.equals(orc2));

    }

    public static void exo4() {
        System.out.println("Bonjour");
        Scanner sc = new Scanner(System.in);
        ArrayList<Orc> orcs = new ArrayList<>();

        orcs.add(new Orc("Grugct", 150, 5));
        orcs.add(new Orc("JeanJacque", 60, 10));
        orcs.add(new Orc(200, 5));

        while (true) {
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1: Ajouter un Orc");
            System.out.println("2: Supprimer un Orc");
            System.out.println("3: Afficher la force totale");
            System.out.println("4: Quitter");
            System.out.print("votre choix ");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.println("Nom :");
                String name = sc.nextLine();
                System.out.println("Force :");
                int force = Integer.parseInt(sc.nextLine());
                System.out.println("Health :");
                int health = Integer.parseInt(sc.nextLine());
                orcs.add(new Orc(name, health, force));
                System.out.println("Saisie ok");
            } else if (choice == 2) {
                System.out.println("Quel Orc voulez-vous supprimer ? (Tapper son nom)");
                for (Orc orc : orcs) {
                    System.out.println(orc.name);
                }
                System.out.print("Nom : ");
                String orcName = sc.nextLine();
                Iterator it = orcs.iterator();
                while(it.hasNext()) {
                    Orc s = (Orc) it.next();
                    if (orcName.equalsIgnoreCase(s.name)) {
                        it.remove();
                        System.out.println(s.name + " Supprimé, il reste " + orcs.size() + " orcs.");
                    }
                }

            } else if (choice == 3) {
                int forceTotal = 0;
                for (Orc orc : orcs) {
                    forceTotal += orc.force;
                }
                System.out.println("Force cumulée : " + forceTotal);
            } else {
                System.out.println("Merci au revoir.");
                break;
            }
        }

    }

    public static void exo3() {
        Orc orc1 = new Orc("Grugct", 150, 5);
        Orc orc2 = new Orc("JeanJacque", 60, 10);
        Orc orc3 = new Orc(200, 5);

        System.out.println(orc1);
        System.out.println(orc2);
        orc1.attack(orc2);
        System.out.println(orc2);
        System.out.println(orc3);
    }

    public static void exo2() {
        Bike b1 = new Bike("vespa");
        b1.price = 10;

        Bike b2 = new Bike("rolo");
        b2.price = 50;

        b1.display();
        b1.comparePrice(b2);

        Person p1 = new Person("Isis");
        p1.age = 20;

        Person p2 = new Person("tidou", 3);

        p1.displayDetails();
        p2.displayDetails();
        p1.addToAge(10);
        System.out.println(p1.toString());
    }

    public static void exo1() {

        System.out.println("Bonjour, quel est votre nom ?");      //sout
        Scanner clavier = new Scanner(System.in);
        String name = clavier.nextLine();
        System.out.println("merci et votre âge ?");
        String age = clavier.nextLine();
        System.out.println("Bienvenue " + name + ", vous avez " + age + " ans");

        int number = Integer.parseInt(age);
        if (number < 18) {
            System.out.println("mineur");
        } else {
            System.out.println("majeur");
        }

        if (name.equalsIgnoreCase(("vincent"))){
            System.out.println("jolie prénom");
        }

        System.out.println("Dans un an, tu auras " + ++number);

        System.out.println("Choisissez une couleur : ( vert, jaune, rouge )");
        String color = clavier.nextLine();

        if (color.equalsIgnoreCase("vert") || color.equalsIgnoreCase("jaune") || color.equalsIgnoreCase("rouge")) {
            System.out.println("patate");
        } else {
            System.out.println("Je ne sais pas traduire le mot patate");
        }

        switch (color) {
            case "vert":
                System.out.println("green");
                break;
            case "jaune":
                System.out.println("yellow");
                break;
            case "rouge":
                System.out.println("red");
                break;
        }

        int nbr = 0;

        for (nbr = 1; nbr == 10; nbr++) {
            System.out.println(nbr);
        }
        System.out.println("boum!!");

        // tableau -------------------------

        int tab[] = new int[3];

        tab[0] = 2;
        tab[1] = 6;
        tab[2] = 10;

        int tabInit[] = {3, 4, 1};

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        // foreach --------------------------

        for (int a : tab) {
            System.out.println(a);
        }
    }

    public static void testTableau2() {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        System.out.println("Quelle taille ?");
        int taille = Integer.parseInt(sc.nextLine());

        int tab[] = new int[taille];

        for (int i = 0; i < tab.length; i++ ) {
            System.out.println("Quelle valeur pour la case d'indice " + i + "?");
            int ind = Integer.parseInt(sc.nextLine());
            tab[i] = ind;
        }

        for (int a : tab) {
            System.out.println(a);
            result += a;
        }

        System.out.println("Moyenne valeurs tableau : " + (result / tab.length));
    };

    public static void testTableau3() {
        int number = 0;
        int tab[] = {2,3,4,3,7,4,2};
        int tabResult[] = {0,0,0,0,0,0,0};

        for (int i = 0; i < tab.length; i++) {
            number = 0;
            System.out.println(tab[i] + " ");
            for (int g : tab) {
                if (g == tab[i]) {
                    number++;
                }
            }

            if (number > 1) {
                tabResult[i] = tab[i];
            } else {
                tabResult[i] = 0;
            }

        }
        System.out.println("--");
        for (int a : tabResult) {
            System.out.println(a);
        }

    };

    public static void pendu() {
        String secret = "Motorhead";
        int nbAttemps = 15;
        boolean[] answers = new boolean[secret.length()];
        char[] word = secret.toCharArray();
        boolean win = false;

        Scanner sc = new Scanner(System.in);

        while (nbAttemps > 0 && !win){
            for (int i = 0; i < word.length; i++) {
                System.out.print(answers[i] ? word[i] : '_' );
            }
            System.out.println();
            nbAttemps--;
            System.out.print("Letter >");
            String letter = sc.nextLine();
            win = true;
            for (int i = 0; i < word.length; i++) {
                if(letter.equalsIgnoreCase(Character.toString(word[i]))){
                    System.out.println("Trouvé:" + letter + " a l'index "+i);
                    answers[i] = true;
                }
                if(!answers[i]){
                    win = false;
                }
            }
        }
        if(win){
            System.out.println("Félicitation le mot à trouver était  "+secret);
        }
        System.out.println("Fin du jeu");

    };

    public static void higherNumberGame() {
        int hight = 0;
        Scanner clavier = new Scanner(System.in);

        for (int index = 1; index <= 6; index++) {
            System.out.println("nombre n : " + index);
            int userNumber = Integer.parseInt(clavier.nextLine());
            if (userNumber > hight || index == 1) {
                hight = userNumber;
            }
            System.out.println("nombre plus grand actuel: " + hight);
        }

        System.out.println("nombre plus grand : " + hight);
    };

    public static int guessNumberGame() {
        System.out.println("Nombre ?");
        Scanner clavier = new Scanner(System.in);
        String nrbMax = clavier.nextLine();
        int response = Integer.parseInt(nrbMax);
        Random rand = new Random();
        int nbrGame = rand.nextInt(10) + 1;
        int i = 0;

        while (true) {
            if (response == nbrGame) {
                System.out.println("trouvé!");
                System.out.println("Nombre d'essai pour trouver le chiffre " + nbrGame + " : " + i);
                break;
            } else if (response < nbrGame) {
                System.out.println("trop petit");
                nrbMax = clavier.nextLine();
                response = Integer.parseInt(nrbMax);
                ++i;
                continue;
            } else {
                System.out.println("trop grand");
                nrbMax = clavier.nextLine();
                response = Integer.parseInt(nrbMax);
                ++i;
                continue;
            }
        }
        return nbrGame;
    };

    public static int add(int x, int y) {
        return x + y;
    };

    public static int moins(int x, int y) {
        return x - y;
    };

    public static int mult(int x, int y) {
        return x * y;
    };

    public static int div(int x, int y) {
        return x / y;
    };

    public static void calcul() {
        Scanner clavier = new Scanner(System.in);
        int result = 0;
        System.out.println("Réaliser une opération : ");
        System.out.println("Entrer le premier nombre :");
        int x = Integer.parseInt(clavier.nextLine());

        while (true) {

            System.out.println("+ pour addition, - pour soustraction, * pour multiplier, / pour diviser");
            String operateur = clavier.nextLine();
            System.out.println("Entrer le deuxième nombre :");
            int y = Integer.parseInt(clavier.nextLine());
            System.out.println("Résultat :");

            if (operateur.equalsIgnoreCase("+")) {
                result = add(x, y);
                System.out.println(result);
                x = result;
                continue;
            } else if (operateur.equalsIgnoreCase("-")) {
                result = moins(x, y);
                System.out.println(result);
                x = result;
                continue;
            }  else if (operateur.equalsIgnoreCase("*")) {
                result = mult(x, y);
                System.out.println(result);
                x = result;
                continue;
            } else if (operateur.equalsIgnoreCase("/")){
                result = div(x, y);
                System.out.println(result);
                x = result;
                continue;
            } else {
                System.out.println("erreur, relance du programme");
                break;
            }
        }
    }

    public static void affiche() {
        System.out.println("bonjour");
    }

    public static void affiche(String string) {
        System.out.println(string);
    }

    public static void affiche(int number, String string) {
        System.out.println(string + " " + number);
    }

    public static void affiche(String string, int number) {
        System.out.println(string + " " + number);
    }


}

