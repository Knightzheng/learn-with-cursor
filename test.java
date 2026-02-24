// 这是一个最基本的 Java 程序示例，演示常见语法：类、方法、变量、条件、循环等

// 定义一个公共类，类名必须和文件名 test.java 中的类名保持一致（区分大小写）
public class test {

    // main 方法是 Java 程序的入口，程序从这里开始执行
    public static void main(String[] args) {
        // 声明一个整型变量 age，并赋初始值 18
        int age = 18;

        // 声明一个双精度浮点数 height，并赋初始值 1.75（单位：米）
        double height = 1.75;

        // 声明一个布尔变量 isStudent，true 表示是学生
        boolean isStudent = true;

        // 声明一个字符串 name，表示姓名
        String name = "Alice";

        // 使用 System.out.println 输出变量的值到控制台并换行
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("身高: " + height);
        System.out.println("是否是学生: " + isStudent);

        // 使用 if-else 语句根据条件执行不同的代码
        if (age >= 18) {
            // 当 age 大于等于 18 时执行这里的语句
            System.out.println("已成年");
        } else {
            // 当 age 小于 18 时执行这里的语句
            System.out.println("未成年");
        }

        // 使用 for 循环，从 1 循环到 5（包含 5）
        for (int i = 1; i <= 5; i++) {
            // 循环体内每执行一次，就输出当前的 i 值
            System.out.println("for 循环第 " + i + " 次");
        }

        // 使用 while 循环，从 0 累加到小于 3
        int count = 0;                  // 定义计数器变量 count，初始值为 0
        while (count < 3) {             // 当 count 小于 3 时继续循环
            System.out.println("while 循环第 " + count + " 次");
            count++;                    // 每次循环后让 count 自增 1，避免死循环
        }

        // 调用同一个类中的静态方法 add，计算两个整数的和
        int sum = add(3, 5);            // 把 3 和 5 传给 add 方法，并接收返回结果
        System.out.println("3 + 5 = " + sum);

        // 调用计算平均值的方法，并接收返回的 double 结果
        double avg = average(10, 20);   // 计算 10 和 20 的平均值
        System.out.println("10 和 20 的平均值是: " + avg);

        // 演示数组：定义一个包含 3 个元素的整型数组
        int[] scores = {90, 85, 100};   // 使用大括号 {} 直接给数组赋初始值

        // 使用 for 循环遍历数组中的每个元素
        for (int i = 0; i < scores.length; i++) {
            // scores.length 表示数组的长度，这里是 3
            System.out.println("第 " + (i + 1) + " 门课的分数是: " + scores[i]);
        }

        // 调用打印问候语的方法
        sayHello(name);                 // 把 name 变量作为参数传入方法
    }

    // 定义一个静态方法 add，接收两个 int 参数，返回它们的和
    public static int add(int a, int b) {
        int result = a + b;             // 用局部变量 result 保存计算结果
        return result;                  // 使用 return 把结果返回给调用者
    }

    // 定义一个静态方法 average，接收两个 int 参数，返回 double 类型的平均值
    public static double average(int x, int y) {
        // 为了得到小数结果，需要先把整数转成 double 再相加
        double sum = (double) x + (double) y;
        double avg = sum / 2;          // 计算平均值
        return avg;                    // 返回平均值
    }

    // 定义一个静态方法 sayHello，用来打印问候语
    public static void sayHello(String name) {
        // 使用 + 运算符把字符串拼接起来
        System.out.println("你好, " + name + "，欢迎学习 Java！");
    }
}