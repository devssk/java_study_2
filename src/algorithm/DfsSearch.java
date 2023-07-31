package algorithm;

import java.util.Stack;

public class DfsSearch {
    int count;
    boolean[] visited;
    Stack<Integer> stack;
    int[][] matrix;

    public DfsSearch(int count) {
        this.count = count;
        visited = new boolean[count];
        stack = new Stack<>();
    }


}
