public class Main {

    public static void main(String[] args) {
        Student studentA = new Student("Ben", "Liverpool", 2006, 3.46, "CS");
        Student studentB = new Student("Aku", "Akunamatata", 2010, 4.5, "Mathematics");

        studentA.incrementExpectedYearOfGraduation();
        System.out.println(studentA.expectedYearOfGraduation);
    }
}