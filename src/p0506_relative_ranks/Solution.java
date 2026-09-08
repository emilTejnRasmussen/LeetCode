package p0506_relative_ranks;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    Queue<Rank> placements = new PriorityQueue<>((a,b) -> Integer.compare(b.score(), a.score()));
    public String[] findRelativeRanks(int[] score) {
        for (int i = 0; i < score.length; i++)
        {
            placements.offer(new Rank(score[i], i));
        }

        int rank = 1;
        String[] answer = new String[score.length];

        while (!placements.isEmpty()) {
            Rank athlete = placements.poll();

            if (rank == 1) answer[athlete.index()] = "Gold Medal";
            else if (rank == 2) answer[athlete.index()] = "Silver Medal";
            else if (rank == 3) answer[athlete.index()] = "Bronze Medal";
            else answer[athlete.index()] = String.valueOf(rank);
            rank++;
        }

        return answer;
    }
}

record Rank(int score, int index){}