package MultiThreading;


    class Order implements Runnable {
        private String orderId;
        private String restaurantName;
        private int deliveryTimeInSeconds;
        private String deliveryType;

        public Order(String orderId, String restaurantName, int deliveryTimeInSeconds, String deliveryType) {
            this.orderId = orderId;
            this.restaurantName = restaurantName;
            this.deliveryTimeInSeconds = deliveryTimeInSeconds;
            this.deliveryType = deliveryType;
        }

        @Override
        public void run() {
            String agentName = Thread.currentThread().getName();
            long startTime = System.currentTimeMillis();

            System.out.println( agentName);

            try {
                System.out.println( orderId );
                Thread.sleep(deliveryTimeInSeconds * 1000L);


                long endTime = System.currentTimeMillis();
                long totalTime = (endTime - startTime) / 1000;

                System.out.println(totalTime );
            } catch (InterruptedException e) {
                System.out.println( orderId );
            }
        }
    }

    public class DeliverySystem {
        public static void main(String[] args) {

            Order o1 = new Order("A101", "Pizza Hut", 2, "Express");
            Order o2 = new Order("B202", "Burger King", 4, "Standard");
            Order o3 = new Order("C303", "Sushi Zen", 5, "Economy");
            Order o4 = new Order("D404", "Taco Bell", 2, "Express");
            Order o5 = new Order("E505", "Subway", 3, "Standard");


            Thread agent1 = new Thread(o1, "Agent-001");
            Thread agent2 = new Thread(o2, "Agent-002");
            Thread agent3 = new Thread(o3, "Agent-003");
            Thread agent4 = new Thread(o4, "Agent-004");
            Thread agent5 = new Thread(o5, "Agent-005");


            agent1.setPriority(Thread.MAX_PRIORITY);
            agent4.setPriority(Thread.MAX_PRIORITY);
            agent2.setPriority(Thread.NORM_PRIORITY);
            agent5.setPriority(Thread.NORM_PRIORITY);
            agent3.setPriority(3);


            agent1.start();
            agent2.start();
            agent3.start();
            agent4.start();
            agent5.start();
        }
    }

