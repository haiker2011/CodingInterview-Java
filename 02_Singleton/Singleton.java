public class Singleton{

      private Singleton(){
            
      }

      // 使用静态内部类，只有在调用 getInstance()时才会加载 SingletonHolder
      // 不仅有延迟的好处，而且由 JVM 提供了对线程安全的支持
      private static class SingletonHolder{
            private static final Singleton INSTANCE = new Singleton();
      }

      public static synchronized Singleton getInstance(){
           return SingletonHolder.INSTANCE;
      }



      public static void main(String[] args) {
            Singleton singleton = Singleton.getInstance();

      }
}