server: remotemysql.com
user: q6YxYh8MkA
pass: OQXX2gxATv

3-layer:
presentation layer: Model - View - Controller (return view, return model cho view để hiển thị
dữ liệu)
business logic layer: service (tầng xử lý, return tầng DAO)
data access layer: dao

DAO: để có thể truy vấn với DB thì phát sinh tầng Data Access Object Design Pattern

Trong interface hiển nhiên (default) các thành phần của nó có access modifier là public

@Inject: khai báo thư viện Weld-Servlet in pom.xml, tạo beans.xml trong WEB-INF, gọi listener trong web.xml


1. Tại sao cần Interface của DAO?
--> Nguyên tắc SOLID, "Dependency Inversion hay là Dependency Injection"?, tránh sự phụ thuộc của 2 bên
high level ~ controller - low level ~ service (1 trong 2 thay đổi thì sẽ không ảnh hưởng đến nhau)
https://stackify.com/dependency-inversion-principle/
https://www.journaldev.com/2394/java-dependency-injection-design-pattern-example-tutorial
2. Access Modifier (phạm vi truy cập)
3. Kết quả của JDBC trả về là gì?
4. Có trường hợp Service chỉ gọi đúng hàm trong DAO vậy tại sao không gọi trong Controller?
--> Nguyên tắc SOLID, "Single Responsibility",
5. Statement vs PreparedStatement ?
--> PreparedStatement có tham số
https://javarevisited.blogspot.com/2012/08/top-10-jdbc-best-practices-for-java.html#axzz7XFNGKOs3
6. @Inject để làm gì?
--> Giảm bớt new instance. Giả sử có nhiều class implements 1 Interface thì sẽ phải gọi nhiều, còn @Inject
thì 1 lần, nó sẽ tự tìm hàm ở các class implements
VD:
Trong CategoryService:
Giả sử có nhiều class implements ICategoryDAO, thì với cách làm thông thường:
"
private ICategoryDAO categoryDAO;
private ICategoryDAO categoryDAO1;
private ICategoryDAO categoryDAO2;
...
public CategoryService(){
    categoryDAO = new CategoryDAO();
    categoryDAO1 = new CategoryDAO();
    categoryDAO2 = new CategoryDAO();
    ...
}
"
Nhưng với cách @Inject:
"
@Inject
private ICategoryDAO categoryDAO;
"
--> Request thứ nhất vào trang chủ tạo 1 NewsService bỏ vào beans, request thứ hai vào trang chủ,
Servlet Weld sẽ vào beans (container) đã tồn tại chưa, có thì lấy ra không thì tạo mới
