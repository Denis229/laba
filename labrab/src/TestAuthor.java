public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a1 = new Author("Gleb", "billboy@yandex.ru", 'M');
        System.out.println(a1);
        a1.setEmail("billboy@yandex.ru");
        System.out.println(a1);
    }
}

