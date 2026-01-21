package 枚举;

public enum e {
//    枚举类中定义的每个常量，编译器都会自动为其添加 public static final 修饰，
//    枚举常量	默认 public static final	枚举类名。常量名	全局静态、类加载时创建、唯一实例、不可修改
//    静态方法	static 修饰	枚举类名。方法名	访问静态成员、工具方法场景
//    实例方法	无 static 修饰	枚举常量。方法名	访问实例 / 静态成员、多态实现场景
//    默认静态方法	编译器自动生成（static）	枚举类名。方法名（values/valueOf）	遍历常量、根据名称获取常量
    A(){
        @Override
      public void job()
       {
           System.out.println("student");
       }
    },

    B(){
        @Override
       public void job()
        {
            System.out.println("teacher");
        }

    };
    public abstract void job();

//    e() {
//    }
}
