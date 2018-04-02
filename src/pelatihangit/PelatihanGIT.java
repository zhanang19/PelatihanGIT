package pelatihangit;

import java.util.Scanner;

/**
 *
 * @author zhanang19
 */
public class PelatihanGIT {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahArray;
        int tempData;
        int[] dataArray;
        int totalData = 0;
        boolean error;
        int dataMaximum = 0;
        int dataMinimum = 100;

        System.out.print("Jumlah data : ");
        jumlahArray = scan.nextInt();
        dataArray = new int[jumlahArray];
        for (int i = 0; i < jumlahArray; i++) {
            do {
                System.out.print("Masukkan data ke-" + (i + 1) + " : ");
                tempData = scan.nextInt();
                if (tempData <= 100 && tempData > 0) {
                    dataArray[i] = tempData;
                    totalData += tempData;
                    error = false;
                } else {
                    System.out.println("Input salah! Masukkan dalam range 1-100!");
                    error = true;
                }
            } while (error);
            if (dataArray[i] > dataMaximum) {
                dataMaximum = dataArray[i];
            } else if (dataArray[i] < dataMinimum) {
                dataMinimum = dataArray[i];
            }
        }
        for (int i = 0; i < jumlahArray; i++) {
            System.out.println("Data ke " + (i + 1) + " : " + dataArray[i]);
        }
        System.out.println("Data Maksimum : " + dataMaximum);
        System.out.println("Data Minimum : " + dataMinimum);
        System.out.println("Rata-rata : " + (totalData / jumlahArray));
    }

}
