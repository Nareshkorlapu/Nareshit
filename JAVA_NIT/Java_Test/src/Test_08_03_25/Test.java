package Test_08_03_25;

public class Test {

    public static void main(String[] args) {
        ScienceStudent s1 = new ScienceStudent("Anjali", 101, 85, 90, 80);
        System.out.println("Science Student Details:");
        s1.displayDetails();
        double sciencePercentage = s1.calculatePercentage();
        System.out.printf("Percentage is: %.2f%%\n", sciencePercentage);  
        System.out.println("=================================================================================");
        ArtsStudent s2 = new ArtsStudent("Aryan", 102, 75, 80, 85);
        System.out.println("Arts Student Details:");
        s2.displayDetails();
        double artsPercentage = s2.calculatePercentage();
        System.out.printf("Percentage is: %.2f%%", artsPercentage);  
    }

}

class Student {
    protected String name;
    protected int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
    }
}

class ScienceStudent extends Student {
    private int physicsMarks;
    private int chemistryMarks;
    private int mathsMarks;

    public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathsMarks) {
        super(name, rollNumber);
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathsMarks = mathsMarks;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Physics Marks: " + this.physicsMarks);
        System.out.println("Chemistry Marks: " + this.chemistryMarks);
        System.out.println("Maths Marks: " + this.mathsMarks);
    }

    public double calculatePercentage() {
        double per = ((this.physicsMarks + this.chemistryMarks + this.mathsMarks) / 300.0) * 100;
        return per;
    }
}

class ArtsStudent extends Student {
    private int historyMarks;
    private int geographyMarks;
    private int englishMarks;

    public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
        super(name, rollNumber);
        this.historyMarks = historyMarks;
        this.geographyMarks = geographyMarks;
        this.englishMarks = englishMarks;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("History Marks: " + this.historyMarks);
        System.out.println("Geography Marks: " + this.geographyMarks);
        System.out.println("English Marks: " + this.englishMarks);
    }

    public double calculatePercentage() {
        double per = ((this.historyMarks + this.geographyMarks + this.englishMarks) / 300.0) * 100;
        return per;
    }
}
