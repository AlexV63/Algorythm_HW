package algo_12_01_2023;

import java.lang.reflect.Array;

public class HW_12012023 {
//    Решить задачи через рекурсию, и далее оптимизовать алгоритм одним из методов динамического программирования:
//
//    На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать по ним вниз, к основанию.
//    Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2.
//    (То есть, если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.)
//    Определить число всевозможных «маршрутов» мячика с вершины на землю.

    private static Integer jumpingWays(int n) {
        Integer[] score = new Integer[n + 1];
        score[0] = 0;
        score[1] = 1;
        score[2] = 2;
        score[3] = 4;
        if (n > 3) {
            for (int i = 4; i <= n; i++) {
                score[i] = score[i - 1] + score[i - 2] + score[i - 3];
            }
        }
        return score[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Число всевозможных «маршрутов» мячика с вершины лесенки " + n
                + " на землю " + jumpingWays(n));


//    Самый дешёвый путь
//    В каждой клетке прямоугольной таблицы N*M записано некоторое число.
//    Изначально игрок находится в левой верхней клетке.
//    За один ход ему разрешается перемещаться в соседнюю клетку либо вправо, либо вниз (влево и вверх перемещаться запрещено).
//    При проходе через клетку игрок платит определенную сумму, какое число записано в этой клетке.
//    Требуется найти минимальную стоимость пути, отдав которую игрок может попасть в правый нижний угол.

        int[][] costs = new int[][]{
                {9, 2, 4, 1, 6, 0, 1, 6, 0, 1, 6, 0},
                {9, 2, 4, 1, 6, 0, 1, 6, 0, 1, 6, 0},
                {9, 2, 4, 1, 6, 0, 1, 6, 0, 1, 6, 0},
                {9, 2, 4, 1, 6, 0, 1, 6, 0, 1, 6, 0},
                {9, 2, 4, 1, 6, 0, 1, 6, 0, 1, 6, 0},
                {9, 2, 4, 1, 6, 0, 1, 6, 0, 1, 6, 0},
                {9, 2, 4, 1, 6, 0, 1, 6, 0, 1, 6, 0}
        };

        System.out.println(minimalCost(costs, 0, 0));
        System.out.println(minimalCostMemo(costs));

    }
        private static int minimalCost ( int[][] costs, int i, int j){
            if (i >= costs.length || j >= costs[0].length) return 1000000;
            if (i == costs.length - 1 && j == costs[0].length - 1) return costs[i][j];
            int minCost = costs[i][j] + Math.min(minimalCost(costs, i + 1, j), minimalCost(costs, i, j + 1));
            return minCost;
        }

        private static int minimalCostMemo ( int[][] costs){
            // cache array init
            int[][] minCache = new int[costs.length][costs[0].length];
            for (int i = 0; i < costs.length; i++) {
                for (int j = 0; j < costs[0].length; j++) {
                    minCache[i][j] = -1;
                }
            }
            return minCostMemo(costs, minCache, 0, 0);
        }

        private static int minCostMemo ( int[][] costs, int[][] minCache, int i, int j){
            // some big number to avoid going beyond the boundaries of the array
            if (i >= costs.length || j >= costs[0].length) return 100000;
            // check if the min cost value present in cache
            if (minCache[i][j] != -1) return minCache[i][j];
            // lower right corner case
            if ((i == costs.length - 1) && (j == costs[0].length - 1)) {
                minCache[i][j] = costs[i][j];
            } else // recursion formula fills the minCache array
                minCache[i][j] = costs[i][j] + Math.min(minCostMemo(costs, minCache, i + 1, j), minCostMemo(costs, minCache,
                        i, j + 1));
            return minCache[i][j];
        }

}






