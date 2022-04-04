/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearch;

/**
 *
 * @author NS
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public void binarySearch(int[] arrayToSearch, int n) {

        int min = 0;
        int max = arrayToSearch.length;

        while (min <= max) {

            int averagePos = min + (max - min) / 2;

            int elementInArray = arrayToSearch[averagePos];

            if (elementInArray == n) {
                System.out.println("Found element " + averagePos);
                break;

            } else if (elementInArray < n) {
                min = averagePos + 1;

            } else if (elementInArray > n) {

                max = averagePos - 1;
            }

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearch bn = new BinarySearch();

        int[] arrayToSearch = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int elemenToSearch = 83;

        bn.binarySearch(arrayToSearch, elemenToSearch);
    }

}
