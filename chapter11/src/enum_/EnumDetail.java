package enum_;

/**
 * @author Hex
 * @version 17
 */
public class EnumDetail {
    public static void main(String[] args) {
        Hamu.Azi.clap();
    }
}

interface Chusheng {
    public void clap();
}

//枚举类可以实现接口但不能继承其他类
enum Hamu implements Chusheng {
    Azi, Xiaoke, Qihai;

    @Override
    public void clap() {
        System.out.println("hamuhamu~");
    }
}