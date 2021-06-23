import java.util.ArrayList;

import jdk.nashorn.api.tree.ArrayLiteralTree;
public class DiceRolls {

    static ArrayList<String> rollTheDice2(int face,int sum, int currSum, String path){
        
        if(sum==currSum){
            ArrayList<String> list=new ArrayList<String>();
            list.add(path);
            return list;
        }
        else if(sum<currSum){
            return null;
        }
        ArrayList<String> list2=new ArrayList<String>();
        for(int i=1;i<=face;i++){
            ArrayList<String> ls=rollTheDice2(face, sum, currSum+i,path+i);

            if(ls!=null)
            for(String s:ls){
                list2.add(s);
            }
        }
        return list2;
    }
    static int rollTheDice(int face,int sum,int currSum,String path,ArrayList<String> ls){

        if(currSum==sum){
            //System.out.println(path);
            ls.add(path);
            return 1;
        }
        else if(currSum>sum){
            return 0;
        }
        int cnt=0;
        for(int i=1;i<=face;i++){
            cnt+=rollTheDice(face, sum, currSum+i,path+i,ls);
        }

        return cnt;
    }
  public static void main(String[] args) {
      int face=6;
      int targetSum=6;
    //   ArrayList<String> ls=new ArrayList<String>();
    //   int ways=rollTheDice(face,targetSum,0,"",ls);
    //   for(String way:ls){
    //       System.out.println(way);
    //   }
        // System.out.println(ways);


        ArrayList<String> ls=rollTheDice2(face,targetSum,0,"");

        for(String s:ls){
            System.out.println(s);
        }

  }  
}
