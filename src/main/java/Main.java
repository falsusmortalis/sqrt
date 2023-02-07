import ru.netology.javaqa.javaqamvn.services.SqrtService;

public class Main {
    public static void main(String[] args) {
        SqrtService service = new SqrtService();
        int result = service.calcSqrt(200, 300);
        System.out.println(result);
    }
}
