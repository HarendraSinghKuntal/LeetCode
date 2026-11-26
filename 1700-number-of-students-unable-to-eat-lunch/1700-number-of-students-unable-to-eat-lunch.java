import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < students.length; i++) {
            q.offer(students[i]);
        }

        int count = 0;
        int index = 0;

        while(!q.isEmpty() && count < q.size()) {

            if(q.peek() == sandwiches[index]) {
                q.remove();
                index++;
                count = 0;
            }
            else {
                q.add(q.remove());
                count++;
            }
        }

        return q.size();
    }
}