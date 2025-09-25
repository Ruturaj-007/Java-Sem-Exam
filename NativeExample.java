package sem_exm;

class NativeExample {
    static {
        System.loadLibrary("mylib");
    }
    public native void display();
}

class Tests {
    public static void main(String[] args) {
        NativeExample obj = new NativeExample();
        obj.display();
    }
}
