class Solution {
    public List<String> partitionString(String s) {
        StringBuilder sb=new StringBuilder();
        Set<String> set=new HashSet<>();
        List<String> al=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(sb.length()>0){
                sb.append(ch);
                if(!set.contains(sb.toString())){
                    String segment=sb.toString();
                    al.add(segment);
                    set.add(segment);
                    sb.setLength(0);
                }
            }else if(!set.contains(""+ch)){
                set.add(""+ch);
                al.add(""+ch);
            }else{
                sb.append(ch);
            }
        }
        return al;
    }
}