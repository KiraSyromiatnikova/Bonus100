public class Main {
    public static void main(String[] args) {
        int bonus;
        int balance = 100;
        int refill = 800;
        int limit = 1000;
        if (refill >= limit) {bonus = refill/100;} else {bonus =0;}
        int total = balance + refill + bonus;
        System.out.println(total);
    }
}