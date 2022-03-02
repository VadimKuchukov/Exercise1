package lesson3;
//Вывести на экран дату своего рождения в виде: MAY 1 2012
public class Main {
    public static void main(String[] args) {
        System.out.println("SEPTEMBER 10 1995");
        //Расставить правильно (по другому) скобки, чтобы на экран вывелось число 850
        //Создать 10 зергов, 5 протосов и 12 терран.
        //Дать им всем уникальные имена.
        Zerg zerg1 = new Zerg();
        zerg1.name = "zerg" + 1;
        Zerg zerg2 = new Zerg();
        zerg2.name = "zerg" + 2;
        Zerg zerg3 = new Zerg();
        zerg3.name = "zerg" + 3;
        Zerg zerg4 = new Zerg();
        zerg4.name = "zerg" + 4;
        Zerg zerg5 = new Zerg();
        zerg5.name = "zerg" + 5;
        Zerg zerg6 = new Zerg();
        zerg6.name = "zerg" + 6;
        Zerg zerg7 = new Zerg();
        zerg7.name = "zerg" + 7;
        Zerg zerg8 = new Zerg();
        zerg8.name = "zerg" + 8;
        Zerg zerg9 = new Zerg();
        zerg9.name = "zerg" + 9;
        Zerg zerg10 = new Zerg();
        zerg10.name = "zerg" + 10;

        Protos protos1 = new Protos();
        protos1.name = "protos" + 1;
        Protos protos2 = new Protos();
        protos2.name = "protos" + 2;
        Protos protos3 = new Protos();
        protos3.name = "protos" + 3;
        Protos protos4 = new Protos();
        protos4.name = "protos" + 4;
        Protos protos5 = new Protos();
        protos5.name = "protos" + 5;

        Terran terran1 = new Terran();
        terran1.name = "terran" + 1;
        Terran terran2 = new Terran();
        terran2.name = "terran" + 2;
        Terran terran3 = new Terran();
        terran3.name = "terran" + 3;
        Terran terran4 = new Terran();
        terran4.name = "terran" + 4;
        Terran terran5 = new Terran();
        terran5.name = "terran" + 5;
        Terran terran6 = new Terran();
        terran6.name = "terran" + 6;
        Terran terran7 = new Terran();
        terran7.name = "terran" + 7;
        Terran terran8 = new Terran();
        terran8.name = "terran" + 8;
        Terran terran9 = new Terran();
        terran9.name = "terran" + 9;
        Terran terran10 = new Terran();
        terran10.name = "terran" + 10;
        Terran terran11 = new Terran();
        terran11.name = "terran" + 11;
        Terran terran12 = new Terran();
        terran12.name = "terran" + 12;

        System.out.println(1*2*3*4*5*6*7*8*9*10);
        System.out.println(1);
        System.out.println(1+2);
        System.out.println(1+2+3);
        System.out.println(1+2+3+4);
        System.out.println(1+2+3+4+5);
        System.out.println(1+2+3+4+5+6);
        System.out.println(1+2+3+4+5+6+7);
        System.out.println(1+2+3+4+5+6+7+8);
        System.out.println(1+2+3+4+5+6+7+8+9);
        System.out.println(1+2+3+4+5+6+7+8+9+10);

        //Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
        //Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.

        String mama = "Мама";
        String myla = "Мыла";
        String ramy = "Раму";
        System.out.println(mama+myla+ramy);
        System.out.println(mama+ramy+myla);
        System.out.println(myla+mama+ramy);
        System.out.println(myla+ramy+mama);
        System.out.println(ramy+myla+mama);
        System.out.println(ramy+mama+myla);

        //Выведи на экран таблицу умножения 10 на 10 в следующем виде...

        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int x4 = 4;
        int x5 = 5;
        int x6 = 6;
        int x7 = 7;
        int x8 = 8;
        int x9 = 9;
        int x10 = 10;
        System.out.println(x1+" "+x2+" "+x3+" "+x4+" "+x5+" "+x6+" "+x7+" "+x8+" "+x9+" "+x10);
        System.out.println(x1*x2+" "+x2*x2+" "+x3*x2+" "+x4*x2+" "+x5*x2+" "+x6*x2+" "+x7*x2+" "+x8*x2+" "+x9*x2+" "+x10*x2);
        System.out.println(x1*x3+" "+x2*x3+" "+x3*x3+" "+x4*x3+" "+x5*x3+" "+x6*x3+" "+x7*x3+" "+x8*x3+" "+x9*x3+" "+x10*x3);
        System.out.println(x1*x4+" "+x2*x4+" "+x3*x4+" "+x4*x4+" "+x5*x4+" "+x6*x4+" "+x7*x4+" "+x8*x4+" "+x9*x4+" "+x10*x4);
        System.out.println(x1*x5+" "+x2*x5+" "+x3*x5+" "+x4*x5+" "+x5*x5+" "+x6*x5+" "+x7*x5+" "+x8*x5+" "+x9*x5+" "+x10*x5);
        System.out.println(x1*x6+" "+x2*x6+" "+x3*x6+" "+x4*x6+" "+x5*x6+" "+x6*x6+" "+x7*x6+" "+x8*x6+" "+x9*x6+" "+x10*x6);
        System.out.println(x1*x7+" "+x2*x7+" "+x3*x7+" "+x4*x7+" "+x5*x7+" "+x6*x7+" "+x7*x7+" "+x8*x7+" "+x9*x7+" "+x10*x7);
        System.out.println(x1*x8+" "+x2*x8+" "+x3*x8+" "+x4*x8+" "+x5*x8+" "+x6*x8+" "+x7*x8+" "+x8*x8+" "+x9*x8+" "+x10*x8);
        System.out.println(x1*x9+" "+x2*x9+" "+x3*x9+" "+x4*x9+" "+x5*x9+" "+x6*x9+" "+x7*x9+" "+x8*x9+" "+x9*x9+" "+x10*x9);
        System.out.println(x1*x10+" "+x2*x10+" "+x3*x10+" "+x4*x10+" "+x5*x10+" "+x6*x10+" "+x7*x10+" "+x8*x10+" "+x9*x10+" "+x10*x10);

        /* Семь цветов радуги
        Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
        Каждый объект при создании выводит на экран определенный цвет.
        */
        Red red= new Red();

        Orange orange= new Orange();

        Yellow yellow= new Yellow();

        Green green= new Green();

        Blue blue= new Blue();

        Indigo indigo= new Indigo();

        Violet violet= new Violet();

        //Выведи на экран 日本語

        String japanese = "日本語";
        System.out.println(japanese);

    }
    public static class Zerg {
        public String name;
    }

    public static class Protos {
        public String name;
    }

    public static class Terran {
        public String name;
    }

    public static class Red {
        public Red(){
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange(){
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow(){
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green(){
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue(){
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo(){
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet(){
            System.out.println("Violet");
        }
    }

}

