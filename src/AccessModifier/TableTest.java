package AccessModifier;

public class TableTest {
    public static void main(String[] args) {
        Table table=new Table("IKEA","White","Wood");
        System.out.println(table.getBrand());
        table.setPrice(80);
        System.out.println(table.getPrice());
        table.setKind("Coffee Table");
        System.out.println(table.getKind());
        table.setIsAvailable(true);
        System.out.println(table.getIsAvailable());

    }
}
