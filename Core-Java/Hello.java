/**
 * Hello
 */

/*
class Calculator {

    int num = 5;

    // Method Overloading

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public double add(double n1, int n2) 
    {
        return n1 + n2;
    }

    
    
    int a;
    
    public int add() {
        System.out.println("in add");
        return 0;
    }
    


}

*/

/*
 * 
class Computer
{
    public void playMusic()
    {
        System.out.println("Music Plaing..");
    }

    public String getMePen(int cost)
    {
        if (cost >= 10)
            return "Pen";
       
        return "Nothing";
    }
}
 * 
 */

// class Student 
// {
//     int rollno;
//     String name;
//     int marks;
// }

// class Mobile 
// {
//     // instant variables
//     String brand;
//     int price;
    
//     //static variable;
//     static String name;

//     // static block
//     static
//     {
//         name = "Phone";
//         System.out.println("in static block");
//     }

//     //Constructor
//     public Mobile()
//     {
//         brand = "";
//         price = 200;
//         System.out.println("in constructor");
//     }


//     public void show()
//     {
//         System.out.println(brand + " : " + price + " : " + name);
//     }

//     // static method
//     public static void show1(Mobile obj)
//     {
//         System.out.println("in staic method : ");
//         System.out.println(obj.brand + " : " + obj.price + " : " + obj.name);
//     }
// }



public class Hello {

