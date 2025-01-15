public class Mainb {
    public static void main(String[] args) {
        // Cat c1 = new Cat("Chompers", 10, false);
        // Cat c2 = new Cat("Sam", 14, false);
        // CatHouse myHouse = new CatHouse(c1, c2);
        // myHouse.rollCall();
        // System.out.println();
        
        // Cat c3 = new Cat("Spot", 12, false);
        // Cat c4 = new Cat("Brad", 12, false);
        // myHouse = new CatHouse(c3, c4);
        // myHouse.rollCall();
        // System.out.println();
        
        // Cat c5 = new Cat("Davis", 14, false);
        // Cat c6 = new Cat("Frankie", 12, false);
        // myHouse = new CatHouse(c5, c6);
        // myHouse.rollCall();
        // System.out.println();
        
        Cat c1 = new Cat("A", 10, false);
        Cat c2 = new Cat("B", 14, false);
        CatHouse myHouse = new CatHouse(c1, c2);
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.performVaccinations());
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.getTotalVaccinesAdministered());
        System.out.println();
        c1 = new Cat("C", 10, true);
        c2 = new Cat("D", 14, false);
        myHouse = new CatHouse(c1, c2);
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.performVaccinations());
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.getTotalVaccinesAdministered());
        System.out.println();
        c1 = new Cat("E", 10, true);
        c2 = new Cat("F", 14, true);
        myHouse = new CatHouse(c1, c2);
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.performVaccinations());
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.getTotalVaccinesAdministered());
        System.out.println();
        c1 = new Cat("G", 10, false);
        c2 = new Cat("H", 14, false);
        myHouse = new CatHouse(c1, c2);
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.performVaccinations());
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.getTotalVaccinesAdministered());
        
        
    }
}
