import java.util.HashSet;

class Solution {
    public int solution(int[] A) {
        HashSet<Integer> tablica = new HashSet<Integer>();
        for(int i = 0; i < A.length;++i){
            if (!tablica.contains(A[i]) && A[i] > 0) {
                tablica.add(A[i]);
            }

        }
        for (int i = 1; i <= tablica.size();++i){
            if(!tablica.contains(i)){
                return i;
            }

            if(tablica.size() == i){
                return i +1;

            }


        }
        return 1;

    }
}

