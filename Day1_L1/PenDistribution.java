public class PenDistribution {
    public static void main(String[] args) {
        // Given values
        int totalPens = 14;
        int students = 3;
        
        // Calculate how many pens each student will get
        int pensPerStudent = totalPens / students;
        
        // Calculate the remaining pens that cannot be equally distributed
        int remainingPens = totalPens % students;
        
        // Output the results
        System.out.println("Each student will get: " + pensPerStudent + " pens.");
        System.out.println("Remaining pens: " + remainingPens);
    }
}