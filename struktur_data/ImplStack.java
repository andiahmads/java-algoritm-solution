package com.company.algoritm_problem_solving.struktur_data;

public class ImplStack {
    public static void main(String[] args) {
        Stack stack = new Stack(8);

        //cek apakah stack dalam keaadaan full
        boolean dResult = stack.isFUll();
        System.out.println("result isFull :" + dResult);


        dResult = stack.isEmpty();
        System.out.println("result isEmpty status :" + dResult);

        dResult = stack.push("php");
        System.out.println("result  :" + dResult);

        dResult = stack.push("javascript");
        System.out.println("result  :" + dResult);

        dResult = stack.push("python");
        System.out.println("result  :" + dResult);

        dResult = stack.push("java");
        System.out.println("result  :" + dResult);

        dResult = stack.push("golang");
        System.out.println("result  :" + dResult);

        dResult = stack.push("rust");
        System.out.println("result  :" + dResult);

        dResult = stack.push("c++");
        System.out.println("result  :" + dResult);
        stack.cetak();


        //impl method pop
        System.out.println("\n");
        String sResult = stack.pop();
        System.out.println("stack yang dieleminasi adalah  :" + sResult);
        stack.cetak();

        System.out.println("\n");
        sResult = stack.pop();
        System.out.println("stack yang dieleminasi adalah  :" + sResult);
        stack.cetak();


        System.out.println("\n");
        sResult = stack.peek();
        System.out.println("stack yang index teratas adalah  :" + sResult);
        stack.cetak();


        System.out.println("\n");
        dResult = stack.push("erlang");
        System.out.println("result  :" + dResult);
        stack.cetak();

        System.out.println("\n");
        dResult = stack.push("perl");
        System.out.println("result  :" + dResult);
        stack.cetak();

        System.out.println("\n");
        dResult = stack.push("ruby");
        System.out.println("result  :" + dResult);
        stack.cetak();

        System.out.println("\n");
        dResult = stack.push("c#");
        System.out.println("result  :" + dResult);
        stack.cetak();
        


        System.out.println("\n");
        sResult = stack.peek();
        System.out.println("stack yang index teratas adalah  :" + sResult);
        stack.cetak();






    }
}
