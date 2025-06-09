class Computer {
    private String CPU;
    private String RAM;

    public static class Builder {
        private String CPU;
        private String RAM;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Computer build() {
            Computer c = new Computer();
            c.CPU = this.CPU;
            c.RAM = this.RAM;
            return c;
        }
    }

    public void show() {
        System.out.println("CPU: " + CPU + ", RAM: " + RAM);
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        Computer comp = new Computer.Builder().setCPU("i7").setRAM("16GB").build();
        comp.show();
    }
}