public class Student {

    String firstName;
    String lastName;
    int expectedYearOfGraduation;
    double GPA;
    String declaredMajor;

    public Student(String firstName, String lastName,
                        int expectedYearOfGraduation,
                        double GPA, String declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearOfGraduation = expectedYearOfGraduation;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public void incrementExpectedYearOfGraduation(){
        this.expectedYearOfGraduation = this.expectedYearOfGraduation + 1;
    }
}
