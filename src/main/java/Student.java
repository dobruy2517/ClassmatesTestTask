public class Student extends Human {
    private boolean present;
    private boolean captain;
    private int avarageScore;
    private int softSkils;
    private int socialPerformance;
    private int communicability;

    public Student(String firstName, String lastName, boolean present, boolean captain, int avarageScore, int softSkils, int socialPerformance, int communicability) {
        super(firstName, lastName);
        this.present = present;
        this.captain = captain;
        this.avarageScore = avarageScore;
        this.softSkils = softSkils;
        this.socialPerformance = socialPerformance;
        this.communicability = communicability;
    }

    public boolean isPresent() {
        return present;
    }

    public Student setPresent(boolean present) {
        this.present = present;
        return this;
    }

    public boolean isCaptain() {
        return captain;
    }

    public Student setCaptain(boolean captain) {
        this.captain = captain;
        return this;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public Student setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
        return this;
    }

    public int getSoftSkils() {
        return softSkils;
    }

    public Student setSoftSkils(int softSkils) {
        this.softSkils = softSkils;
        return this;
    }

    public int getSocialPerformance() {
        return socialPerformance;
    }

    public Student setSocialPerformance(int socialPerformance) {
        this.socialPerformance = socialPerformance;
        return this;
    }

    public int getCommunicability() {
        return communicability;
    }

    public Student setCommunicability(int communicability) {
        this.communicability = communicability;
        return this;
    }
}
