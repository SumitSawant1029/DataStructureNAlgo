// We Have Two Inputs an Array of Numbers and a target Variables 
// we have to return the index of two number whose addition is the target value

class TwoSumProblem{
    public static int[] twosum(int[] List,int target) {
        int[] solution={0,1};
        
        for (int j = 0; j < List.length; j++) {
            
            int difference = target - List[j];
          for (int k = j+1; k < List.length; k++) {
               
               if (difference == List[k]) {
                    solution[0] = j;
                    solution[1] = k;
                    return solution;
               }
               else{
                continue;
               }
               
            }
            
        }
        return solution;
        
    }
    public static void main(String[] args) {
        TwoSumProblem i = new TwoSumProblem();
        int[] k = {1,2,3,4};
        k=i.twosum(k, 3);
        System.out.print("[");
        for(int j=0;j<k.length;j++){
            System.out.print(k[j]+",");
        }
        System.out.print("]");
    }
}