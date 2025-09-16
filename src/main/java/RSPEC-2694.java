public class Fruit {
    // ...

    public class Seed {  // Noncompliant; there's no use of the outer class reference so make it static
        int germinationDays = 0;
        public Seed(int germinationDays) {
            this.germinationDays = germinationDays;
        }
        public int getGerminationDays() {
            return germinationDays;
        }
    }
    
    public void processSeeds() {
        class LocalSeedProcessor { // Noncompliant: local class that doesn't use outer reference
            void process() {
                System.out.println("Processing seeds");
            }
        }
        new LocalSeedProcessor().process();
    }
}
