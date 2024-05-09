public class OuterClass {
    private int outerData;

    // Constructor
    public OuterClass(int data) {
        this.outerData = data;
    }

    // Method untuk mendapatkan data dari inner class
    public int getOuterData() {
        return outerData;
    }

    // Inner class
    public class InnerClass {
        private int innerData;

        // Constructor
        public InnerClass(int data) {
            this.innerData = data;
        }

        // Method untuk menampilkan data dari inner class dan outer class
        public void displayData() {
            System.out.println("Inner Data: " + innerData);
            System.out.println("Outer Data: " + outerData);
        }
    }

    // Method untuk membuat instance dari inner class
    public InnerClass createInnerObject(int data) {
        return new InnerClass(data);
    }

    public static void main(String[] args) {
        // Membuat instance dari OuterClass
        OuterClass outerObject = new OuterClass(10);
        
        // Membuat instance dari InnerClass menggunakan method createInnerObject()
        OuterClass.InnerClass innerObject = outerObject.createInnerObject(20);

        // Memanggil method displayData() dari innerObject
        innerObject.displayData();
    }
}