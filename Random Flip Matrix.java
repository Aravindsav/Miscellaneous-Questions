class Solution {

int m;
int n;
HashSet<String> set;

    public Solution(int m, int n) {

    this.m = m;
    this.n =n;
    set = new HashSet<>();

      
        
    }
    
    public int[] flip() {
        

        int row =  (int)(Math.random()*m);
        int col = (int)(Math.random()*n);
        String str = row+""+col;
        while(set.contains(str)){
row =  (int)(Math.random()*m);
col = (int)(Math.random()*n);
str = row+""+col;
        }
        set.add(str);
        
        return new int[]{row,col};
        

    }
    
    public void reset() {

      
        set.clear();
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */
