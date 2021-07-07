package com.company.algoritm_problem_solving.struktur_data;

import java.util.LinkedList;
import java.util.Scanner;

//Linked List merupakan jenis struktur data linear yang dinamis. Berikut
//karakteristiknya:

//Terdiri atas node yang secara bersama-sama membentuk susunan linear.
//Tiap node terhubung dengan node sebelumnya menggunakan referensi dari node sebelumnya.
//Referensi ke node sebelumnya disebut dengan link.
//Node terdiri atas elemen data dan referensi.

//IMPLEMENTASI

//2. Buatlah Class Baru pada proyek dengan nama Node
class Node {
    private String data;
    private Node nextReference;

    public Node(String data) {
        this.data = data;
        this.nextReference = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNextReference() {
        return nextReference;
    }

    public void setNextReference(Node nextReference) {
        this.nextReference = nextReference;
    }
}

//3. Buatlah Class Baru pada proyek dengan nama SLinkedList, pada kelas ini
//terdapat method yang a

class SLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //cek apakah node empty/notEmpty
    public boolean isEmpty() {
        if ((this.head == null) && (this.tail == null)) {
            return true;
        } else {
            return false;
        }
    }

    //add first data
    public void addFirst(Node node) {
        if (!isEmpty()) {
            node.setNextReference(head);
            head = node;
        } else {
            node.setNextReference(null);
            tail = node;
            head = node;
        }
        ++this.size;
    }


    public int getSize() {
        return getSize();
    }

    public void addLast(Node node) {
        if (!isEmpty()) {
            node.setNextReference(null);
            this.tail.setNextReference(node);
            tail = node;
        } else {
            node.setNextReference(null);
            tail = node;
            head = node;
        }
        ++this.size;
    }

    //tampilkan data
    public void display() {
        Node pointer;

        pointer = head;

        System.out.println("Size : " + this.size);
        while (pointer != null) {
            System.out.println(pointer.getData());
            pointer = pointer.getNextReference();
        }
    }


    //   PERCOBAAN 3 – MENCARI DATA
//1. Untuk mencari data digunakan pointer yang akan bergerak dimulai dari head
//lalu ke node-node berikutnya sampai data ditemukan. Tambahkan method
//berikut Pada Class Slinked List :
    public Node search(String data) {
        Node pointer;

        if (isEmpty()) return null;
        pointer = head;

        while (pointer != null) {
            if (pointer.getData().contentEquals(data)) return pointer;
            pointer = pointer.getNextReference();
        }
        return null;
    }

//    PERCOBAAN 4 – MENGHAPUS DATA (HEAD)
//1. Untuk menghapus data pada head, dilakukan dengan membuat memindahkan
//posisi head ke node berikutnya. Node Head yang lama kemudian dihapus atau
//dijadikan null. Tambahkan method berikut Pada Class Slinked List :

    public void deleteHead() {
        Node pointer;

        pointer = head;
        head = pointer.getNextReference();
        pointer = null;
    }

}


public class CobaLinkedList {


    public static void main(String[] args) {

        SLinkedList myLinkedList = new SLinkedList();

        Node data1 = new Node("data1");
        Node data2 = new Node("data2");
        Node data3 = new Node("data3");
        Node hasilcari;

        myLinkedList.addLast(data1);
        myLinkedList.addLast(data2);
        myLinkedList.addFirst(data3);


        //implementasikan method search
//        hasilcari = myLinkedList.search("data1");
//
//        if (hasilcari == null) {
//            System.out.println("data tidak ditemukan");
//
//        } else {
//            System.out.println("data ditemukan!");
//
//        }

        System.out.println("data sebelum dihapus");
        myLinkedList.display();

        myLinkedList.deleteHead();

        System.out.println("data sesudah dihapus");
        myLinkedList.display();


    }

}