interface Furniture{
    abstract void color();
    abstract void shape();

}
class Chair implements Furniture{

    @Override
    public void color() {

        System.out.println("Color is Black");

    }

    @Override
    public void shape() {

        System.out.println("Chair Shape");

    }
}
class Chair1 extends Chair {

    public void chair1() {

        System.out.println("Chair1");

    }

}
class Chair2 extends Chair {

    public void chair2() {

        System.out.println("Chair2");

    }

}
class Chair3 extends Chair {

    public void chair3() {

        System.out.println("Chair3");

    }

}
class Tables implements Furniture {


    @Override
    public void color() {

        System.out.println("Tabla color is Red");

    }

    @Override
    public void shape() {
        System.out.println("Table Shape");
    }

}
class T1 extends Tables {

    public void t1() {

        System.out.println("Table1");

    }

}
class T2 extends Tables {

    public void t2() {

        System.out.println("Table2");

    }

}
class T3 extends Tables {

    public void t3() {

        System.out.println("Table3");

    }

}

public class Main {

    public static void main(String[] args) {

        Chair Chair_Obj = new Chair();
        Chair1 Chair1_Obj = new Chair1();
        Chair2 Chair2_Obj = new Chair2();
        Chair3 Chair3_Obj = new Chair3();
        Chair_Obj.color();
        Chair_Obj.shape();
        Chair1_Obj.chair1();
        Chair2_Obj.chair2();
        Chair3_Obj.chair3();
        Tables Table_Obj = new Tables();
        T1 T1_Obj = new T1();
        T2 T2_Obj = new T2();
        T3 T3_Obj = new T3();
        Table_Obj.color();
        Table_Obj.shape();
        T1_Obj.t1();
        T2_Obj.t2();
        T3_Obj.t3();
    }
}