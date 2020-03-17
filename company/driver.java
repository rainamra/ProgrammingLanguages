package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class driver
{
    public static void main(String[] args)
    {
        utility newUtility = new utility();
        Scanner sc = new Scanner(System.in);

        //number one
        newUtility.numOne(sc);


        //number two
        System.out.printf("\n\nInput ROT: ");
        int rot = sc.nextInt();

        if (rot < 1)
        {
            System.out.println("Please input positive integers above 1: ");
            System.exit(0);
        }

        newUtility.numTwo(rot);


        //number three
        int matrix[][] = { { 1, 3, 5 },
                        { 3, 2, 4 },
                        { 5, 4, 1 } };

        for(int[] row : matrix)
        {
            System.out.println(Arrays.toString(row));
        }

        if(newUtility.isSymmetric(matrix, 3) == true)
        {
            System.out.println("The matrix is symmetrical!");
        }

        else{
            System.out.println("This matrix is asymmetrical!");
        }


        //number four
        System.out.print("\nInput a positive number greater than 1 : ");
        int size = sc.nextInt();
        if (size > 1 && (size % 2 == 1))
        {
            newUtility.oddMagicSquare(size);
        }

        else if (size > 1 && (size % 2 == 0))
        {
            newUtility.evenMagicSquare(size);
        }

        else
        {
            System.out.println("Error! Invalid Size");
            System.exit(0);
        }


        sc.close();

    }
}
