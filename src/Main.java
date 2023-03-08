public class Main {
    public static void main(String[] args) {
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "\n" +
                "        int eaters = 5; // сколько людей будут есть\n" +
                "\n" +
                "        int water = 3000; // миллилитров воды\n" +
                "        int potatoes = 5; // картофелин\n" +
                "        int chicken = 6; // куриных бёдер\n" +
                "        int spices = 10; // ложек специй\n" +
                "\n" +
                "        System.out.println(\"Сварили суп. На одного человека вышло:\");\n" +
                "        System.out.println((water / eaters) + \" миллилитров(а) воды\");\n" +
                "        System.out.println((potatoes / eaters) + \" картофелин(а/ы)\");\n" +
                "        System.out.println((chicken / eaters) + \" куриных(ое) бёдер(ро)\");\n" +
                "        System.out.println((spices / eaters) + \" ложек(ки/ка) специй\");\n" +
                "\n" +
                "    }\n" +
                "}");
    }
}