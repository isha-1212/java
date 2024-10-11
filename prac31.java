
// class prac31 extends Thread {
//     public void run() {
//         System.out.println("Hello World");
//     }
//     public static void main(String[] args) {
//         prac31 t = new prac31();
//         t.start();
//     }
// }
class prac31 implements Runnable {

    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new prac31());
        t.start();
    }
}
