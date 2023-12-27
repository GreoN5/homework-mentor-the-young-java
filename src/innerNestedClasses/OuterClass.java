package innerNestedClasses;

class OuterClass {
    class InnerClass {
        private String name;

         InnerClass(String name) {
            super();
            this.name = name;
        }
    }
    static class StaticNestedClass {
        public static String name = "Fernando";

        static String getName() {
            return name;
        }
    }
}
