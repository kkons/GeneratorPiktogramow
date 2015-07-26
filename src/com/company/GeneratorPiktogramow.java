package com.company;

/**
 * Created by karo on 7/26/15.
 */
public class GeneratorPiktogramow {


/*
    public static void printPatternX(int size)  // 'X' from 'A' to ..., size is a positive integer.

            #                    # # # # # # # #      # # # # # # # #                    #
            # #                  # # # # # # #          # # # # # # #                  # #
            # # #                # # # # # #              # # # # # #                # # #
            # # # #              # # # # #                  # # # # #              # # # #
            # # # # #            # # # #                      # # # #            # # # # #
            # # # # # #          # # #                          # # #          # # # # # #
            # # # # # # #        # #                              # #        # # # # # # #
            # # # # # # # #      #                                  #      # # # # # # # #
            (a)                   (b)                  (c)                  (d)

*/

        public void printPatternA(int size) {

            int s=0;

            for (int i = 0; i < size ; i++) {
                s++;
                   for (int j = 0; j < s; j++) {
                            System.out.print("X");
                        }
                System.out.println();
            }

        }


    public void printPatternB(int size){

        int s=size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < s ; j++) {
                System.out.print("X");
            }
            s--;
            System.out.println();

        }

    }

    public void printPatternC(int size) {
        int s = size;
        int p = 0;

        for (int i = 0; i < size; i++) {

            for (int k = 0; k < p; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < s; j++) {
                System.out.print("X");
            }

            System.out.println();
            s--;
            p++;
        }
    }

    public void printPatternD(int size){
        int s = size -1;
        int p = 1;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < p; k++) {
                System.out.print("X");
            }

            System.out.println();
            s--;
            p++;

        }


    }



    }



