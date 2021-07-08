package com.company.algoritm_problem_solving.struktur_data;


//STRUKTUR DATA GRAPH
//menggunakan Adjaceny Matrix & Adjaceny List
//
//Graph digunakan untuk mempresentasikan objek-objek diskrit
//dan hubungan antara objek-objek tersebut
//Graph G=(v,E)
//V= himpunan tidak kosong dari simpul-simpul(vertices) = {v1,v2,....vn}
//E = himpunan sisi (edges) yang menghubungkan sepasang simpul = {e1,e2,....}

public class Graph {
    //buat vertex
    char[] table = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};


    int[][] adjacencyMatrix = {
            {0, 1, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 1, 1},
            {0, 0, 1, 0, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 1},
            {0, 0, 1, 1, 0, 0, 1},
            {0, 0, 1, 0, 1, 1, 0},
    };

    int[][] adjacencyMatrixBobot = {
            {0, 7, 15, 12, 0, 0, 0},
            {7, 0, 0, 0, 9, 0, 0},
            {15, 0, 0, 17, 0, 4, 6},
            {12, 0, 17, 0, 5, 27, 0},
            {0, 9, 0, 5, 0, 0, 3},
            {0, 0, 4, 27, 0, 0, 8},
            {0, 0, 6, 0, 3, 8, 0},
    };

    int[][] adjacencyList = {
            {1, 2, 3},
            {0, 4},
            {0, 3, 5, 6},
            {0, 2, 4, 5},
            {1, 3, 6},
            {2, 3, 6},
            {2, 4, 5},
    };

}
