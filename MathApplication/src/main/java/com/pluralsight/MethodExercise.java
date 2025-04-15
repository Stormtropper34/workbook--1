package com.pluralsight;

public class MethodExercise {
    public static void main(String[] args) {
        brushTeeth();
        String favoriteMovie = favoriteMovie();
        System.out.println("Favorite movie: " + favoriteMovie);
        int sum = addTwoNumbers(40, 7);
        System.out.println(sum);



    }
    public static void brushTeeth() {
        System.out.println("How to brush your teeth: ");
        System.out.println("Step 1: Wet toothbrush ");
        System.out.println("Step 2: Brush teeth ");
        System.out.println("Step 3: Rinse mouth");

    }
    public static String favoriteMovie () {
        return "Tokyo Drift";

    }
    public static int addTwoNumbers (int a, int b) {
        return a + b;


    }

}
