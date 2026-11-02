
import java.util.Scanner;

public class GestionNotes {
// constantes de calcul
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
        // Saisie de l'identité
         System.out.print("Prénom : ");
        String prenom = sc.nextLine();

        System.out.print("Nom : ");
        String nom = sc.nextLine();

        System.out.print("Âge : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Matricule : ");
        String matricule = sc.nextLine();

        // Saisie des notes

        System.out.print("Devoir Algorithmique : ");
        double devoirAlgo = sc.nextDouble();

        System.out.print("Examen Algorithmique : ");
        double examenAlgo = sc.nextDouble();
        double moyenneAlgo = devoirAlgo * POIDS_DEVOIR
                + examenAlgo * POIDS_EXAMEN;

        System.out.print("Devoir Base de données : ");
        double devoirBd = sc.nextDouble();


        System.out.print("Examen Base de données : ");
        double examenBd = sc.nextDouble();
        double moyenneBd = devoirBd * POIDS_DEVOIR
                + examenBd * POIDS_EXAMEN;

        System.out.print("Devoir Anglais : ");
        double devoirAnglais = sc.nextDouble();

        System.out.print("Examen Anglais : ");
        double examenAnglais = sc.nextDouble();
        double moyenneAnglais = devoirAnglais * POIDS_DEVOIR
                + examenAnglais * POIDS_EXAMEN;
        int sommeCoefs = COEF_ALGO + COEF_BD + COEF_ANGLAIS;
// Calcul des moyennes
        double moyenneGenerale =
                (moyenneAlgo * COEF_ALGO
                        + moyenneBd * COEF_BD
                        + moyenneAnglais * COEF_ANGLAIS)
                        / sommeCoefs;
        // Affichage du relevé
        System.out.println("Brut : " + moyenneAlgo + " | "
                + moyenneBd + " | " + moyenneAnglais
                + " | " + moyenneGenerale);
    }
}
