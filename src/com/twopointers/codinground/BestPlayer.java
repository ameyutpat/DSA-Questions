package com.twopointers.codinground;

import java.util.*;

public class BestPlayer {
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
        findBestPlayer(n,m,performances);
    }

    private static void findBestPlayer(int n, int m, int[][] performances) {
        Map<Integer, List<Integer>> playerAndPerformances = new HashMap<>();
        // Add
        int player = 1;
        List<Integer> performanceOfEachPlayer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                performanceOfEachPlayer.add(performances[i][j]);
            }
            playerAndPerformances.put(player,performanceOfEachPlayer);
            player++;
        }

        /*Set<Map.Entry<Integer, List<Integer>>> entries = playerAndPerformances.entrySet();
        for(Map.Entry<Integer, List<Integer>> entry : entries){
            List<Integer> value = entry.getValue();
            for(int i=0; i < value.size();i++){
                if(value.get(i)){

                }
            }
        }*/
    }

}
