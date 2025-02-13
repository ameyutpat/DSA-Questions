package com.twopointers.codinground;

import java.util.Scanner;

public class PlayerOfTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of players
        int n = scanner.nextInt();
        // Read the number of data points per player
        int m = scanner.nextInt();

        // Initialize the performance array
        int[][] performances = new int[n][m];

        // Read the performance data
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                performances[i][j] = scanner.nextInt();
            }
        }

        // Array to keep track of the number of times each player is the leader
        int[] leaderCounts = new int[n];

        // Determine the leader at each data point
        for(int j=0; j < m ; j++){
            int maxPerformance = Integer.MIN_VALUE;
            int leader = -1;

        }
        for (int j = 0; j < m; j++) {
            int maxPerformance = Integer.MIN_VALUE;
            int leader = -1;

            // Find the player with the maximum value at data point j
            for (int i = 0; i < n; i++) {
                if (performances[i][j] > maxPerformance) {
                    maxPerformance = performances[i][j];
                    leader = i;
                }
            }

            // Increment the leader count for the player with max value
            leaderCounts[leader]++;
        }

        // Find the player with the maximum number of leadership counts
        int maxLeaderIndex = 0;
        int maxLeaderCount = leaderCounts[0];

        for (int i = 1; i < n; i++) {
            if (leaderCounts[i] > maxLeaderCount) {
                maxLeaderIndex = i;
                maxLeaderCount = leaderCounts[i];
            }
        }

        // Print the index of the player of the year
        System.out.println(maxLeaderIndex);
    }
}
