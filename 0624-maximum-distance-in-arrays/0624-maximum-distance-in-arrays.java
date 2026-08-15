class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() -1);
        int answer = 0;
        for(int i = 1; i<arrays.size();i++){
            int first = arrays.get(i).get(0);
            int last = arrays.get(i).get(arrays.get(i).size() - 1);
            int distance1 = last - min;
            int distance2 = max - first;
            answer = Math.max(answer, distance1);
            answer = Math.max(answer, distance2);
            if(first < min){
                min = first;
            }
            if(last > max){
                max = last;
            }
        }
        return answer;
    }
}