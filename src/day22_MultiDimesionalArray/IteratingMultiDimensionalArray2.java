package day22_MultiDimesionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        int [][] int2d={{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for (int i =int2d.length-1; i >=0; i--) {
            for (int j = 0; j < int2d[i].length; j++) {
                System.out.print(int2d [i] [j]+" ");
// int2d[i] represent each single dimensional Array
            }
            System.out.println();

        }
        System.out.println("----------------------------------");

        for (int i = int2d.length-1; i >=0; i--) {
            for (int j =int2d[i].length-1; j >=0 ; j--) { // j : each element of  starting from last index
                System.out.print(int2d [i] [j]+" ");

            }
            System.out.println();

        }
    }
}

/*
task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9

 task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1

 */
