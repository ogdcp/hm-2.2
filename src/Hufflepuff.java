public class Hufflepuff  extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honor;

    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int diligence, int loyalty, int honor) {
        super(name, powerOfMagic, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public String toString() {
        return super.toString()+ "Hufflepuff " +
                "diligence = " + diligence +
                ", loyalty = " + loyalty +
                ", honor = " + honor ;
    }
    @Override
    public int calculateSpecificScore() {
        return this.diligence + this.loyalty + this.honor;
    }

    @Override
    public void printCompareOfStudents(String betterStudentName, String otherStudentName) {
        System.out.println(String.format("%s лучший пуфендуец чем %s", betterStudentName, otherStudentName));
    }
}
