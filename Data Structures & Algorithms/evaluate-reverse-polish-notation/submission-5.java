class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String c : tokens){
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
                int n1 = s.pop();
                int n2 = s.pop();
                int res =0;

                switch(c){
                        case "+" -> res = n2 + n1;
                        
                        case "-" -> res = n2 - n1;
                        
                        case "*" -> res = n2 * n1;
                        case "/" -> {
                            try{
                             res = n2 / n1;
                            }
                            catch(ArithmeticException e){
                                res = 0;
                            }
                        }
                        
                        
                }
                s.push(res);
            }
            else{
                   s.push(Integer.parseInt(c));
                }
        }
        return s.pop();
    }
}
