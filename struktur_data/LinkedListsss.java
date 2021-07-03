package com.company.algoritm_problem_solving.struktur_data;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListsss {
    //linked list menyimpan elemen secara non-contiguosouly
    //yaitu element dapat terletak pada lokasi memroy yang saling berjauhan. bandingkan dengan array
    // dimana tiap2 element akan terletak pada lokasi memory yang berurutan

    public static void main(String[] args) {
        LinkedList<String> aa = new LinkedList<String>();

        Scanner bb = new Scanner(System.in);

        int ulang = 0;
        while (ulang != 7) {
            System.out.println("menu operasi dalam linked list");
            System.out.println(" 1.penambahan \n" + " 2.hapus \n" + " 3.ukuran \n" + " 4.cari \n" + " 5.ubah\n" + " 6.ambil\n" + " 7.exit\n");
            System.out.print("pilih operasi: ");

            int pilih = bb.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("menu operasi tambahan : \n" + " 1.penambahan \n" + " 2.penambahan diawal \n" + " 3.penambahan diakhir");
                    System.out.print("pilih model penambahan :");
                    int pilih_tam = bb.nextInt();
                    switch (pilih_tam) {
                        case 1:
                            System.out.print("masukkan data yang akan ditambahkan :");
                            String tambah = bb.next();
                            aa.add(tambah);
                            break;
                        case 2:
                            System.out.print("masukkan data yang akan ditambahkan pada awal :");
                            tambah = bb.next();
                            aa.addFirst(tambah);
                            break;
                        case 3:
                            System.out.print("masukkan data yang akan ditambahkan pada akhir :");
                            tambah = bb.next();
                            aa.addLast(tambah);
                            break;
                        default:
                            break;

                    }
                case 2:
                    System.out.println("menu operasi hapus : \n" + " 1.hapus \n" + " 2.hapus diawal \n" + " 3.hapus diakhir");
                    System.out.print("pilih model hapus :");
                    int pilih_hap = bb.nextInt();
                    switch (pilih_hap) {
                        case 1:
                            aa.remove();
                            break;
                        case 2:
                            aa.removeFirst();
                            break;
                        case 3:
                            aa.removeLast();
                            break;
                        default:
                            break;
                    }
            }
        }

    }
}