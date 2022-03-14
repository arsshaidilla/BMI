package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {
    public static void main(String[] args) throws IOException{

        float heightArslan , weightArslan, bmiArslan;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The Program will calculate your BMI");
        System.out.println("Enter your height in cm (and press Enter): ");
        heightArslan = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight in kg (and press Enter): ");
        weightArslan = Float.parseFloat(br.readLine());

        bmiArslan = (float) (weightArslan / (Math.pow(heightArslan, 2)));
        System.out.printf("Your BMI is: " + "%2.2f,  \n", bmiArslan);


        if (bmiArslan < 16){
            System.out.println("You are slim/skinny/suffering from starvation");
        } else if ((bmiArslan >= 16)&&(bmiArslan < 16.99)){
            System.out.println("You're emaciated");
        }else if ((bmiArslan >= 17)&&(bmiArslan < 18.49)){
            System.out.println("You're underweight");
        }else if ((bmiArslan >= 18.50)&&(bmiArslan  < 22.99)){
            System.out.println("You're in a low range or the norm");
        }else if ((bmiArslan >= 23)&&(bmiArslan < 24.99)){
            System.out.println("You're in the high range of the norm");
        }else if ((bmiArslan >= 25)&&(bmiArslan < 27.49)){
            System.out.println("You're overweight ot pre-obese");
        }else if ((bmiArslan >= 27.50)&&(bmiArslan < 29.99)){
            System.out.println("You're overweight");
        }else if ((bmiArslan >= 30)&&(bmiArslan < 34.99)){
            System.out.println("You've 1st degree obesity");
        }else if ((bmiArslan >= 35)&&(bmiArslan< 39.99)){
            System.out.println("You've 2nd degree obesity");
        }else if ((bmiArslan > 40)){
            System.out.println("You've 3rd degree obesity");
        }








    }
}
