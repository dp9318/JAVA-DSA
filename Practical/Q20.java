class Q20 {
    public static void main(String[] args) {
        String studentId = "101";
        String[] marksInput = {"85", "90", "abc"};
        int[] marks = new int[3];

        try {
            int id = Integer.parseInt(studentId);
            System.out.println("Processing results for Student ID: " + id);

            try {
                for (int i = 0; i < marksInput.length; i++) {
                    marks[i] = Integer.parseInt(marksInput[i]);
                }

                try {
                    int total = 0;
                    for (int i = 0; i <= marks.length; i++) {
                        total += marks[i];
                    }
                    int average = total / marks.length;
                    System.out.println("Average Marks: " + average);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Inner Catch (Array Index Error): " + e.getMessage());
                }

            } catch (NumberFormatException e) {
                System.out.println("Middle Catch (Invalid Marks Format): " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Outer Catch (General Processing Error): " + e.getMessage());
        } finally {
            System.out.println("Result validation completed.");
        }
    }
}

