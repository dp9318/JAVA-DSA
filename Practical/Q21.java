import java.io.*;

class Q21 {
    public static void main(String[] args) {
        String data = "Roll: 101, Name: Rahul, Marks: 85\nRoll: 102, Name: Sneha, Marks: 92\n";

        try {
            FileOutputStream fos = new FileOutputStream("students_byte.txt");
            fos.write(data.getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("students_byte.txt");
            System.out.println("Reading via Byte Stream (FileInputStream):");
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Byte stream error: " + e.getMessage());
        }

        System.out.println();

        try {
            FileWriter fw = new FileWriter("students_char.txt");
            fw.write(data);
            fw.close();

            FileReader fr = new FileReader("students_char.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Reading via Character Stream (BufferedReader):");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Character stream error: " + e.getMessage());
        }
    }
}

