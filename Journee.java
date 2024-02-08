import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Journee {
    private List<Auteur> listeAuteurs;
    private int spectateurs;

    public Journee(Auteur auteur1, Auteur auteur2, int spectateurs) {
        this.listeAuteurs = new ArrayList<>();
        this.listeAuteurs.add(auteur1);
        this.listeAuteurs.add(auteur2);

        this.spectateurs = spectateurs;
    }

    public int getSpectateurs() {
        return this.spectateurs;

    }

    public Map<String, Integer> getScoreMatin(){
        Map<String, Integer> scoreMatin = new HashMap<>();
        for (int i=0; i<2; i++) {
            scoreMatin.put(this.listeAuteurs.get(i).getNom(), this.listeAuteurs.get(i).getQualTragedie()*spectateurs);
        }
        return scoreMatin;
    }

    public Map<String, Integer> getScoreApresMidi(){
        Map<String, Integer> scoreApresMidi = new HashMap<>();
        for (int i=0; i<2; i++) {
            scoreApresMidi.put(this.listeAuteurs.get(i).getNom(), this.listeAuteurs.get(i).getQualCom()*spectateurs);
        }
        return scoreApresMidi;
    }

    public Map<String, Integer> getScoreSoiree(){
        Map<String, Integer> scoreSoiree = new HashMap<>();
        for (int i=0; i<2; i++) {
            scoreSoiree.put(this.listeAuteurs.get(i).getNom(), this.listeAuteurs.get(i).getQualDram()*spectateurs);
        }
        return scoreSoiree;
    }

    public String victoire(){
        int scoreAuteur1 = this.getScoreMatin().get(this.listeAuteurs.get(0).getNom()) + this.getScoreApresMidi().get(this.listeAuteurs.get(0).getNom()) + this.getScoreSoiree().get(this.listeAuteurs.get(0).getNom());;
        int scoreAuteur2 = this.getScoreMatin().get(this.listeAuteurs.get(1).getNom()) + this.getScoreApresMidi().get(this.listeAuteurs.get(1).getNom()) + this.getScoreSoiree().get(this.listeAuteurs.get(1).getNom());;
        if (scoreAuteur1 > scoreAuteur2) {
            return "Le gagnant est " + this.listeAuteurs.get(0).getNom();
        }
        else if (scoreAuteur2 > scoreAuteur1) {
            return "Le gagnant est " + this.listeAuteurs.get(1).getNom();
        }
        return "Egalité";
    }
}