public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task) {
        batteryLevel -= 10;
        System.out.println(name + " is performing task: " + task);
    }

    public void energyReport() {
        System.out.println("Energy level is: " + batteryLevel);
    }

    public void energyTransfer(Droid name, int transferAmount) {
        if (batteryLevel >= transferAmount) {
            name.batteryLevel += transferAmount;
            batteryLevel -= transferAmount;
            System.out.println("Operation successful! Transfered " + transferAmount + "energy");
        } else {
            System.out.println("Operation failed! insufficient energy");
        }
        }

        public static void main (String[]args){
            Droid codey = new Droid("Codey");
            Droid shaun = new Droid("Shaun");
            System.out.println(codey);
            codey.energyReport();
            codey.performTask("dancing");
            codey.energyReport();
            System.out.println("---------");
            shaun.energyReport();
            shaun.energyTransfer(codey, 50);
            shaun.energyReport();
            System.out.println("---------");
            System.out.println(codey);
            codey.energyReport();
            System.out.println("---------");
            shaun.energyTransfer(codey, 60);
        }

        public String toString () {
            return "Hello, I’m the droid: " + name;
        }
        // if don't use toString result would be not so readable
        // Droid@2aae9190
        // Energy level is: 100
        // Codey is performing task: dancing
        // Energy level is: 90
    }