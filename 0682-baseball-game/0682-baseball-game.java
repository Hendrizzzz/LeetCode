class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String operation : operations){
            if (operation.equals("C")){
                stack.pollLast();
            } 
            
            else if (operation.equals("D")){
                int a = stack.pollLast();
                stack.add(a);
                stack.add(2 * a);
            }
            
            else if (operation.equals("+")){
                int a = stack.pollLast();
                int b = stack.pollLast();
                stack.add(b);
                stack.add(a);
                stack.add(a + b);
            }
            else {
                stack.add(Integer.parseInt(operation));
            }
        }
        
        int sum = 0;
        for(Integer numbers : stack){
            sum += numbers;
        }
        return sum;
    }
}