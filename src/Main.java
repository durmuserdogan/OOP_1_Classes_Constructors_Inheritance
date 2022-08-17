public class Main {
    public static void main(String[] args) {

/*        // Car Class example
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("PORSCHE");
        System.out.println("model is "+ porsche.getModel());*/

/*        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= "+calculator.getAdditionResult());
        System.out.println("substract= "+ calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= "+calculator.getMultiplicationResult());
        System.out.println("divide= "+calculator.getDivisionResult());*/

/*        // Bank Account
        BankAccount dumAccount = new BankAccount();
        dumAccount.setAccountNum("12345");
        dumAccount.setBalance(0.00);
        dumAccount.setCustomerName(" Bob Brown");
        dumAccount.setEmail("email@bob.com");
        dumAccount.setPhoneNumber("+90 5517225315");

        dumAccount.deposit(500.0);
        dumAccount.withdrawal(100.0);*/

/*        //Vip Customer
        VipCustomer person1= new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3=new VipCustomer("tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());*/

/*        // Wall Area
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= "+ wall.getWidth());
        System.out.println("height="+ wall.getHeight());
        System.out.println("area= " + wall.getArea());*/

        // Carpet Cost Calculator
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4,4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());



    }
}
