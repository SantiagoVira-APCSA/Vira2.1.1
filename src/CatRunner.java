public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Fei", 5, 110);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Alp", 16, 160);
        cat2.introduce();
        cat2.printCatInfo();
    }
}

