public class gradesofscienceandmath {
    public static void main(String[] args) {
        int[][] grades = { {67, 62}, {89, 92}, {70, 80}, {93, 87}, {78, 56} };

        for (int i = 0; i <= 4; i++){
            System.out.print("Student " + (i+1) + ": ");
            System.out.print("Math: " + grades[i][0] + ", ");
            System.out.print("Science: " + grades[i][1] + "\n");
            }

        int math_sum = 0;
        for (int i = 0; i <= 4; i++){
            math_sum += grades[i][0];
        }
        System.out.println("Average Math Grade: " + (float) math_sum / 5);

        int science_sum = 0;
        for (int i = 0; i <= 4; i++){
            science_sum += grades[i][1];
        }
        System.out.println("Average Science Grade: " + (float) science_sum / 5);
    }
}
