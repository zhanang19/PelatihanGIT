package pelatihangit;

import java.util.Scanner;

/**
 *
 * @author zhanang19
 */
public class PelatihanGIT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah data : ");
        int jumlahArray = scan.nextInt();
        int [] dataArray = new int[jumlahArray];
        int totalData = 0;
        boolean error = false;
        int dataMaximum = 0;
        int dataMinimum = 2147483647;
        for (int i = 0; i < jumlahArray; i++) {
            do {
                System.out.print("Masukkan data ke-" + (i+1) + " : ");
                int tempData = scan.nextInt();
                    if (tempData <= 100) {
                        dataArray[i] = tempData;
                        totalData += tempData;
                        error = false;
                    }else{
                        System.out.println("Input salah!");
                        error = true;
                    }
            } while (error);
            if (dataArray[i] > dataMaximum) {
                dataMaximum = dataArray[i];
            }
            if (dataArray[i] < dataMinimum) {
                dataMinimum = dataArray[i];
            }
        }
        for (int i = 0; i < jumlahArray; i++) {
            System.out.println("Data ke " + (i+1) + " : " + dataArray[i]);
        }
        System.out.println("Data Maksimum : " + dataMaximum);
        System.out.println("Data Minimum : " + dataMinimum);
        System.out.println("Rata-rata : " + (totalData/jumlahArray));
        
        
    }
    
}
