class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<List<String>>();
        
        ArrayList<String> strList=new ArrayList<String>();
        
        isEqualPartition(list,strList,0,s);
        
        return list;
    }
    
    void isEqualPartition(List<List<String>> list,ArrayList<String> strList,int startIndex, String str){
    
        
        if(startIndex>=str.length()){
            list.add(new ArrayList<String>(strList));
            return;
        }
        
        
        for(int i=startIndex+1;i<=str.length();i++){
            if(isPalindrome(str.substring(startIndex,i))){
             strList.add(str.substring(startIndex,i)) ;
                
                isEqualPartition(list,strList,i,str);
                strList.remove(strList.size()-1);
                
            }
        }
    }
      boolean isPalindrome(String s){
          for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
              if(s.charAt(i)==s.charAt(j)){
                  
              }
              else{
                  return false;
              }
          }
          return true;
      }
    
}