    public static void main(String args[]) throws ClassNotFoundException {

        // Class.forName("Mobile");

        // // STATIC MEMBERS

        // // STATIC VARIABLES

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.name = "SmartPhone"; // NOTE: static variables are being called based on its class name 
        

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1700;

        // obj1.show();
        // obj2.show();

        // Mobile.show1(obj1);

        // // For mutable string
        // StringBuffer sb = new StringBuffer("Vijaya");
        // System.out.println(sb.capacity());

        // System.out.println(sb.length());

        // sb.append("Laxmi");

        // sb.deleteCharAt(2);

        // System.out.println(sb);

        //Immutable String Object
        // String name = "navin";
        // name = name + " reddy";
        // System.out.println("Hello " + name);

        // String s1 = "Navin";
        // String s2 = "Navin";

        // System.out.println(s1 == s2);

        // Student s1 = new Student();
        // s1.rollno = 1;
        // s1.name = "Vijaya";
        // s1.marks = 88;

        // Student s2 = new Student();
        // s2.rollno = 2;
        // s2.name = "Divya";
        // s2.marks = 98;

        // Student s3 = new Student();
        // s3.rollno = 3;
        // s3.name = "Nimisha";
        // s3.marks = 90;

        // Student students[] = new Student[3];

        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // for(int i = 0; i < students.length; i++) 
        // {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

        // for(Student stud: students)
        // {
        //     System.out.println(stud.name + " " + stud.marks);
        // }

        /* 
        int nums[] = { 3, 4, 2, 7 };
        
        nums[1] = 6;
        
        System.out.println(nums[0]);
        
        int xyz[] = new int[4];
        xyz[0] = 1;
        xyz[1] = 2;
        xyz[2] = 3;
        xyz[3] = 4;
        
        for (int i = 0; i <= 3; i++) {
            System.out.println(xyz[i]);
        }
        
        System.out.println();
        
        int arrOfArr[][] = new int[3][4];
        
        arrOfArr[0][0] = 5;
        arrOfArr[0][1] = 2;
        arrOfArr[0][2] = 6;
        arrOfArr[0][3] = 1;
        arrOfArr[1][0] = 3;
        arrOfArr[1][1] = 2;
        arrOfArr[1][2] = 1;
        arrOfArr[1][3] = 7;
        arrOfArr[2][0] = 4;
        arrOfArr[2][1] = 8;
        arrOfArr[2][2] = 1;
        arrOfArr[2][3] = 2;
        
        int random = 0;
        
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                arrOfArr[i][j] = (int)(Math.random() * 100);
            }            
        }
        
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(arrOfArr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(int[] n: arrOfArr) 
        {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        
        
        int jaggedArr[][] = new int[3][];
        
        jaggedArr[0] = new int[3];
        jaggedArr[1] = new int[4];
        jaggedArr[2] = new int[2];
        
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.println(jaggedArr[i][i] + " ");
            }
            System.out.println();
        }
        
        for(int n[]: jaggedArr)
        {
            for(int m: n) 
            {
                System.out.println(m + " ");
            }
            System.out.println();
        }
            
        */

        /* 
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        
        int r1 = obj.add(3, 4);
        
        obj.num = 8;
        
        System.out.println(obj.num);
        System.out.println(obj1.num);
        
        */

        /* 
        Calculator calc = new Calculator();
        int result = calc.add(3, 5);
        
        System.out.println(result);
        */

        /*
         * 
         Computer comp = new Computer();
        
        comp.playMusic();
        
        String pen = comp.getMePen(2);
        
        System.out.println(pen);
         * 
         */

        /* 
        int num1 = 4;
        int num2 = 5;
        
        Calculator calc = new Calculator();
        
        int result = calc.add(num1, num2);
        
        System.out.println(result);
        */

        /*
        Calculator calc = new Calculator();
        
        calc.add();
        */

        /*
        
        
        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        
        
        
        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        
        
        
        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        
        // LOOP  -- while, do{} while, for
        
        int i = 1;
        
        infinite LOOP
        while(true) 
        {
            System.out.println("Hi");
        }
        
        while(i<=4)
        {
            System.out.println("Hi" + i);
            i++;
        }
        
        while(i <= 4) 
        {
            System.out.println("Hi " + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello");
                j++;
            }
        }
        
        
        i = 5;
        do 
        {
            System.out.println("Hi " + i);
        
            i++;
        }while(i<=4);
        
        
        for(int j = 0; j < 5; j++) 
        {
            System.out.println("Hi " + j);
        }
            
        for(int i = 1; i < = 5; i++) 
        {
            System.out.println("DAY" + i);
        
            for(int j=1; j<=9; j++)
            {
                System.out.println(" " + (j+8) + "-" + (j+9));
            }
            
        }
        
        
        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        
         // Conditional Statements
        int c = 8;
        
        if(c > 10)
            System.out.println("Hello");
        else
            System.out.println("Bye");
            
        
        int x = 8;
        int y = 7;
        int z = 6;
        
        if (x > y && x > z) {
            System.out.println("x is greatest: " + x);
        }
        else if (y > z) {
            System.out.println("y is greatest: " + y);
        }
        else {
            System.out.println("z is greatest: " + z);
        }
        
        
        // Ternary operator
        if(n%2 == 0) 
            result = 10;
        
        else 
            result = 20;
            
        
        
        int n = 4;
        int result = 0;
        
        result = n % 2 == 0 ? 10 : 20;
        
        System.out.println(result);
        
        // Switch
        int n = 1;
        
        if(n==1)
            System.out.println("Monday");
        else if(n==2)
            System.out.println("Tuesday");
        else if(n==3)
            System.out.println("Wednesday");
        else if(n==4)
            System.out.println("Thursday");
        else if(n==5)
            System.out.println("Friday");
        else if(n==6)
            System.out.println("Saturday");
        else 
            System.out.println("Sunday");
        
        
        switch(n) {
            case 1: 
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("enter valid number");
        }
        
        
        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
         
        // Logical Operators  -  &&, ||, !
        int x = 7;
        int y = 5;
        int s = 5;
        int t = 9;
        
        boolean result = x > y && s > t;      
        
        
        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        
        // Type promotion
        byte a = 10;
        byte b = 30;
        
        int result = a * b;
        
        // Type conversion and type casting 
        
        byte b = 127;
        int a = b; // type conversion
        
        int c = 257;
        b = (byte) c; // type casting
        
        float f = 5.6f;
        int t = (int) f;  // type casting
        
        
        
        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        
        
        DATA TYPES
        
        // literals
        
        int num1 = 0b101;
        int num2 = 0x7E;
        
        Integer
        int num1 = 9;          -- 4 bytes
        byte by = 127;         -- 1 byte = 8 bits = -128 to 127
        short sh = 558;        -- 2 bytes
        long l = 5854l;        -- 8 bytes
        
        Decimals
        float marks = 6.5f;    -- 4 bytes
        double d = 5.8;        -- 8 bytes
        
        Characters
        char c = 'k';    // literals  -- 2 bytes
        
        Boolean
        boolean b = true;            -- 1 byte
        
        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        
        VARIABLES: 
        int num1 = 3;
        int num2 = 4;
        
        int result = num1 + num2;
        
        System.out.println(result);
        
        System.out.println(3 + 5);
        System.out.println(6 + 7);
        System.out.println("Hello World");
        System.out.println(num1);
        */

    }
}
