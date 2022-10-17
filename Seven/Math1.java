package Seven;

public class Math1 {
    public int module(int num){
        if (num<0){
            return -num;
        }else
            return num;
    }
    public byte module(byte num){
        if (num<0){
            return (byte) -num;
        }else
            return num;
    }
        public short module(short num){
            if (num<0){
                return (short) -num;
            }
            else
                return num;
        }
    public double module(double num){
        if (num<0){
            return -num;
        }
        else
            return num;
    }
    public int deg(int a, int b){
        int summ=1;
        for (int i = 0; i <=b; i++) {
            summ=summ*a;
        }
        return summ;
    }

    public double deg(double a, double b){
        double summ=1;
        for (int i = 0; i <=b; i++) {
            summ=summ*a;
        }
        return summ;
    }
    public byte deg(byte a, byte b){
        int summ=1;
        for (int i = 0; i <=b; i++) {
            summ=summ*a;
        }
        return (byte) summ;
    }
    public short deg(short a, short b){
        int summ=1;
        for (int i = 0; i <=b; i++) {
            summ=summ*a;
        }
        return (short) summ;
    }
}

