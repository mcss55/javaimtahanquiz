package staticNONstatic;

import jdk.jfr.MemoryAddress;

class Main2{
    static int reqem=0;
    Main2(){
        reqem++;
    }
}

class Main {
    public static void main(String[] args) {
        Main2 m=new Main2();
        System.out.println(m.reqem);
        Main2 m2=new Main2();
        System.out.println(m2.reqem);
        Main2 m3=new Main2();
        System.out.println(m3.reqem);
    }
}


