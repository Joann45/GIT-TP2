import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Auteur {
    private String nom;
    private Map<String, Integer> perfs;
    private Map<String, String> cita;

    public Auteur(String nom, int noteTrag,String citTrag,int noteCom, String citCom, int noteDra, String citDra){
        this.nom = nom;
        this.perfs = new HashMap<>();
        this.perfs.put("Tragédie",noteTrag);
        this.perfs.put("Commédie",noteCom);
        this.perfs.put("Drame",noteDra);
        this.cita = new HashMap<>();
        this.cita.put("Tragédie",citTrag);
        this.cita.put("Commédie", citCom);
        this.cita.put("Drame",citDra);
    }


    public int qualiteStyle(String StyleS) {
        return this.perfs.get(StyleS);
    }

    public String citationStyle(String StyleS) {
        return this.cita.get(StyleS);
    }

    public int getQualTragedie(){
        return this.perfs.get("Tragédie");
    }

    public String getCitationTragedie(){
        return this.cita.get("Tragédie");
    }
    
    public int getQualCom(){
        return this.perfs.get("Commédie");
    }

    public String getCitationCom(){
        return this.cita.get("Commédie");
    }

    public int getQualDram(){
        return this.perfs.get("Drame");
    }

    public String getCitationDram(){
        return this.cita.get("Drame");
    }

    public String meilleurCat(){
        int max=0;
        String cat = "";
        
        List<String> categories = new ArrayList<>();
        categories.add("Tragédie");
        categories.add("Commédie");
        categories.add("Drame");

        for (String categorie : categories) {
            if (this.perfs.get(categorie)>=max) {
                max = this.perfs.get(categorie);
                cat = categorie;
            }
        }
        return cat;
    }

    @Override

    public String toString(){
        return "L'honorable ".concat(this.nom);
    }
}
