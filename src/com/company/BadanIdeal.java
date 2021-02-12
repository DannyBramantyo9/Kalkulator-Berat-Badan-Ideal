package com.company;
import java.util.Scanner;

public class BadanIdeal {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int menu = 0;
        do{
            System.out.println("\n Kalkulator Badan Ideal dan Kesehatan");
            System.out.println("1. Kalkulator Berat Badan Ideal");
            System.out.println("2. Kalkulator Penggunaan Kalori Harian (BMR)");
            System.out.println("3. Kalkulator Kebutuhan Kalori Harian");
            System.out.println("4. Keluar");
            System.out.println("Silahkan pilih menu yang diinginkan:");
            menu =  in.nextInt();
            switch (menu){
                case 1:
                    countBMI();
                    break;
                case 2:
                    countBMR();
                    break;
                case 3:
                    countDaily();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu Tidak Ada");
                    break;
            }
        }
        while ( menu != 4);
    }
    public static void countBMI(){

        System.out.println("Kalkulator Berat Badan Ideal");
        double berat,tinggi, BMI;
        System.out.print("Masukkan Berat Badan (kg) : ");
        berat = in.nextDouble();

        System.out.print("Masukkan Tinggi Badan (cm) : ");
        tinggi = in.nextDouble();

        BMI = berat / ((tinggi/100) * (tinggi/100));

        System.out.println(" Body Mass Index anda adalah : "+BMI );
        if(BMI < 17.0){
            System.out.println("Anda termasuk kategori Kekurangan Berat Badan Tingkat Berat");
        }
        else if(BMI >= 17.0 && BMI <= 18.4){
            System.out.println("Anda termasuk kategori Kekurangan Berat Badan Tingkat Ringan");
        }
        else if(BMI >= 18.5 && BMI <= 25.0){
            System.out.println("Anda termasuk kategori Normal");
        }
        else if(BMI >= 25.1 && BMI <= 27.0){
            System.out.println("Anda termasuk kategori Kelebihan Berat Badan Tingkat Ringan");
        }
        else {
            System.out.println("Anda termasuk kategori Kelebihan Berat Badan Tingkat Berat");
        }
    }

    public static void countBMR(){
        System.out.println("Kalkulator Penggunaan Kalori Harian (BMR)");
        int kel;
        double BMR,tb,bb,umur;
        System.out.println("Pilih Jenis Kelamin Anda : ");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        kel = in.nextInt();
        switch (kel) {
            case 1:
                System.out.print("Masukkan Berat Badan (kg) : ");
                bb = in.nextDouble();

                System.out.print("Masukkan Tinggi Badan (cm) : ");
                tb = in.nextDouble();

                System.out.print("Masukkan Umur (tahun) : ");
                umur = in.nextDouble();

                BMR = 5 + (10 * bb) + (6.25 * tb) - (5 * umur);
                System.out.println("Maka BMR Anda adalah : " + BMR);
                break;
            case 2:
                System.out.print("Masukkan Berat Badan (kg) : ");
                bb = in.nextDouble();

                System.out.print("Masukkan Tinggi Badan (cm) : ");
                tb = in.nextDouble();

                System.out.print("Masukkan Umur (tahun) : ");
                umur = in.nextDouble();

                BMR = (10 * bb) + (6.25 * tb) - (5 * umur) - 161;
                System.out.println("Maka BMR Anda adalah : " + BMR + "kkal");
                break;
        }
    }

    public static void countDaily(){
        System.out.println("3. Kalkulator Kebutuhan Kalori Harian");
        int status,tingkat;
        double bmr;
        System.out.println("Apakah anda sudah mengetahui BMR anda ?");
        System.out.println("1. Sudah");
        System.out.println("2. Belum");
        status = in.nextInt();
        switch (status){
            case 1:
                System.out.println("Pilih Tingkat kepadatan aktivitas anda : ");
                System.out.println("1. Aktivitas dan Olahraga ringan");
                System.out.println("2. Aktivitas ringan dan Olahraga 1-3 hari seminggu");
                System.out.println("3. Aktivitas sedang dan Olahraga 3-5 hari seminggu");
                System.out.println("4. Aktivitas sedang dan Olahraga 6-7 hari seminggu");
                System.out.println("5. Aktivitas Berat dan Pekerjaaan Lapangan / Fisik");
                tingkat = in.nextInt();
                switch (tingkat){
                    case 1:
                        System.out.print("Masukkan BMR anda : ");
                        bmr = in.nextDouble();
                        System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : "+bmr*1.2 + "kkal");
                        break;
                    case 2:
                        System.out.print("Masukkan BMR anda : ");
                        bmr = in.nextDouble();
                        System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : "+bmr*1.375 + "kkal");
                        break;
                    case 3:
                        System.out.print("Masukkan BMR anda : ");
                        bmr = in.nextDouble();
                        System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : "+bmr*1.55 + "kkal");
                        break;
                    case 4:
                        System.out.print("Masukkan BMR anda : ");
                        bmr = in.nextDouble();
                        System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : "+bmr*1.725 + "kkal");
                        break;
                    case 5:
                        System.out.print("Masukkan BMR anda : ");
                        bmr = in.nextDouble();
                        System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : "+bmr*1.9 + "kkal");
                        break;
                }
                break;
            case 2:
                int gen;
                double Tb,Bb,Umur;
                System.out.println("Pilih Jenis Kelamin Anda : ");
                System.out.println("1. Laki-Laki");
                System.out.println("2. Perempuan");
                gen = in.nextInt();
                switch (gen) {
                    case 1:
                        System.out.print("Masukkan Berat Badan (kg) : ");
                        Bb = in.nextDouble();

                        System.out.print("Masukkan Tinggi Badan (cm) : ");
                        Tb = in.nextDouble();

                        System.out.print("Masukkan Umur (tahun) : ");
                        Umur = in.nextDouble();

                        bmr = 5 + (10 * Bb) + (6.25 * Tb) - (5 * Umur);
                        System.out.println("Maka BMR Anda adalah : " + bmr + "kkal");
                        System.out.println("Pilih Tingkat kepadatan aktivitas anda : ");
                        System.out.println("1. Aktivitas dan Olahraga ringan");
                        System.out.println("2. Aktivitas ringan dan Olahraga 1-3 hari seminggu");
                        System.out.println("3. Aktivitas sedang dan Olahraga 3-5 hari seminggu");
                        System.out.println("4. Aktivitas sedang dan Olahraga 6-7 hari seminggu");
                        System.out.println("5. Aktivitas Berat dan Pekerjaaan Lapangan / Fisik");
                        tingkat = in.nextInt();
                        switch (tingkat) {
                            case 1:
                                System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : " + bmr * 1.2 + "kkal");
                                break;
                            case 2:
                                System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : " + bmr * 1.375 + "kkal");
                                break;
                            case 3:
                                System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : " + bmr * 1.55 + "kkal");
                                break;
                            case 4:
                                System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : " + bmr * 1.725 + "kkal");
                                break;
                            case 5:
                                System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : " + bmr * 1.9 + "kkal");
                                break;
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan Berat Badan (kg) : ");
                        Bb = in.nextDouble();

                        System.out.print("Masukkan Tinggi Badan (cm) : ");
                        Tb = in.nextDouble();

                        System.out.print("Masukkan Umur (tahun) : ");
                        Umur = in.nextDouble();

                        bmr = (10 * Bb) + (6.25 * Tb) - (5 * Umur) - 161;
                        System.out.println("Maka BMR Anda adalah : " + bmr + "kkal");
                        System.out.println("Pilih Tingkat kepadatan aktivitas anda : ");
                        System.out.println("1. Aktivitas dan Olahraga ringan");
                        System.out.println("2. Aktivitas ringan dan Olahraga 1-3 hari seminggu");
                        System.out.println("3. Aktivitas sedang dan Olahraga 3-5 hari seminggu");
                        System.out.println("4. Aktivitas sedang dan Olahraga 6-7 hari seminggu");
                        System.out.println("5. Aktivitas Berat dan Pekerjaaan Lapangan / Fisik");
                        tingkat = in.nextInt();
                        switch (tingkat) {
                            case 1:
                                System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : " + bmr * 1.2 + "kkal");
                                break;
                            case 2:
                                System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : " + bmr * 1.375 + "kkal");
                                break;
                            case 3:
                                System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : " + bmr * 1.55 + "kkal");
                                break;
                            case 4:
                                System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : " + bmr * 1.725 + "kkal");
                                break;
                            case 5:
                                System.out.println("Maka Kebutuhan Kalori Harian Anda Adalah : " + bmr * 1.9 + "kkal");
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
