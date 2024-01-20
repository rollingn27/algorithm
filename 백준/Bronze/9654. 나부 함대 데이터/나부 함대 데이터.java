class Main {

    public static void main(String[] args) {
        System.out.println(String.format("%-15s", "SHIP NAME") + String.format("%-15s", "CLASS")+ String.format("%-11s", "DEPLOYMENT")+ String.format("%-10s", "IN SERVICE"));
        System.out.println(String.format("%-15s", "N2 Bomber") + String.format("%-15s", "Heavy Fighter")+ String.format("%-11s", "Limited")+ String.format("%-10s", "21"));
        System.out.println(String.format("%-15s", "J-Type 327") + String.format("%-15s", "Light Combat")+ String.format("%-11s", "Unlimited")+ String.format("%-10s", "1"));
        System.out.println(String.format("%-15s", "NX Cruiser") + String.format("%-15s", "Medium Fighter")+ String.format("%-11s", "Limited")+ String.format("%-10s", "18"));
        System.out.println(String.format("%-15s", "N1 Starfighter") + String.format("%-15s", "Medium Fighter")+ String.format("%-11s", "Unlimited")+ String.format("%-10s", "25"));
        System.out.println(String.format("%-15s", "Royal Cruiser") + String.format("%-15s", "Light Combat")+ String.format("%-11s", "Limited")+ String.format("%-10s", "4"));
    }
}