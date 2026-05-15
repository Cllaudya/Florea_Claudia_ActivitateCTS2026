package Adapter.model.SistemExtern;

public class CVExtern {
    private String numePrenume;
    private int vechime;
    private String[] skills;

    public CVExtern(String numePrenume, int vechime, String[] skills) {
        this.numePrenume = numePrenume;
        this.vechime = vechime;
        this.skills = skills;
    }

    public String getNumePrenume() {
        return numePrenume;
    }

    public int getVechime() {
        return vechime;
    }

    public String[] getSkills() {
        return skills;
    }
}
