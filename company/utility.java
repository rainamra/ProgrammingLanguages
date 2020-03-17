//Rainamira Azzahra - 2301900391
package com.company;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


//Methods
public class utility
{
    public void numOne(Scanner s)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        System.out.printf("Size of the Array: ");

        int inputSize = s.nextInt();

        //for loop --> add value sesuai size of the array
        for (int n=0; n < inputSize; n++)
        {
            System.out.printf("Input number to the Array: ");
            int inputNums = s.nextInt();
            nums.add(inputNums);
        }

        System.out.printf("Your Array: ");

        for (int i : nums)
        {
            System.out.printf(i + " ");
        }

        int nextMax = 0;
        int max = 0;

        //finding the largest value
        for(int i = 0; i < (nums.size()); i++)
        {
            if(nums.get(i) > max)
            {
                //if there is larger value it will replace current value
                max = nums.get(i);
                //the largest value stays
            }

        }

        // Finding next largest value
        for (int j = 0; j < nums.size(); j++)
        {
            if (nums.get(j) > nextMax)
            {
                //make sure its not the same number as the largest value
                if (nums.get(j) != max)
                {
                    nextMax = nums.get(j);
                }
            }
        }

        // Printing array after split
        System.out.print("\nArray after split: ");
        for (int k = 0; k < nums.size(); k++)
        {
            if(nums.get(k) == max)
            {
                //splitting highest value to the next highest value + required additive
                System.out.print(nextMax + " " + (max-nextMax) + " ");
            }
            else
            {
                System.out.print(nums.get(k) + " ");
            }
        }

    }


    public void  numTwo(int ROT)
    {
        //initialize
        int array[] = {1,2,3,4,5};
        int tempNum;

        //print the array
        System.out.printf("Array: " + Arrays.toString(array));

        //for loop rotation
        for (int i = 1; i <= ROT; i++)
        {
            for(int j = 1; j < array.length; j++)
            {
                tempNum = array[j];
                array[j] = array[0];
                array[0] = tempNum;
            }
        }

        //print the array after rotation
        System.out.printf("\nArray after shift: " + Arrays.toString(array) + "\n\n");

    }


    public boolean isSymmetric(int mat[][], int n)
    {
        //rows
        for(int i = 0; i < n; i++)
        {
            //column
            for(int j = 0; j < n; j++)
            {
                //checks if its symmetrical
                if(mat[i][j] != mat[j][i])
                {
                    return false;
                }
            }
        }
        return true;
    }


    public void oddMagicSquare(int n)
    {
        int[][] magicSquare = new int[n][n];

        // Initializing position for 1
        int i = n/2;
        int j = n-1;

        // Inserting all values of magic square

        for (int num=1; num <= n*n; )
        {
            // Third condition = if
            if (i==-1 && j==n)
            {
                j = n-2;
                i = 0;
            }
            else
            {
                //1st condition helper if next number
                // goes to out of square's right side
                if (j == n)
                    j = 0;

                //1st condition helper if next number is
                // goes to out of square's upper side
                if (i < 0)
                    i=n-1;
            }

            //2nd condition
            if (magicSquare[i][j] != 0)
            {
                j -= 2;
                i++;
                continue;
            }
            else
                //set number
                magicSquare[i][j] = num++;

            //1st condition
            j++;  i--;
        }

        // print magic square
        System.out.println("The Magic Square for "+n+":");
        System.out.println("Sum of each row or column "+n*(n*n+1)/2+":");
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
                System.out.print(magicSquare[i][j]+" ");
            System.out.println();
        }
    }

    public void evenMagicSquare(int n)
    {
        int[][] arr = new int[n][n];
        int i , j;

        //filing matrix with count value from 1
        for (i  = 0; i < n; i++)
        {
            for (j =0 ; j<n;j++)
            {
                arr[i][j] = (n*i) + j + 1;
            }
        }

        //change value of array elements
        // (order (n/4)*(n/4))
        for ( i = 0; i < n/4; i++)
            for ( j = 0; j < n/4; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];

        // Top Right corner of Matrix
        for ( i = 0; i < n/4; i++)
            for ( j = 3 * (n/4); j < n; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];


        // Bottom Left corner of Matrix
        for ( i = 3 * n/4; i < n; i++)
            for ( j = 0; j < n/4; j++)
                arr[i][j] = (n*n+1) - arr[i][j];

        // Bottom Right corner of Matrix
        for ( i = 3 * n/4; i < n; i++)
            for ( j = 3 * n/4; j < n; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];


        // Centre of Matrix (order (n/2)*(n/2))
        for ( i = n/4; i < 3 * n/4; i++)
            for ( j = n/4; j < 3 * n/4; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];

        System.out.println("The Magic Square for "+n+":");
        System.out.println("Sum of each row or column "+n*(n*n+1)/2+":");
        // Printing the magic-square
        for (i = 0; i < n; i++)
        {
            for ( j = 0; j < n; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }

}
