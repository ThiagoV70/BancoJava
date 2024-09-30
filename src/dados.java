public class dados {

    private String name;
    private int id;
    private double deposit;

    public dados() {
    }
    public dados(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public dados(int id, String name, double inicialDeposit) {
        this.id = id;
        this.name = name;
        addeposit(inicialDeposit);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDeposit() {
        return deposit;
    }
    public String toString() {
        return "Account data: \n" +
        "Account " + id + ", Holder: " + name + ", Balance: $" + String.format("%.2f", deposit) + "\n";
        }
        public double addeposit(double deposit) {
            this.deposit += deposit;
            return deposit;
        }
        public double removdeposit(double deposit) {
            this.deposit -= deposit + 5;
            return deposit;
    }


}
