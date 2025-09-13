import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MergeSort {
    private static String fileName = "D:\\Projects\\Java-Files\\OOPS\\Sorting\\GivenFIle.txt";
    private static String file1 = "D:\\Projects\\Java-Files\\OOPS\\Sorting\\file1.txt";
    private static String file2 = "D:\\Projects\\Java-Files\\OOPS\\Sorting\\file2.txt";

    public static void main(String[] args) throws Exception {
        int runCount = 1;
        do {
            runCount = split();
            merge();
        } while (runCount > 1);
    }

    public static int split() throws Exception {
        Scanner scanner = new Scanner(new File(fileName));
        BufferedWriter br1 = new BufferedWriter(new FileWriter(file1));
        BufferedWriter br2 = new BufferedWriter(new FileWriter(file2));
        BufferedWriter currWrFile = br1;
        int runCount = 1;
        if (scanner.hasNext()) {
            int n1 = Integer.parseInt(scanner.nextLine());
            currWrFile.write(String.valueOf(n1));
            currWrFile.newLine();
            while (scanner.hasNext()) {
                int n2 = Integer.parseInt(scanner.nextLine());
                if (n1 > n2) {
                    currWrFile = currWrFile == br1 ? br2 : br1;
                    currWrFile.write(String.valueOf(n2));
                    currWrFile.newLine();
                    runCount++;
                } else {
                    currWrFile.write(String.valueOf(n2));
                    currWrFile.newLine();
                }
                n1 = n2;
            }

        }
        scanner.close();
        br1.close();
        br2.close();

        return runCount;
    }
    public static void merge() throws Exception {
    BufferedWriter given = new BufferedWriter(new FileWriter(fileName));
    Scanner scanner1 = new Scanner(new File(file1));
    Scanner scanner2 = new Scanner(new File(file2));

    // Agar file khali ho jaaye to handle karne ke liye
    boolean has1 = scanner1.hasNext();
    boolean has2 = scanner2.hasNext();

    int n1 = has1 ? Integer.parseInt(scanner1.nextLine()) : Integer.MAX_VALUE;
    int n2 = has2 ? Integer.parseInt(scanner2.nextLine()) : Integer.MAX_VALUE;

    // Jab tak dono mein se koi data bacha hai
    while (has1 || has2) {
        if (n1 <= n2) {
            given.write(String.valueOf(n1));
            given.newLine();
            has1 = scanner1.hasNext();
            n1 = has1 ? Integer.parseInt(scanner1.nextLine()) : Integer.MAX_VALUE;
        } else {
            given.write(String.valueOf(n2));
            given.newLine();
            has2 = scanner2.hasNext();
            n2 = has2 ? Integer.parseInt(scanner2.nextLine()) : Integer.MAX_VALUE;
        }
    }

    scanner1.close();
    scanner2.close();
    given.close();
    }
}