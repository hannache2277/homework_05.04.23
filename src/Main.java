public class Main {
    public static void main(String[] args) {
        BonusMileService service = new BonusMileService();
        int bonusMile = service.calculate(10000);
        System.out.println(bonusMile);
    }

}