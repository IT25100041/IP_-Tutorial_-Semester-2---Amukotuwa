class Calculator {

    //method to add
    public int add(int num1,int num2){
        return num1 + num2;
    }
    //method to multiply
    public int  multiply(int num1,int num2){
        return num1 * num2;
    }
    //method to square
    public int  square(int num){
        return num * num;
    }

    public static void main(String[] args){

        Calculator cal1 = new Calculator();//create object : cal1

        // Expression 1: (3 * 4 + 5 * 7)^2
        int part1 = cal1.multiply(3,4);
        int part2 = cal1.multiply(5,7);
        int add = cal1.add(part1,part2);
        int answer1 = cal1.square(add);

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int add1 = cal1.add(4,7);
        int add2 = cal1.add(8,3);
        int part3 = cal1.square(add1);
        int part4 = cal1.square(add2);
        int answer2 = cal1.add(part3,part4);

        //display answers
        System.out.println("Result of (3 * 4 + 5 * 7)^2 = " + answer1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 = " + answer2);

    }
}
