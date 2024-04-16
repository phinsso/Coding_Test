class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] strArr1 = new String[arr1.length];
        String[] strArr2 = new String[arr2.length];
        
        String binaryString = "";
        
        for(int i = 0; i < arr1.length; i++) {
            binaryString = String.format("%" + n + "s",
                            Integer.toBinaryString(arr1[i]))
                            .replace(' ', '0');
            strArr1[i] = binaryString;
            
            binaryString = String.format("%" + n + "s",
                            Integer.toBinaryString(arr2[i]))
                            .replace(' ', '0');
            strArr2[i] = binaryString;
        }
        
        for(int i = 0; i < n; i++) {
            answer[i] = "";
            for(int j = 0; j < n; j++) {
                if(strArr1[i].charAt(j) == '1' || strArr2[i].charAt(j) == '1')
                    answer[i] += "#";
                else
                    answer[i] += "0";
            }
        }
        
        for(int i = 0; i < n; i++) {
            answer[i] = answer[i].replaceAll("0", " ");
        }
        
        return answer;
    }
}