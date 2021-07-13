package com.company.algoritm_problem_solving.struktur_data;


//STRUKTUR DATA GRAPH
//menggunakan Adjaceny Matrix & Adjaceny List
//
//Graph digunakan untuk mempresentasikan objek-objek diskrit
//dan hubungan antara objek-objek tersebut
//Graph G=(v,E)
//V= himpunan tidak kosong dari simpul-simpul(vertices) = {v1,v2,....vn}
//E = himpunan sisi (edges) yang menghubungkan sepasang simpul = {e1,e2,....}


//shore path pada graph
//
//Greedy = serakah
//
//pada setiap langkah algoritma pencarian greedy akan memilih nilai terbaik yang
//ada dihadapannya tanpa memperhitungkan nilai yang ada pada langkah berikutnya

//
//langkah-langkah program
//1.input adjacencyMatrix
//2. set vertex awal
//3. set Vertex akhir
//4.vertexasal = vertexawal
//5. while(vetexasal !=vertexAkhir) {
//6.    vertextujuan = -1;
//
//7.pilih kandidat vertex tujuan dengan bobot edge terkecil sebagai vertexTujuan
//8.vertexAsal = vertexTujuan
//9. } end dari white


//=================TENTANG VECTOR=====================
//Hampir serupa dengan ArrayList, Vector memiliki sejumlah method yang sama dengan ArrayList yang dapat digunakan
//untuk memanipulasi suatu vector.
//Berbagai operasi dapat Anda lakukan terhadap Vector yang sama dengan * ArrayList* seperti berikut:
//
//size(), untuk mencari panjang ArrayList
//add(), untuk menambah elemen baru
//get(), untuk mengambil elemen pada indeks tertentu
//isEmpty(), untuk memeriksa apakah ArrayList kosong atau tidak
//indexOf(), untuk mengetahui indeks dari suatu nilai
//contains(), untuk memeriksa apakah suatu nilai ada dalam ArrayList
//set(), untuk menimpa nilai pada indeks tertentu
//remove(), untuk menghapus nilai pada indeks tertentu
//Sedangkan operasi yang dikhususkan untuk vector antara lain:
//firstElement(), mengambil nilai elemen pertama dari vector
//lastElement(), mengambil nilai elemen terakhir dari vector
//insertElementAt(), menyisipkan nilai elemen pada indeks tertentu di dalam vector

import java.util.Arrays;
import java.util.Vector;

public class Graph {

    public static void main(String[] args) {
        //buat vertex
        char[] lable = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};
//                       0    1    2    3    4    5    6    7    8    9    10   11

        //yang dicari adalah jarak dari d -> k

        double[][] adjacencyMatrix = {
                {0, 5, 3.8, 7, 0, 0, 0, 0, 0, 0, 0, 0},
                {5, 0, 0, 0, 0, 6, 0, 9.4, 0, 0, 0, 0},
                {3.8, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0,},
                {7, 0, 0, 0, 2, 0, 5, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 0, 14, 0, 0, 0, 0, 17},
                {0, 6, 4, 0, 0, 0, 3, 7, 9, 0, 0, 0},
                {0, 0, 0, 5, 14, 3, 0, 0, 0, 6, 0, 0},
                {0, 9.4, 0, 0, 0, 7, 0, 0, 0, 0, 24, 0},
                {0, 0, 0, 0, 0, 9, 0, 0, 0, 4, 29, 5},
                {0, 0, 0, 0, 0, 0, 6, 0, 4, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 24, 29, 0, 0, 8},
                {0, 0, 0, 0, 17, 0, 0, 0, 5, 0, 8, 0},
        };

        //lakukan inisialisasi
        boolean[] visited = new boolean[lable.length];

        //set index vertex awal dan index vertex akhir
        int indexVertexAwal = 3;
        int indexVertexAkhir = 10;

        double totalBobot = 0; //seiring berjalannya looping maka nilai total bobot akan terus ditambah


        //buat variable asal
        int vertexAsal = indexVertexAwal;

        //tandai vertex asal sebagai vertex yang telah dikunjungi
        visited[vertexAsal] = true;
        System.out.print("Path: "+lable[vertexAsal]);

        while (vertexAsal != indexVertexAkhir) { //lakukan looping hingga menemukan vertex akhir
            //inisilisasi vertex tujuan =-1
            int vertexTujuan = -1;


            //mencari kandidat vertex tujuan

            //memilih vertex tujuan dari kandidat vertex tujuan yang bobot edgenya paling kecil

            //buat array kandidat vertex tujuan
            Vector<Integer> kandidatVertexTujuan = new Vector<>();

            //ini adalah strategi algoritma yang biasa digunakan di selection sort
            double MIN = Double.MAX_VALUE; //set nilainya dengan angka yang paling besar yang ada dalam tipe data double


            //lakukan looping untuk mencari kandidat solusi
            for (int i = 0; i < adjacencyMatrix[vertexAsal].length; i++) {

                double bobot = adjacencyMatrix[vertexAsal][i];

                //set vertex tujuan apakah sudah dikunjungi atau belum
                boolean isVisited = visited[i];

//                lakukan kondisi filter
//                kondisi 1 =jika bobot lebih besar dari 0 ini menandai bahwa dia adalah vertex yang saling adjacency ke vertexAsal
//                  kondisi 2 = jika visited = false, berarti belum dikunjungi
//                  kondisi 3 = jika bobotnya lebih kecil dari bobot MIN
                if (bobot > 0 && !isVisited && bobot < MIN) {

                    //lakukan update pada nilai min
                    MIN = bobot;

                    //INI VARIABLE PENANDA BAHWA VETEXTUJUAN BUKAN LAGI = -1
                    vertexTujuan = i;
                }

            }


            //set vertex tujuan akan menjadi vetex asal pada iterasi looping berikutnya
            //jika vertex tujuan masih bernilai -1 maka pencarian berkahir karena tidak ada kandidat vertex
            if (vertexTujuan != -1) {
                //maka tandai visited dengan true, agar vertex tidak dikunjungi lagi
                visited[vertexTujuan] = true;

                //cetak hasilnya
                System.out.print("-" + lable[vertexTujuan]);

                //lihat bobot
                double bobot = adjacencyMatrix[vertexAsal][vertexTujuan];

                //kemudian tambahkan bobot ke totalbobt, proses ini adalah mengupdate nilai bobot baru yg sebelumnya = 0
                totalBobot += bobot;

                //update nilai vertexASAL, yang mana vertexTujuan lah yang akan menjadi Vetex asal
                vertexAsal = vertexTujuan;
            } else{
                break;
            }


        }
        System.out.println("\nTotalJarak: "+totalBobot);


//        int[][] adjacencyMatrixBobot = {
//                {0, 7, 15, 12, 0, 0, 0},
//                {7, 0, 0, 0, 9, 0, 0},
//                {15, 0, 0, 17, 0, 4, 6},
//                {12, 0, 17, 0, 5, 27, 0},
//                {0, 9, 0, 5, 0, 0, 3},
//                {0, 0, 4, 27, 0, 0, 8},
//                {0, 0, 6, 0, 3, 8, 0},
//        };
//
//        int[][] adjacencyList = {
//                {1, 2, 3},
//                {0, 4},
//                {0, 3, 5, 6},
//                {0, 2, 4, 5},
//                {1, 3, 6},
//                {2, 3, 6},
//                {2, 4, 5},
//        };
//
//        System.out.println(Arrays.stream(adjacencyMatrix).toArray());

    }

}
