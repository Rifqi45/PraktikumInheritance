package praktikumInheritance;

public class NilaiX {

    public static class Parent {

        public int x = 5;
    }

    static class Child extends Parent {

        public int x = 10;

        public void Info(int x) {
            System.out.println("Nilai X Sebagai parameter = " + x);
            System.out.println("Data Member x di Class Child =" + this.x);
            System.out.println("Data Member x di class parent =" + super.x);
        }
    }

    public static void main(String[] args) {
        Child tes = new Child();
        tes.Info(20);
    }
}
