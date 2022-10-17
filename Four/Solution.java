package Four;

public class Solution {
    int x(int a,int b,int c){
        int x=(c-b)/a;
        return x;
    }
    int bigInt(int a, int b){
        if (a<b){
            return b;
        }else
            return a;
    }
    int square(int a){
        return a*a;
    }
    int fact(int a){
        if (a==1)return 1;
        return a *fact(a-1);
    }
    int discrim(int a, int b, int c){
        int D=b*b-4*a*c;
        if (D==0){
            double x=-b/(2*a);
        }else if (D>0){
            double x1, x2;
            x1=(-b-Math.sqrt(D))/(2*a);
            x2=(-b+Math.sqrt(D))/(2*a);

        }else {
            System.out.println("Нет корня");
        }
        return D;
    }
}
