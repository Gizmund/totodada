public class One {
    public static void main(String[] args)
    {
        Scanner v=new Scanner (System.in);
        int a=v.nextInt();
        int b=v.nextInt();
        if (a>b) System.out.print("Большее "+a);
        else if (b>a) System.out.print("Большее "+b);
        else System.out.print("Числа равны");
    }
}
   /* { System.out.println("введите стороны треугольника");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
        if ((a + b) > c & (a + c) > b & (c + b) > a) {
        if (a == b & a == c) ;
        System.out.println("треугольник равносторонний");
    } else if (a == b | a == c | b == c) {
        System.out.println("треугольник равнобедренный");
    } else {
        System.out.println("треугольеик разносторонний");

    }
}
}*/

   /* {
        System.out.println("Введи очки всех игроков A - B - C");
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if ((a == b) & (b == c)) {
            System.out.println("Нечья");
        } else if ((a > b) & (a > c)) {
            if (b>c)
                System.out.println("Победил игрок А с разницей в очках с аутсайдером" + (a-c));
        } else if ((a > b) & (a > c)) {
            if (c>b)
                System.out.println("Победил игрок А с разницей в очках с аутсайдером" + (a-b));

        } else if ((b > a) & (b > c)) {
            if (a>c)
                System.out.println("Победил игрок Б с разницей в очках с аутсайдером" + (b-c));
        } else if ((b > a) & (b > c)) {
            if (c>a)
                System.out.println("Победил игрок Б с разницей в очках с аутсайдером" + (b-a));

        } else if ((c > b) & (c > a)) {
            if (b>a)
                System.out.println("Победил игрок С с разницей в очках с аутсайдером" + (c-a));
        } else if ((c > b) & (c > a)) {
            if (a>b)
                System.out.println("Победил игрок С с разницей в очках с аутсайдером" + (c-b));
        }}}*/




