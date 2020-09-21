package com.c0ying.algorithm.poffer_20;

public class Solution2 {

    public boolean isNumber(String s) {
        s=s.trim();
        if(s.length()==0)return false;
        int index=s.length();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='e'||s.charAt(i)=='E')
                index=i;
        }
        if(index==s.length())return isNum(s);
        if(index==s.length()-1)return false;
        if(index==0)return false;
        return isNum(s.substring(0,index))&&isInteger(s.substring(index+1));
    }
    private boolean isNum(String s){
        int i=0;
        boolean flag=false;
        if(s.charAt(0)=='+'||s.charAt(0)=='-')i++;
        int point=0;
        for(;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                flag=true;
                continue;
            }else if(s.charAt(i)=='.'){
                point++;
            }else return false;
            if(point>1)return false;
        }
        return flag;
    }
    private boolean isInteger(String s){
        int i=0;
        boolean flag=false;
        if(s.charAt(0)=='+'||s.charAt(0)=='-')i++;
        for(;i<s.length();i++){
            if(s.charAt(i)<'0'||s.charAt(i)>'9')
                return false;
            else
                flag=true;
        }
        return flag;
    }
}
