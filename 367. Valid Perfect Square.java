class Solution {
    public boolean isPerfectSquare(int num) {
        boolean check=false;
        if (num==1) check= true;
        for(int i=2;i<=i*i;i++){
            if(i*i==num){
                check=true;

            }
        }
        return check;
    }
}
