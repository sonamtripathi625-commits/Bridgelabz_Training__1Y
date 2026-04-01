package MultiThreading;


    class BankAccount implements Runnable {
        private String holderName;
        private String accountType;

        public BankAccount(String holderName, String accountType) {
            this.holderName = holderName;
            this.accountType = accountType;
        }

        @Override
        public void run() {
            Thread currentThread = Thread.currentThread();

            for (int i = 1; i <= 3; i++) {
                System.out.println(i);

                try {

                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(holderName );
                }
            }
            System.out.println( holderName);
        }
    }

    public class BankingApp {
        public static void main(String[] args) {

            BankAccount premiumTask = new BankAccount("Alice", "Premium");
            BankAccount regularTask = new BankAccount("Bob", "Regular");
            BankAccount basicTask = new BankAccount("Charlie", "Basic");


            Thread t1 = new Thread(premiumTask);
            Thread t2 = new Thread(regularTask);
            Thread t3 = new Thread(basicTask);

            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.NORM_PRIORITY);
            t3.setPriority(Thread.MIN_PRIORITY);

            t1.start();
            t2.start();
            t3.start();
        }
    }

