package company;

public class ObjectSample {

    public static void main(String[] args) {
       //インスタンス作成
        var salesDepartment = new Department("営業部", "xx",1000000);
        var sales = new Sales("鈴木", salesDepartment, "課長", 100);

        //メソッド呼び出し
        sales.report(1);
        sales.report(2);
        sales.joinMeeting();
        
        //一行空ける
        System.out.println("");
        
        //インスタンス作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員", 88, "Java");
        
        //メソッド呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        //ポリモーフィズム確認
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        
      //一行空ける
        System.out.println("");
        
        //メソッド
        projectManager.report();
        projectManager.joinMeeting();
        if(projectManager instanceof Engineer) {
            ((Engineer) projectManager).developSoftware();
        }
        
      //一行空ける
        System.out.println("");
        
        //アルバイトインスタンス
        var parttimeWorker = new ParttimeWorker("太田", salesDepartment);
        
        //メソッド呼び出し
        sales.work();
        engineer.work();
        projectManager.work();
        parttimeWorker.work();        
    }

}
