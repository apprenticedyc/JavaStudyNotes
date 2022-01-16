public class Boolean01 {
    public static void main(String[] args) {
        //定义一个布尔变量//布尔类型只允许取值true和false,无null类型,占1个字节
        boolean ifpass = true;
        if(ifpass == true){
            System.out.println("考试通过,恭喜");
        }else{
            System.out.println("考试没通过,sry");
        }
    }
}
//使用细节说明:不可以用0或非0的整数替代FALSE或TRUE,这点和C语言不同