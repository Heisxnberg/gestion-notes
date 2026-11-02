
import java.util.Scanner;

public class GestionNotes {

    public static void main(String[] args) {
        final double POIDS_DEVOIR = 0.4;
        final double POIDS_EXAMEN = 0.6;

        final int COEF_ALGO = 3;
        final int COEF_BD = 2;
        final int COEF_ANGLAIS = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("   RELEVÉ DE NOTES - L2");
        System.out.println("==============================");
        System.out.print("Prénom : ");
        String prenom = sc.nextLine();

        System.out.print("Nom : ");
        String nom = sc.nextLine();

        System.out.print("Âge : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Matricule : ");
        String matricule = sc.nextLine();

        System.out.println("Étudiant : " + prenom + " " + nom + " (" + age + " ans)");
        System.out.println("Matricule : " + matricule);

        Scanner input = new Scanner(System.in);

        System.out.print("Votre âge svp : ");
        int ageSaisi = input.nextInt();
        input.nextLine();

        System.out.print("Quel est votre nom complet : ");
        String nomComplet = input.nextLine();

        System.out.println("HI " + nomComplet + ", vous avez " + ageSaisi + " ans");

        input.close();
    }
}
