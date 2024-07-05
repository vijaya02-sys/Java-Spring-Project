package tools;

// Inheritance

// writing same code again and again is called redundancy

// single inheritance
public class AdvCalc extends Calc {

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        if (n2 != 0)
            return n1 / n2;

        return 0;
    }
}

// public class Hello {

//     public static void main(String args[]) throws ClassNotFoundException {
//         Calc obj = new Calc();
//         int r1 = obj.add(4, 5);
//         int r2 = obj.sub(7, 3);

//         System.out.println(r1 + " " + r2);

//         AdvCalc adcal = new AdvCalc();
//         int r3 = adcal.add(6, 7);
//         int r4 = adcal.sub(8, 9);
//         int r5 = adcal.multi(4, 5);
//         int r6 = adcal.div(6, 2);

//         System.out.println(r3 + " " + r4 + " " + r5 + " " + r6);


//     }
// }
